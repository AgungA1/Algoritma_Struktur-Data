package JS4;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin di hitung : ");
        int elemen = sc.nextInt();
        Pangkat[] png = new Pangkat[elemen];

        for (int i = 0; i < elemen; i++) {
            // png[i] = new  Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke- " + (i+1) + " : ");
            // png[i].nilai = sc.nextInt();
            int bil = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke- " + (i+ 1) + " : ");
            // png[i].pangkat = sc.nextInt();
            int pang = sc.nextInt();
            png[i] = new Pangkat(bil, pang);
        }

        while (true){
            System.out.println("Pilih Menu");
            System.out.println("1. Brute Force");
            System.out.println("2. Devide Conque");
            System.out.println("3. Exit");
            System.out.print("Masukkan Pilihan Anda : ");
            int pilih = sc.nextInt();

            switch(pilih) {
                case 1:
                    System.out.println("====================================================");
                    System.out.println("Hasil Pangkat dengan Brute Force");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                    }
                    break;
                case 2:
                    System.out.println("====================================================");
                    System.out.println("Hasil Pangkat dengan Devide Conque");
                    for (int j = 0; j < elemen; j++) {
                        System.out.println("Nilai " + png[j].nilai + " pangkat " + png[j].pangkat + " adalah " + png[j].pangkatDC(png[j].nilai, png[j].pangkat));
                    }
                    break;
                case 3:
                    System.exit(0);
            }
            System.out.println("====================================================");
        }
    }
}
