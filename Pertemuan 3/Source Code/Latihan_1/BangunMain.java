package JS3.Latihan_1;
import java.util.Scanner;
public class BangunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah idx : ");
        int jml = sc.nextInt();

        Balok[] arrayBalok = new Balok[jml];
        Tabung[] arrayTabung = new Tabung[jml];
        Bola[] arrayBola = new Bola[jml];

        for (int i = 0; i < jml; i++){
            System.out.print("Masukkan Panjang Balok Ke-" + (i+1) + ": ");
            int p = sc.nextInt();
            System.out.print("Masukkan Lebar Balok Ke-" + (i+1) + ": ");
            int l = sc.nextInt();
            System.out.print("Masukkan Tinggi Balok Ke-" + (i+1) + ": ");
            int t = sc.nextInt();

            arrayBalok[i] = new Balok(p,l,t);

            System.out.print("Masukkan Jari-Jari Tabung Ke-" + (i+1) + ": ");
            int r = sc.nextInt();
            System.out.print("Masukkan Tinggi Tabung Ke-" + (i+1) + ": ");
            int tt = sc.nextInt();


            arrayTabung[i] = new Tabung(r,tt);

            System.out.print("Masukkan Jari-Jari Bola Ke-" + (i+1) + ": ");
            int rb = sc.nextInt();

            arrayBola[i] = new Bola(rb);
        }

        for (int j = 0; j < jml; j++){
            System.out.println("Luas Permukaan Balok Ke-" + (j+1) + ": " + arrayBalok[j].lpBalok());
            System.out.println("Volume Balok Ke-" + (j+1) + ": " + arrayBalok[j].vBalok());
            System.out.println("Luas Permukaan Tabung Ke-" + (j+1) + ": " + arrayTabung[j].lpTabung());
            System.out.println("Volume Tabung Ke-" + (j+1) + ": " + arrayTabung[j].vTabung());
            System.out.println("Luas Permukaan BolaKe-" + (j+1) + ": " + arrayBola[j].lpBola());
            System.out.println("Volume Bola Ke-" + (j+1) + ": " + arrayBola[j].vBola());
        }

    }
}
