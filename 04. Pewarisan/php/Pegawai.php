<?php

class Pegawai {
    protected string $nama;
    protected string $nip;
    protected float $gajiPokok;

    public function __construct(string $nama, string $nip, float $gajiPokok) {
        if (trim($nama) === '' || trim($nip) === '') {
            throw new InvalidArgumentException("Nama dan NIP tidak boleh kosong.");
        }
        if ($gajiPokok < 0) {
            throw new InvalidArgumentException("Gaji pokok tidak boleh negatif.");
        }
        $this->nama = $nama;
        $this->nip = $nip;
        $this->gajiPokok = $gajiPokok;
    }

    public function hitungGaji(): float {
        return $this->gajiPokok;
    }

    public function getNama(): string { return $this->nama; }
    public function getNip(): string { return $this->nip; }
}

class PegawaiTetap extends Pegawai {
    private float $tunjangan;

    public function __construct(string $nama, string $nip, float $gajiPokok, float $tunjangan) {
        parent::__construct($nama, $nip, $gajiPokok);
        if ($tunjangan < 0) {
            throw new InvalidArgumentException("Tunjangan tidak boleh negatif.");
        }
        $this->tunjangan = $tunjangan;
    }

    public function hitungGaji(): float {
        return parent::hitungGaji() + $this->tunjangan;
    }
}