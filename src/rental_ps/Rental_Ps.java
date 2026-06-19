package rental_ps;

import java.util.Scanner;

public class Rental_Ps {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Jumlah Pelanggan: ");
            int jumlah = input.nextInt();
            input.nextLine();

            Pelanggan[] pelanggan = new Pelanggan[jumlah];

            for (int i = 0; i < jumlah; i++) {

                System.out.println("\nData Pelanggan ke-" + (i + 1));

                System.out.print("Nama : ");
                String nama = input.nextLine();

                System.out.print("Umur : ");
                int umur = input.nextInt();

                System.out.print("Lama Sewa (jam): ");
                int lama = input.nextInt();
                input.nextLine();

                System.out.print("Member? (y/n): ");
                String status = input.nextLine();

                if (status.equalsIgnoreCase("y")) {
                    pelanggan[i] = new Member(nama, umur, lama);
                } else {
                    pelanggan[i] = new Pelanggan(nama, umur, lama);
                }
            }

            System.out.println("\n=== DATA PELANGGAN ===");

            for (int i = 0; i < pelanggan.length; i++) {
                pelanggan[i].tampilData();
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
        }
    }
}
