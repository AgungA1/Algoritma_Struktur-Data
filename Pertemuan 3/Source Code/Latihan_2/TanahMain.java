package JS3.Latihan_2;
import java.util.Scanner;
public class TanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Tanah : ");
        int jml = sc.nextInt();

        System.out.println();

        Tanah[] arrayTanah = new Tanah[jml];

        for (int i = 0; i < jml; i++){
            System.out.println("Tanah " + (i+1));
            System.out.print("Panjang: ");
            int p = sc.nextInt();
            System.out.print("Lebar: ");
            int l = sc.nextInt();

            arrayTanah[i] = new Tanah(p,l);
        }

        System.out.println();

        for (int i = 0; i < jml; i++){
            System.out.println("Luas Tanah " + (i+1) + ": " + arrayTanah[i].hitungLuas());
        }

        System.out.println();

        int terluas = 0,max = 0;
        for(int i = 0; i < jml; i++){
            if (arrayTanah[i].hitungLuas() > terluas){
                terluas = arrayTanah[i].hitungLuas();
                max = i+1;
            }
        }

        System.out.println("Tanah Terluas: Tanah " + max);

    }
}
