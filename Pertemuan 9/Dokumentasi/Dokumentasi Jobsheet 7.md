# Laporan & Dokumentasi Praktikum Pertemuan 9

Agung Malik Al Qindy

TI-1G | 01 | 2141720114

# Jawaban Pertanyaan

#### **Pertanyaan 7.2**
1. Data yang dapat ditampung ialah 5
   ```java
    Stack stk = new Stack(5);
    ```
2. Data yang tersimpan pada variabel p ialah data pada variabel jenis, warna, merk, ukuran, dan biaya (data dari objek pakaian)

3. Fungsi dari do-while untuk perulangan pada statement menambahkan data pakaian diulang kembali ataukah tidak

4.  ```java
     while (true){
            System.out.println("==========STACK===========");
            System.out.println("Pilihan");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. GetMin");
            System.out.println("6. Clear");
            System.out.println("7. Keluar");
            System.out.println("(Pilih: 1 / 2 / 3 / 4 / 5 / 6 / 7)");
            char pilih = sc.next().charAt(0);
            if (pilih == '1'){
                sc.nextLine();
                System.out.print("Jenis: ");
                String jenis = sc.nextLine();
                System.out.print("Warna: ");
                String warna = sc.nextLine();
                System.out.print("Merk: ");
                String merk = sc.nextLine();
                System.out.print("Ukuran: ");
                String ukuran = sc.nextLine();
                System.out.print("Harga: ");
                double harga = sc.nextDouble();
                Tugas1 p = new Tugas1(jenis, warna, merk, ukuran, harga);
                stack.push(p);
            } else if (pilih == '2'){
                stack.pop();
            } else if (pilih == '3'){
                stack.peek();
            } else if (pilih == '4'){
                stack.print();
            } else if (pilih == '5'){
                stack.getMin();
            } else if (pilih == '6'){
                stack.clear();
            } else if (pilih == '7'){
                System.out.println("Terimakasih");
                break;
            } else {
                System.out.println("Input yang anda masukkan salah");
                System.out.println("==============================");
                System.out.println("Apakah anda ingin mengulang input? (y/n)");
                char pilihan = sc.next().charAt(0);
                if (pilihan == 'y'){
                    continue;
                } else {
                    System.out.println("Terimakasih");
                    break;
                }
            }
        }
    ```

#### **Pertanyaan 7.3**
1. Alur kerja pada method derajat, pada method ini nilai dari variabel c yang berisi operator matematika di masukkan dan dilakukan pemilihan switch case untuk mengetahui dimana letak opearator tersebut saat di postfix berdasarkan kondisi lebih besar ataupun lebih kecil derajat operatornya, apabila nilai ditemukan kode program akan dijalankan sesuai statement yang ada. Sedangkan apabila nilainya tidak ditemukan maka akan di default.

2. Fungsinya ialah untuk memanggil nilai c berdasarkan nilai yang terakhir kali diinputkan pada varibel i.

3. 
<img src = JS7P7.3.png>

4. Tanda kurung tidak ditampilkan karena bukan merupakan operator aritmatika sehingga juga tidak memiliki derajat operator aritmatika, sehingga tidak perlu ditampilkan pada hasil konverensi. tanda kurung digunakan untuk memudahkan proses operasi perhitungan.

#### **Latihan Praktikum**
1. 
<img src = JS7T1.png>

2. 
<img src = JS7T2SS1.png>
<img src = JS7T2SS2.png>
<img src = JS7T2SS3.png>
<img src = JS7T2SS4.png>
<img src = JS7T2SS5.png>
<img src = JS7T2SS6.png>
<img src = JS7T2SS7.png>
