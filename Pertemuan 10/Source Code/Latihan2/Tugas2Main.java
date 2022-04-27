package JS8.Latihan2;
import java.util.Scanner;

public class Tugas2Main {
    public static void menu(){
        System.out.println("======ANTRIAN MAHASISWA======");
        System.out.println("Pilih yang ingin di lakukan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peak Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Print Mahasiswa");
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah queue: ");
        int jml = sc.nextInt();
        Tugas2Queue antrian = new Tugas2Queue(jml);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih){
                case 1:
                    System.out.println("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.println("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.println("Masukkan Absen: ");
                    int absen = sc.nextInt();
                    System.out.println("Masukkan IPK: ");
                    double ipk = sc.nextDouble();
                    Tugas2 tg = new Tugas2(nim, nama, absen, ipk);
                    sc.nextLine();
                    antrian.Enqueue(tg);
                    break;
                case 2:
                    Tugas2 dataMhs  = antrian.Dequeue();
                    if (!"".equals(dataMhs.nim) && !"".equals(dataMhs.nama) && dataMhs.absen != 0 && dataMhs.ipk != 0){
                        System.out.println("Antrian yang keluar: " + dataMhs.nim + " " + dataMhs.nama + " " + dataMhs.absen + " " + dataMhs.ipk);
                        break;
                    }
                case 3:
                    antrian.print();
                    break;
                case 4:
                    antrian.peek();
                    break;
                case 5:
                    antrian.peekRear();
                    break;
                case 6:
                    System.out.println("Masukkan NIM Mahasiswa yang dicari: ");
                    String nimMhs = sc.nextLine();
                    antrian.peekPosition(nimMhs);
                    break;
                case 7:
                    System.out.println("Masukkan posisi antrian Mahasiswa: ");
                    int posisi = sc.nextInt();
                    antrian.printMahasiswa(posisi);
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }

}
