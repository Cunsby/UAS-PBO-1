package rental_ps;

public class Member extends Pelanggan {

    public Member(String nama, int umur, int lamaSewa) {
        super(nama, umur, lamaSewa);
    }

    @Override
    public double hitungBiaya() {
        return getLamaSewa() * 5000 * 0.9;
    }

    @Override
    public void tampilData() {
        System.out.println("=== MEMBER ===");
        super.tampilData();
        System.out.println("Diskon Member : 10%");
    }
}
