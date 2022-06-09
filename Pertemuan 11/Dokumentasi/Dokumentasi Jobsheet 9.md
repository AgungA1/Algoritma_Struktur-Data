# Laporan & Dokumentasi Praktikum Pertemuan 11

Agung Malik Al Qindy

TI-1G | 01 | 2141720114

# Jawaban Pertanyaan

#### **Pertanyaan 9.1**

1. Hal ini karena list belum ada data. Dalam class SLLMain langsung memanggil method print yang saat itu masih belum ada data, jika list masih kosong maka dalam method print akan mencetak "Linked List Kosong"

2. Kegunaan potongan kode diatas adalah jika temp.data sama dengan key, maka kode program otomatis mengubah nilai variabel ndInput.next menjadi variabel temp.next serta nantinya pada variable ndInput untuk menyimpan nilainya

3. Kegunaan potongan kode diatas adalah jika temp.next.next == nul maka akan mengembalikan nilai -1 atau data kosong, dan jika tidak ada kondisi yang terpenuhi sama sekali maka akan mengembalikan nilai dari index yaitu 0

#### **Pertanyaan 9.2**


1. Karena keyworad break tersebut berfungsi untuk menghentikan perulangan / loop. terdapat dua break yang ada pada method remove, break yang pertama berfunsgsi untuk jika data yang dihapus ada pada head dan ditemukan maka program akan langsung break, break yang kedua berfungsi untuk jika data yang dihapus berada ditengah dan ditemukan  maka program akan langsung break

2. Potongan kode diatas berfungsi untuk jika node yang dipilih memiliki data yang sama (equals) dengan key, maka terjadi perubahan posisi dimana node tersebut akan digantikan oleh node yang selanjutnya

3. Didalam method indexOf terdapat 2 return, yaitu :
    - Jika tmp == null maka akan mengembalikan nilai -1 atau data kosong
    - Jika tidak ada kondisi yang terpenuhi sama sekali maka akan mengembalikan nilai index yaitu 0

#### **Tugas 9.3**

1. - Penambahan method di class SingleLinkedList
   ```java
   public void insertBefore(int key, int input){
        node ndInput = new node(input, null);
        node temp = head;
        node prev = null;
        
        do{
            if(head.data == key){
                addFirst(input);
                break;
            }else if (temp.data == key){
                ndInput.next = temp;
                prev.next = ndInput;
                if(temp.next == null){
                    tail = ndInput;
                    break;
                }
            }
            prev = temp;
            temp = temp.next;
        }while (temp != null);
    }
   ```
   - Penambahan statment di class SLLMain
   ```java
   System.out.println("Hasil output penambahan method insertBefore()");
        singLL.insertBefore(760, 450);
        singLL.print();
    ```
    - Hasil Output

    <img src = "Screenshot 2022-06-10 001331.png">

2.  
    <img src = "Screenshot 2022-06-10 002600.png">

3.  
     <img src = "Screenshot 2022-06-10 003300.png">

     <img src = "Screenshot 2022-06-10 003326.png">

     <img src = "Screenshot 2022-06-10 003358.png">


4. 
     <img src = "Screenshot 2022-06-10 004617.png">

     <img src = "Screenshot 2022-06-10 004638.png">

     <img src = "Screenshot 2022-06-10 004656.png">

     <img src = "Screenshot 2022-06-10 004748.png">