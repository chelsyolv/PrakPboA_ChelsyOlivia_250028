package starter.java;

public class PegawaiKontrak extends Pegawai {
    private int jumlahJamLembur;
    private double honorLemburPerJam;

    public PegawaiKontrak(String nama, String nip, double gajiPokok, int jumlahJamLembur, double honorLemburPerJam) {
        super(nama, nip, gajiPokok);
        if (jumlahJamLembur < 0 || honorLemburPerJam < 0) {
            throw new IllegalArgumentException("Jam atau honor lembur tidak boleh negatif.");
        }
        this.jumlahJamLembur = jumlahJamLembur;
        this.honorLemburPerJam = honorLemburPerJam;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + (this.jumlahJamLembur * this.honorLemburPerJam);
    }
}