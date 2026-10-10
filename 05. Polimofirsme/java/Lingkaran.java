package starter.java;

public class Lingkaran extends BangunDatar {
    private double r;

    public Lingkaran(double r) {
        if (r < 0) {
            throw new IllegalArgumentException("Jari-jari tidak boleh negatif.");
        }
        this.r = r;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * r * r;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * r;
    }
}