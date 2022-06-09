# Laporan & Dokumentasi Praktikum Pertemuan 11

Agung Malik Al Qindy

TI-1G | 01 | 2141720114

# Jawaban Pertanyaan

#### **Pertanyaan 10.1**

1. - Single Linked List : memiliki satu buah pointer yaitu next
   - Double Linked List : memiliki dua buah pointer yaitu pointer next dan prev.  

2. Pointer next menunjuk pada node setelahnya, dan pointer prev menunjuk pada node sebelumnya.

3. Potongan kode diatas berfungsi sebagai kondisi awal dari program tersebut, fungsi inisialisasi "head == null" untuk head belum menyimpan pada node, sedangkan fungsi inisialisasi "size = 0" untuk menyimpan jumlah data pada linked list

4. Karena pada method addFirst()diatas digunakan untuk menambah node pada awal atau index ke-0, dimana nantinya node yang dimasukkan tersebut prev nya bernilai null karena tidak merujuk atau menyimpan nilai dari node manapun

5. Potongan kode diatas berfungsi untuk pointer prev pada data yang sudah ada sebelumnya akan menyimpan / merujuk ke node yang baru

6. Karena pada method addLast() diatas digunakan untuk menambahkan node pada akhir atau index terakhir, dimana parameter prev dengan current digunakan untuk menyimpan node sebelumnya, dimana nantinya terjadi proses penambahan data pada index terakhir, sedangkan pada parameter next dengan null karena tidak merujuk pada node manapun karena sudah berada diakhir

#### **Pertanyaan 10.2**

1. Maksud dari potongan kode diatas adalah penghapusan pada index awal maka posisi head akan berpindah ke posisi node selanjutnya, dan pointer prev pada head akan bernilai null karena tidak menyimpan atau merujuk pada node manapun

2. Dengan cara mencari posisi node yang pointer next nya bernilai null, jika sudah ditemukan maka bisa dipastikan node tersebut berada pada index terakhir

3. Potongan kode diatas tidak cocok untuk perintah remove, karena potongan kode tersebut cocok digunakan untuk removeFirst dimana tmp menyimpan data setelah head, selanjutnya head.next menyimpan data tmp.next. kemudian pointer prev pada tmp.next menunjuk ke head. maka dari itu dapat saya simpulkan penerapan potongan kode diatas tidak cocok untuk perintah remove

4. Fungsi Potongan Kode diatas adalah untuk merubah nilai yang tadinya ada pada current.prev.next atau pointer next pada node sebelumnya akan dipindah pada current.next sedangkan pada current.next.prev atau pointer pref pada node selanjutnya akan dipindah pada current.prev

#### **Pertanyaan 10.3**

1. Methhod size() diatas berfungsi mereturn nilai menjadi 0 jika dalam kondisi tidak ada / kosong

2. Dengan cara melakukan perulangan yang dimana diinisialisasikan dengan index sama dengan 1

3. - Fungsi add pada double linked list hanya aada 1 fungsi  yang berdasarkan indeks sisanya dapat ditambah dari awal atau akhir indeks
   - Fungsi add pada single linked list terdapat 3 fungsi yaitu insertAfter, insertBefore, dan insertAt

4. - Pada gambar a terdapat if else yang dimana jika size = 0 maka true sedangkan jika tidak maka false.<p>
   - Pada gambar b tidak menggunakan if else hanya langsung apakah head bernilai null jika benar maka kondisi nya adalah true

#### **Tugas 10.4**

1. 
   <img src = "Screenshot 2022-06-10 012125.png">

   <img src = "Screenshot 2022-06-10 012217.png">

2.  
   <img src = "Screenshot 2022-06-10 012543.png">

   <img src = "Screenshot 2022-06-10 012631.png">