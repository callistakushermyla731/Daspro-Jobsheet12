Pertanyaan Percobaan 1
1. Tidak
2. Daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()
3. Program dapat disusun secara lebih terstruktur dan lebih efektif
4. Program mulai dari main. Program meminta nama dan status member. Setelah data diterima, main memanggil Menu(namaPelanggan, isMember). Eksekusi berpindah ke fungsi Menu(). Menu() menampilkan sapaan sesuai nama dan status member. Menu() mencetak daftar menu ke layar. Setelah selesai, eksekusi kembali ke main. Main lanjut ke proses berikutnya seperti input pilihan menu dan jumlah item.

Pertanyaan Percobaan 2
1. Parameter berperan sebagai input untuk fungsi. Fungsi memerlukan parameter ketika fungsi tersebut membutuhkan data yang asalnya dari luar fungsi untuk diolah dalam fungsi.
2. namaPelanggan: Fungsi perlu menerima nama yang dimasukkan di main supaya bisa menampilkan sapaan yang sesuai. Nama harus dikirim dari main ke Menu() melalui parameter.
   isMember: Fungsi perlu mengetahui apakah pengguna adalah member. Dipakai untuk menampilkan pesan diskon. Nilai status member dikirim melalui parameter isMember.
3. Tidak. Parameter termasuk jenis variabel. Perbedaannya terletak pada tujuan dan lokasi deklarasi. Parameter berisi nilai kiriman dari pemanggil. Variabel biasa digunakan untuk menyimpan data selama program berjalan.
4. Parameter isMember bekerja sebagai penanda apakah pengguna terdaftar sebagai member atau bukan. Nilai isMember dikirim dari main ke fungsi Menu() saat fungsi dipanggil. Fungsi Menu() membaca nilai tersebut untuk menentukan apakah perlu menampilkan pesan diskon. Jika isMember bernilai true. Fungsi menampilkan pesan bahwa pengguna mendapat diskon 10 persen. Jika isMember bernilai false. Fungsi tidak menampilkan pesan diskon.
5. Terjadi error.
8. Ya. Fungsi bisa dipakai untuk banyak pelanggan dengan kondisi berbeda tanpa mengubah isi fungsi, fungsi Menu() tidak bergantung pada nilai tetap, cukup merubah fungsi jika dibutuhkan perubahan kode program.

Pertanyaan Percobaan 3
1. Fungsi membutuhkan nilai kembalian ketika fungsi harus menghasilkan suatu hasil yang akan dipakai kembali oleh bagian lain dari program.
   contoh : public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
   Fungsi tidak perlu mengembalikan nilai ketika tugasnya hanya menampilkan informasi atau menjalankan proses tanpa memberikan hasil ke pemanggil.
   contoh: public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + ".");
2. Tipe data nilai kembalian adalah int.
   a). pilihanMenu bertipe int: berisi nomor menu yang dipilih pelanggan, dipakai untuk menentukan harga item dari array harga.
   b). jumlahPesanan bertipe int: berisi jumlah item yang dipesan, dipakai untuk menghitung total harga dengan mengalikan harga menu dengan jumlah pesanan.

Pertanyaan Percobaan 4
1. Fungsi menerima jumlah data yang tidak tetap, dapat menginput 1 nama, 3 nama, atau 10 nama tanpa membuat array secara manual.
3. Bisa. Namun dalam 1 method hanya hanya boleh ada satu parameter varargs.
4. namaPengunjung akan otomatis menjadi array kosong, perulangan for-each tidak menampilkan apa pun, tidak ada error saat kompilasi, program tetap berjalan.
   Output yang dihasilkan.
   Daftar Nama Pengunjung:
   (tidak ada nama yang tampil karena array kosong)

Pertanyaan Percobaan 5
1. - Program mulai menjalankan fungsi main.
   - Objek Scanner dibuat untuk membaca input.
   - Program meminta panjang. Nilai disimpan ke variabel p.
   - Program meminta lebar. Nilai disimpan ke variabel l.
   - Program meminta tinggi. Nilai disimpan ke variabel t.
   - Program menghitung luas persegi panjang menggunakan rumus p*l. Hasil disimpan ke variabel L.
   - Program menampilkan teks "Luas persegi panjang adalah" lalu menampilkan nilai L.
   - Program menghitung volume balok menggunakan rumus p*L*t. Hasil disimpan ke variabel vol.
   - Program menampilkan teks "Volume balok adalah" lalu menampilkan nilai vol.
2. - Program meminta tiga input. Pengguna memasukkan 4, 3, dan 5.
   - Program menghitung luas dengan rumus p*l. Nilai 4*3 menghasilkan 12.
   - Program menampilkan luas.
   - Program menghitung volume dengan rumus p*L*t. Nilai 4*12*5 menghasilkan 240.
   - Program menampilkan volume.
   Output program:
   Luas persegi panjang adalah 12
   Volume balok adalah 240
3. Output program: 12345
   Alur:
   - Program mulai dari fungsi main.
   - Program memanggil fungsi Jumlah(1, 1). Hasil perhitungan 1+1 menghasilkan 2. Nilai ini disimpan ke variabel temp.
   - Program memanggil fungsi TampilJumlah(temp, 5). Argumen yang dikirim adalah 2 dan 5.
   - Di dalam TampilJumlah, program memanggil fungsi Jumlah(2, 5). Hasil perhitungan 2+5 menghasilkan 7.
   - Fungsi TampilJumlah memanggil TampilHinggaKei(7).
   - TampilHinggaKei menampilkan angka dari 1 sampai 7 tanpa spasi.
   - Output yang muncul adalah 1234567.
   Output berhenti di angka 5 karena fungsi TampilJumlah tidak mengirim hasil penjumlahan, yang dikirim hanya bil2, yaitu 5.
4. Fungsi perlu parameter saat fungsi membutuhkan data dari luar untuk diproses. Contoh: hitungTotalHarga(pilihanMenu, jumlahItem) perlu dua data tersebut untuk menghitung harga.
   Jika fungsi tidak butuh data dari luar, maka tidak perlu parameter. Contoh: fungsi tampilJudul() hanya mencetak teks. Tidak butuh input.
   Fungsi perlu nilai kembalian saat fungsi menghasilkan suatu nilai yang harus dipakai kembali oleh bagian program lain. Contoh: hitungLuas(p, l) mengembalikan luas supaya bisa dipakai menghitung volume.
   Fungsi tidak perlu nilai kembalian saat fungsi hanya melakukan aksi tanpa menghasilkan nilai. Contoh: tampilMenu() hanya mencetak daftar menu. Tidak ada hasil yang perlu dikembalikan.
5. Fungsi sebaiknya memakai parameter ketika fungsi membutuhkan data dari luar untuk dihitung. Pada Percobaan 5, fungsi hitungLuas memakai parameter pjg dan lb karena fungsi tidak bisa menghitung luas tanpa dua nilai tersebut. Fungsi hitungVolume juga memakai parameter tinggi, a, dan b karena volume bergantung pada tiga nilai tersebut. Semua nilai diberikan saat fungsi dipanggil.
   Fungsi boleh tanpa parameter jika fungsi tidak membutuhkan data apa pun dari luar. Misalnya, jika ada fungsi yang hanya menampilkan teks atau hanya memproses data yang sudah ada di dalam fungsi. Pada Percobaan 5 tidak ada fungsi seperti itu, karena semua fungsi perhitungan membutuhkan nilai dari luar. Jika tidak memakai parameter, fungsi tidak bisa menghitung apa pun.
6. - Fungsi hitungLuas memakai return value karena fungsi ini menghitung luas dan hasilnya dipakai lagi untuk menghitung volume. Hasil perhitungan harus dikembalikan ke pemanggil.
   - Fungsi hitungVolume memakai return value karena fungsi ini menghitung volume balok. Hasil perhitungannya juga diperlukan oleh pemanggil. Fungsi harus mengembalikan angka volume.
   - Fungsi main tidak memakai return value karena fungsi ini tidak perlu mengembalikan nilai apa pun ke fungsi lain. Tugasnya hanya menjalankan program, membaca input, memanggil fungsi perhitungan, dan menampilkan hasil.




