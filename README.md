Pertanyaan No. 1
1. Tidak
2. Daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()
3. Program dapat disusun secara lebih terstruktur dan lebih efektif
4. Program mulai dari main. Program meminta nama dan status member. Setelah data diterima, main memanggil Menu(namaPelanggan, isMember). Eksekusi berpindah ke fungsi Menu(). Menu() menampilkan sapaan sesuai nama dan status member. Menu() mencetak daftar menu ke layar. Setelah selesai, eksekusi kembali ke main. Main lanjut ke proses berikutnya seperti input pilihan menu dan jumlah item.

Pertanyaan No. 2
1. Parameter berperan sebagai input untuk fungsi. Fungsi memerlukan parameter ketika fungsi tersebut membutuhkan data yang asalnya dari luar fungsi untuk diolah dalam fungsi.
2. namaPelanggan: Fungsi perlu menerima nama yang dimasukkan di main supaya bisa menampilkan sapaan yang sesuai. Nama harus dikirim dari main ke Menu() melalui parameter.
   isMember: Fungsi perlu mengetahui apakah pengguna adalah member. Dipakai untuk menampilkan pesan diskon. Nilai status member dikirim melalui parameter isMember.
3. Tidak. Parameter termasuk jenis variabel. Perbedaannya terletak pada tujuan dan lokasi deklarasi. Parameter berisi nilai kiriman dari pemanggil. Variabel biasa digunakan untuk menyimpan data selama program berjalan.
4. Parameter isMember bekerja sebagai penanda apakah pengguna terdaftar sebagai member atau bukan. Nilai isMember dikirim dari main ke fungsi Menu() saat fungsi dipanggil. Fungsi Menu() membaca nilai tersebut untuk menentukan apakah perlu menampilkan pesan diskon. Jika isMember bernilai true. Fungsi menampilkan pesan bahwa pengguna mendapat diskon 10 persen. Jika isMember bernilai false. Fungsi tidak menampilkan pesan diskon.
5. Terjadi error.
8. Ya. Fungsi bisa dipakai untuk banyak pelanggan dengan kondisi berbeda tanpa mengubah isi fungsi, fungsi Menu() tidak bergantung pada nilai tetap, cukup merubah fungsi jika dibutuhkan perubahan kode program.
