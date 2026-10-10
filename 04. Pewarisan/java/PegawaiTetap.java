package starter.java;

public class PegawaiTetap extends Pegawai {
    private double tunjangan;

    public PegawaiTetap(String nama, String nip, double gajiPokok, double tunjangan) {
        super(nama, nip, gajiPokok);
        if (tunjangan < 0) {
            throw new IllegalArgumentException("Tunjangan tidak boleh negatif.");
        }
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + this.tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }
}