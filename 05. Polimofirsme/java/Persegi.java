package starter.java;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        if (sisi < 0) {
            throw new IllegalArgumentException("Sisi tidak boleh negatif.");
        }
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return this.sisi * this.sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * this.sisi;
    }
}