# Laporan Tugas1

## Bagian 1 – Analisis Sistem

### Class, Atribut, Method

| Class       | Atribut                                                   | Method            |
|------------|----------------------------------------------------------|------------------|
| Mahasiswa  | nim, nama                                                | tampilkan()      |
| Room       | room_id, room_name                                       | tampilkanRoom()  |
| Auditorium | kapasitasx                                               | tampilkanRoom()  |
| Kelas      | kapasitas                                                | tampilkanRoom()  |
| Schedule   | id, mahasiswa, room, jam_mulai, jam_selesai,tanggal      | tampilkan()      |

### Analisis Sistem

Sistem ini digunakan untuk mengelola peminjaman ruangan oleh mahasiswa, dengan tujuan mempermudah pencatatan, mengatur jadwal penggunaan ruangan, serta menghindari bentrok waktu pemakaian. Sistem ini juga membantu dalam mengetahui siapa yang meminjam ruangan dan kapan ruangan tersebut digunakan. Ada berapa class utama yaitu Mahasiswa, Room, dan Schedule.

### Hubungan antar Class

1. Hubungan Mahasiswa dengan Schedule

Class Mahasiswa memiliki hubungan dengan class Schedule berupa association. Hal ini karena setiap mahasiswa dapat melakukan peminjaman ruangan yang dicatat dalam bentuk jadwal.Satu objek Mahasiswa dapat memiliki satu atau lebih Schedule, sedangkan setiap Schedule hanya berhubungan dengan satu Mahasiswa. Dengan demikian, Schedule menyimpan data mahasiswa yang melakukan peminjaman.

2. Hubungan Schedule dengan Room

Class Schedule juga memiliki hubungan dengan class Room. Hubungan ini menunjukkan bahwa setiap jadwal peminjaman pasti menggunakan satu ruangan tertentu.Satu Schedule hanya menggunakan satu Room, namun satu Room dapat digunakan dalam beberapa Schedule pada waktu yang berbeda. Oleh karena itu, Schedule berfungsi sebagai penghubung antara Mahasiswa dan Room.

3. Hubungan Room dengan Auditorium dan Kelas 

Class Room memiliki hubungan pewarisan (inheritance) dengan subclass Auditorium dan Kelas. Hal ini berarti Auditorium dan Kelas merupakan turunan dari Room.Sebagai subclass, Auditorium dan Kelas mewarisi atribut seperti room_id dan room_name, serta method tampilkanRoom() dari class Room. Selain itu, kedua subclass memiliki atribut tambahan yaitu

### Atribut dan method yang digunakan

• Pada class Mahasiswa, atribut nim dan nama digunakan sebagai identitas mahasiswa dalam sistem. Atribut ini penting agar setiap mahasiswa dapat dibedakan satu sama lain. Method tampilkan() digunakan untuk menampilkan informasi mahasiswa secara sederhana dan jelas.

• Pada class Room, atribut room_id dan room_name digunakan untuk menyimpan identitas ruangan. Atribut ini membantu dalam membedakan setiap ruangan yang tersedia. Method tampilkanRoom() digunakan untuk menampilkan informasi dasar mengenai ruangan.

• Pada class Auditorium, atribut kapasitas ditambahkan untuk menunjukkan jumlah maksimal orang yang dapat ditampung dalam ruangan auditorium. Method tampilkanRoom() dapat digunakan untuk menampilkan informasi ruangan beserta kapasitasnya.

• Pada class Kelas, atribut kapasitas juga digunakan untuk menunjukkan daya tampung ruangan kelas. Method tampilkanRoom() berfungsi untuk menampilkan informasi ruangan secara lengkap, termasuk kapasitas yang dimiliki.

• Pada class Schedule, atribut seperti id, mahasiswa, room, jam_mulai, dan jam_selesai digunakan untuk mencatat data peminjaman ruangan. Atribut ini membantu dalam mengetahui siapa yang meminjam, ruangan yang digunakan, serta waktu penggunaannya. Method tampilkan() digunakan untuk menampilkan seluruh informasi jadwal agar mudah dipahami.

---

## Bagian 2 – Desain Class Diagram

---

## Bagian 3 – Implementasi Programn Java

class dan object.  
Class seperti Mahasiswa, Room, dan Schedule adalah cetakan. Saat dipakai (new), jadilah object yang menyimpan data seperti NIM, nama, atau jadwal.

atribut dan method.  
Atribut adalah data, misalnya:

nim, nama pada Mahasiswa 

jam_mulai, jam_selesai pada Schedule 

Method adalah fungsi, misalnya:

tampilkan() untuk menampilkan data 

inputMahasiswa() untuk input data 

encapsulation.  
Data dan method digabung dalam satu class. Contohnya class Mahasiswa punya data dan juga method untuk menampilkan datanya.

inheritance (pewarisan).  
Class Auditorium dan Kelas mewarisi dari Room. Jadi tidak perlu menulis ulang atribut yang sama seperti room_id.

polymorphism.  
Method tampilkanRoom() ada di beberapa class, tapi hasilnya berbeda karena di-override sesuai jenis ruangan.

relasi antar object.  
Class Schedule memiliki:

Mahasiswa 

Room  

Artinya satu jadwal berhubungan dengan satu mahasiswa dan satu ruangan. 

program juga menggunakan:

ArrayList untuk menyimpan banyak data 

if dan loop untuk logika seperti cek bentrok jadwal

---

## Bagian 4 – Analisis Konsep PBO

1. Konsep class dan object  
Class itu ibarat cetakan atau blueprint. Di program ini contohnya ada Mahasiswa, Room, dan Schedule. Nah, object itu hasil dari class tersebut saat dipakai di program. Misalnya waktu user masukin data mahasiswa, itu berarti kita lagi bikin object dari class Mahasiswa. Jadi gampangnya, class itu desainnya, object itu wujud nyatanya yang dipakai buat nyimpen data.

2. Enkapsulasi  
Enkapsulasi bisa dilihat dari tiap class yang sudah ngumpulin data dan fungsi jadi satu. Misalnya di class Mahasiswa, ada nim dan nama, terus ada method buat nampilin datanya. Jadi semua yang berhubungan sama mahasiswa sudah ada di satu tempat, nggak nyebar ke mana-mana. Ini bikin kode lebih gampang dipahami.

3. Alasan PBO lebih baik  
Menurut saya PBO lebih enak dipakai karena program jadi lebih terstruktur. Setiap bagian punya peran masing-masing, jadi nggak campur aduk. Selain itu, kalau mau nambah fitur juga lebih gampang. Dengan konsep seperti pewarisan, kita juga bisa pakai ulang kode yang sudah ada tanpa harus nulis dari awal lagi.

---

## Bagian 5 – Refleksi

1. Bagian yang paling sulit dalam mengerjakan tugas ini  
Menurut saya yang paling sulit itu pas bikin logika buat ngecek jadwal bentrok. Soalnya harus benar-benar teliti, jangan sampai ruangan yang sama kepakai di waktu yang sama. Jadi harus bandingin jam mulai dan jam selesai dengan data schedule yang sudah ada. Awalnya agak bingung juga ngatur alurnya di coding, tapi lama-lama mulai kebiasa.

2. Hal baru yang dipelajari tentang konsep PBO  
Di tugas ini saya jadi lebih paham tentang konsep pewarisan (inheritance). Misalnya class Auditorium dan Kelas yang diturunkan dari Room, jadi nggak perlu bikin ulang atribut yang sama. Selain itu, saya juga belajar gimana cara menghubungkan beberapa class seperti Mahasiswa, Room, dan Schedule supaya bisa jalan bareng dalam satu program.

3. Jika sistem ini dikembangkan lebih lanjut, fitur apa yang akan ditambahkan?  
Kalau sistem ini mau dikembangkan lagi, saya pengen nambah fitur edit dan hapus schedule biar lebih fleksibel. Terus juga perlu ada validasi input supaya data yang dimasukin nggak salah. Selain itu, tampilan daftar jadwal juga bisa dibuat lebih rapi supaya lebih enak dilihat dan gampang dipahami.