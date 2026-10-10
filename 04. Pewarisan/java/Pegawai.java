package starter.java;

public class Pegawai {
    protected String nama;
    protected String nip;
    protected double gajiPokok;

    public Pegawai(String nama, String nip, double gajiPokok) {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong.");
        }
        if (nip == null || nip.trim().isEmpty()) {
            throw new IllegalArgumentException("NIP tidak boleh kosong.");
        }
        if (gajiPokok < 0) {
            throw new IllegalArgumentException("Gaji pokok tidak boleh negatif.");
        }
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
    }

    public double hitungGaji() {
        return this.gajiPokok;
    }

    public String getNama() { return nama; }
    public String getNip() { return nip; }
    public double getGajiPokok() { return gajiPokok; }
}