# Modul 01: Penyiapan Lingkungan Pengembangan & Dasar Objek
Praktikum Pemrograman Berorientasi Objek (PBO) mengenai pengenalan struktur direktori, kompilasi file Java, dan dasar pembuatan kelas serta enkapsulasi sederhana pada Java dan PHP.
## Daftar File
- `Mahasiswa.java`: Kelas dengan atribut enkapsulasi dasar (NIM, Nama, Nilai).
- `HaloObjek.php`: Skrip dasar OOP PHP untuk pengenalan constructor dan properti privat.


# Modul 02: Kelas, Objek, dan Enkapsulasi
Praktikum mengenai penerapan prinsip enkapsulasi (*information hiding*), penggunaan *access modifier* `private`, serta validasi data masukan melalui *constructor* dan *helper method*.
## Poin Utama
- Atribut bersifat `private` atau `protected` untuk menjaga integritas data.
- Validasi ketat (penolakan nilai kosong/null dan rentang angka yang tidak valid).
- Penerapan *getter* dan *setter* secara tepat.

# Modul 03: Constructor, Anggota Statis, dan Konstanta
Praktikum mengenai penggunaan konstanta, delegasi *constructor* `this(...)`, pengelolaan variabel statis penghitung objek, serta pembuatan method statis utilitas.
## Poin Utama
- Penggunaan konstanta untuk menghindari *magic numbers*.
- Field statis untuk menghitung total instansiasi objek secara global.
- Implementasi method utilitas yang dapat dipanggil tanpa instansiasi objek.

# Modul 04: Pewarisan (Inheritance)
Praktikum mengenai konsep pewarisan sifat dari *superclass* ke *subclass*, pemanggilan `super(...)` pada *constructor*, serta *method overriding* untuk memodifikasi perilaku method.
## Daftar Kelas
- `Pegawai.java`: Superclass utama atribut pegawai dan gaji pokok.
- `PegawaiTetap.java`: Subclass dengan tambahan tunjangan tetap.
- `PegawaiKontrak.java`: Subclass dengan tambahan perhitungan honor lembur.

# Modul 05: Polimorfisme
Praktikum mengenai penerapan konsep polimorfisme melalui *abstract class*, *method overriding*, serta penggunaan referensi *superclass* untuk menampung berbagai macam objek turunan (*dynamic method dispatch*).
## Daftar Kelas
- `BangunDatar.java`: Abstract class utama sebagai kontrak method luas dan keliling.
- `Lingkaran.java` & `Persegi.java`: Implementasi konkret perhitungan geometri.

# Modul 06: Abstract Class, Interface, Enum, dan Trait
Praktikum komprehensif mengenai penerapan *abstract class*, *interface*, pewarisan jamak melalui *trait* (di PHP), serta perhitungan umur dan manipulasi objek kendaraan.
## Fitur Utama
- Kontrak method ketat melalui *interface* dan *abstract class*.
- Logika perhitungan umur kendaraan yang aman dari nilai negatif (`Math.max`).
- Implementasi *toString* kustom untuk representasi data objek yang rapi.
