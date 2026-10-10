<?php

class RekeningBank {
    // TODO 1: Definisikan konstanta kelas untuk angka-angka (bunga, biaya admin, batas penarikan)
    public const float BUNGA_TAHUNAN = 0.025;
    public const float BIAYA_ADMINISTRASI = 5000;
    public const float BATAS_PENARIKAN = 5000000;

    // TODO 2: Deklarasikan properti statis untuk menghitung jumlah rekening (private, static, nilai awal 0)
    private static int $jumlahRekening = 0;

    private string $nomor;
    private string $pemilik;
    private float $saldo;

    // Constructor lengkap (atau constructor utama)
    public function __construct(string $nomor, string $pemilik, float $saldoAwal = 0.0) {
        // TODO 4 (dan validasi): Tolak nomor kosong dan saldo awal negatif
        if (trim($nomor) === '') {
            throw new InvalidArgumentException("Nomor rekening tidak boleh kosong.");
        }
        if ($saldoAwal < 0) {
            throw new InvalidArgumentException("Saldo awal tidak boleh negatif.");
        }

        $this->nomor = $nomor;
        $this->pemilik = $pemilik;
        $this->saldo = $saldoAwal;

        // TODO 5: Naikkan penghitung jumlah rekening di constructor utama
        self::$jumlahRekening++;
    }

    public function setor(float $jumlah): void {
        // TODO 6: Tolak jumlah <= 0, lalu tambahkan ke saldo
        if ($jumlah <= 0) {
            throw new InvalidArgumentException("Jumlah setoran harus lebih dari 0.");
        }
        $this->saldo += $jumlah;
    }

    public function tarik(float $jumlah): void {
        // TODO 7: Tolak jumlah <= 0, jika melebihi saldo, atau melebihi batas penarikan
        if ($jumlah <= 0) {
            throw new InvalidArgumentException("Jumlah penarikan harus lebih dari 0.");
        }
        if ($jumlah > $this->saldo) {
            throw new InvalidArgumentException("Saldo tidak mencukupi.");
        }
        if ($jumlah > self::BATAS_PENARIKAN) {
            throw new InvalidArgumentException("Melebihi batas penarikan sekali transaksi.");
        }
        $this->saldo -= $jumlah;
    }

    // TODO 8: Kurangi saldo sebesar biaya administrasi, tapi jangan sampai negatif
    public function potongBiayaAdmin(): void {
        $this->saldo -= self::BIAYA_ADMINISTRASI;
        if ($this->saldo < 0) {
            $this->saldo = 0.0;
        }
    }

    // TODO 9: Method statis untuk mengembalikan jumlah rekening yang pernah dibuat
    public static function getJumlahRekening(): int {
        return self::$jumlahRekening;
    }

    // TODO 10: Method statis utilitas untuk menghitung bunga setahun dari pokok
    public static function bungaSetahun(float $pokok): float {
        return $pokok * self::BUNGA_TAHUNAN;
    }

    public function getSaldo(): float {
        return $this->saldo;
    }

    public function getNomor(): string {
        return $this->nomor;
    }
}