package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Sesi 7 — KOMPOSISI.
 *
 * Tiga hal yang membuat sebuah relasi benar-benar komposisi:
 *   1. tidak ada constructor atau method yang MENERIMA objek bagian dari luar
 *   2. objek bagian dibuat DI DALAM induk
 *   3. getter mengembalikan salinan yang tidak bisa diubah
 *
 * Lengkapi TODO sehingga ketiganya terpenuhi.
 */
public class Buku {

    /**
     * Bab adalah BAGIAN dari Buku — kelasnya bersarang untuk menegaskan itu,
     * dan constructor-nya privat agar hanya Buku yang boleh membuatnya.
     */
    public static final class Bab {
        private final int nomor;
        private final String judul;

        private Bab(int nomor, String judul) {
            this.nomor = nomor;
            this.judul = judul;
        }

        public String getJudul() { return judul; }
        public int getNomor()    { return nomor; }

        @Override public String toString() { return "Bab " + nomor + ": " + judul; }
    }
    private final String nomorInduk;
    private final String judul;
    private final String penulis;
    private int jumlahEksemplar;

    private final List<Bab> bab = new ArrayList<>();

    public Buku(String nomorInduk, String judul, String penulis, int jumlahEksemplar) {
        // TODO 1: tolak jumlah eksemplar negatif.
        if (jumlahEksemplar < 0) {
            throw new IllegalArgumentException("Jumlah eksemplar tidak boleh negatif.");
        }
        this.nomorInduk = nomorInduk;
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahEksemplar = jumlahEksemplar;
    }

    /**
     * TODO 3: kembalikan salinan yang tidak bisa diubah.
     *         Petunjuk: List.copyOf(...)
     *         Coba dulu mengembalikan `bab` apa adanya, jalankan bukti-relasi.md
     *         percobaan 1, lalu perbaiki. Rasakan bedanya.
     */
    public List<Bab> getBab() {
        return List.copyOf(bab);
    }

    public String getJudul()        { return judul; }

    public int getJumlahEksemplar() { return jumlahEksemplar; }

    public String getNomorInduk()   { return nomorInduk; }

    /** TODO 4: kurangi stok; tolak bila sudah nol. */
    public void kurangiStok() {
        if (jumlahEksemplar <= 0) {
            throw new IllegalStateException("Stok buku sudah nol, tidak bisa dikurangi.");
        }
        jumlahEksemplar--;
    }
    /**
     * TODO 2: satu-satunya cara Bab lahir.
     *         Perhatikan: parameternya nomor dan judul, BUKAN objek Bab.
     *         Kalau Anda menerima objek Bab dari luar, ini menjadi agregasi.
     */
    public void tambahBab(int nomor, String judulBab) {
        this.bab.add(new Bab(nomor, judulBab));
    }
    public void tambahStok() { jumlahEksemplar++; }

    public boolean tersedia() { return jumlahEksemplar > 0; }

    @Override
    public String toString() {
        return String.format("%-32s %-16s [%d eks, %d bab]",
                judul, penulis, jumlahEksemplar, bab.size());
    }
}