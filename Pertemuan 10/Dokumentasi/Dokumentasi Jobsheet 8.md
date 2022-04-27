# Laporan & Dokumentasi Praktikum Pertemuan 10

Agung Malik Al Qindy

TI-1G | 01 | 2141720114

# Jawaban Pertanyaan

#### **Pertanyaan 8.2**
1. Karena atribut front dan rear tidak menunjuk ke data manapun, sedangkan size merupakan banyaknya nilai yang diinputkan ke dalam array
   
2. Apabila rear berada pada indeks paling belakang maka rear akan dipindahkan ke indeks paling depan
   
3. Apabila front berada pada indeks paling belakang maka front akan dipindahkan ke indeks paling depan
   
4. Karena looping tidak selalu mulai dari indeks ke-0 dan front tidak selalu berada di indeks ke-0
   
5. Potongan kode diatas digunakan agar i tidak melebihi max

6.  ```java
     if(IsFull()){
            System.out.println("Queue sudah penuh");
    ```

7.  ```java
    public class QueueMain {
        public static void menu(){
            System.out.println("Masukkan operasi yang diinginkan: ");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Peek Position");
            System.out.println("6. Peek At");
            System.out.println("7. Clear");
            System.out.println("-------------------------");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan kapasitas queue: ");
            int n = sc.nextInt();
            Queue Q = new Queue(n);
            int pilih;
            String ulang;
            do{
                menu();
                pilih = sc.nextInt();
                switch (pilih){
                    case 1:
                        System.out.print("Masukkan data baru: ");
                        int dataMasuk = sc.nextInt();
                        Q.Enqueue(dataMasuk);
                        break;
                    case 2:
                        int dataKeluar = Q.Dequeue();
                        if (dataKeluar != 0){
                            System.out.println("Data yang dikeluarkan: " + dataKeluar);
                            break;
                        }
                    case 3:
                        Q.print();
                        break;
                    case 4:
                        Q.peek();
                        break;
                    case 5:
                        System.out.print("Masukkan data yang ingin dicari: ");
                        int data = sc.nextInt();
                        Q.peekPosition(data);
                        break;
                    case 6:
                        System.out.println("Masukkan posisi index yang ingin dicari: ");
                        int position = sc.nextInt();
                        Q.peekAt(position);
                        break;
                    case 7:
                        Q.clear();
                        break;
                    case 8:
                        System.exit(0);
                    default:
                        System.out.println("Maaf, anda salah memasukkan menu pilihan");
                }
                System.out.println("Apakah ingin kembali ke menu utama? [y/t]");
                ulang = sc.next();
            } while(ulang.equalsIgnoreCase("y"));
            //while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
        }
    }
    ```

#### **Pertanyaan 8.3**
1. Kode program diatas digunakan untuk mengecek apakah norek, nama, alamat, umur, saldo kosong atau tidak, apabila salah satu dari kelima atribut tersebut ada yang kosong maka tidak akan menampilkan antrian yang keluar

2.  ```java
     public void peekRear (){
        if (!IsEmpty()){
            System.out.println("Elemen paling belakang: " + data[rear].norek + " " + data[rear].nama + " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    ```

    ```java
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1.Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("----------------------------");
    }
    ```

    ``` java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        NasabahQueue antri = new NasabahQueue(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih){
                case 1:
                    System.out.println("No rekening: ");
                    String norek = sc.nextLine();
                    System.out.println("Nama: ");
                    String nama = sc.nextLine();
                    System.out.println("Alamat: ");
                    String alamat = sc.nextLine();
                    System.out.println("Umur: ");
                    int umur = sc.nextInt();
                    System.out.println("Saldo: ");
                    double saldo = sc.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0){
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
    ```

#### **Latihan Praktikum**
1.  ```java
    public void peekPosition(int dataDicari) {
        int i = front;
        int posisi = 1;
        System.out.print("Data " + dataDicari + " berada pada posisi index ke-");
        while(i != rear) {
            if (data[i]==dataDicari){
                System.out.print(posisi + " ");
            }
            i = (i+1) % max;
            posisi++;
        }
        if (data[i] == dataDicari){
            System.out.print(posisi + " ");
        }
        System.out.println();
    }

    public void peekAt(int position) {
        int idxDicari = front;
        System.out.print("Data yang berada pada index ke-" + position + " adalah : ");
        for (int i = 0 ; i < position - 1 ; i++){
            idxDicari = (idxDicari + 1) % max;
        }
        System.out.println(data[idxDicari] + " ");
    }
    ```

    Hasil Run : 
    <img src = JS8T1.png>

2.  
   <img src = JS8T2SS1.png>
   <img src = JS8T2SS2.png>
   <img src = JS8T2SS3.png>
   <img src = JS8T2SS4.png>
   <img src = JS8T2SS5.png>
   <img src = JS8T2SS6.png>
   <img src = JS8T2SS7.png>
   
