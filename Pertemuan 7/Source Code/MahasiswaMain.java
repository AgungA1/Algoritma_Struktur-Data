package JS6;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);


        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumMhs = s.nextInt();
        PencarianMhs data = new PencarianMhs(jumMhs);


        System.out.println("---------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari Nim terkecil");
        for (int i = 0; i < jumMhs; i++){
            System.out.println("----------------");
            System.out.print("Nim : ");
            int nim = s.nextInt();
            System.out.print("Nama : ");
            String nama = s1.nextLine();
            System.out.print("Umur : ");
            int umur = s.nextInt();
            System.out.print("IPK : ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("-----------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        while (true) {

            System.out.println("-----------------------------------");
            System.out.println("-----------------------------------");
            System.out.println("Pencarian Data : ");
            System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
            System.out.print("NIM : ");
            int cari = s.nextInt();
            System.out.println("Menggunakan sequential Search");
            int posisi = data.FindSeqSearch(cari);

            data.Tampilposisi(cari, posisi);
            data.TampilData(cari, posisi);

            System.out.println("===================================");
            System.out.println("Menggunakan binary Search");
            posisi = data.FindBinarySearch(cari, 0, jumMhs -1);
            data.Tampilposisi(cari,posisi);
            data.TampilData(cari, posisi);

        }

    }
}
