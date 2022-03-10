package JS3.Latihan_3;
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Mhs : ");
        int Mhs = sc.nextInt();
        sc.nextLine();

        Mahasiswa[] arrayMhs = new Mahasiswa[Mhs];

        for(int i = 0; i < Mhs; i++){
            System.out.println("Masukkan data mahasiswa ke- " + (i+1));
            System.out.print("Masukkan nama: ");
            String name = sc.nextLine();
            System.out.print("Masukkan nim: ");
            long nim = sc.nextLong();
            System.out.print("Masukkan jenis kelamin: ");
            char gender = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            float ipk = sc.nextFloat();
            sc.nextLine();
            System.out.println();

            arrayMhs[i] = new Mahasiswa(name,nim,gender,ipk);
        }

        for(int i = 0; i < Mhs; i++){
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("nama            : " + arrayMhs[i].nama);
            System.out.println("nim             : " + arrayMhs[i].nim);
            System.out.println("Jenis kelamin   : " + arrayMhs[i].kelamin);
            System.out.println("Nilai IPK       : " + arrayMhs[i].ipk);
        }
    }
}
