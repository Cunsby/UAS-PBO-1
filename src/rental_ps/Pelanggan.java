package rental_ps;

public class Pelanggan {

    private String nama;
    private int umur;
    private int lamaSewa;

    // Constructor
    

    public void setUmur(int umur) {
        this.umur = umur;
    }public Pelanggan(String nama, int umur, int lamaSewa) {
        this.nama = nama;
        this.umur = umur;
        this.lamaSewa = lamaSewa;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }


    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    // Method
    public double hitungBiaya() {
        return lamaSewa * 5000;
    }

    public void tampilData() {
        System.out.println("Nama      : " + nama);
        System.out.println("Umur      : " + umur);
        System.out.println("Lama Sewa : " + lamaSewa + " jam");
        System.out.println("Biaya     : Rp" + hitungBiaya());
    }
}
