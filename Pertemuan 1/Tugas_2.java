package JS1;
import java.util.Scanner;
public class Tugas_2 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    static java.util.Scanner sc1 = new java.util.Scanner(System.in);
    static java.util.Scanner sc2 = new java.util.Scanner(System.in);

    public static double v = 0, s = 0, t = 0, hasil = 0;

    public static void main(String[] args) {
        while (true){
            System.out.println("========================================");
            System.out.println("PROGRAN RUMUS KECEPATAN, JARAK, & WAKTU");
            System.out.println("========================================");
            System.out.println("Menu :");
            System.out.println("1. Rumus Kecepatan");
            System.out.println("2. Rumus Jarak");
            System.out.println("3. Rumus Waktu");
            System.out.println("4. Exit");

            System.out.println("SESUAIKAN SATUAN !!!");

            System.out.print("Pilih : ");
            int menu = sc.nextInt();

            if (menu == 1){
                kecepatan();
            }else if (menu == 2){
                jarak();
            }else if (menu == 3){
                waktu();
            }else if (menu == 4){
                break;
            }else {
                System.out.println("Input Tidak Sesuai");
            }
        }
    }

    private static void kecepatan() {
        System.out.print("Masukkan jarak : ");
        s = sc.nextDouble();
        System.out.print("Masukkan waktu : ");
        t = sc.nextDouble();
        hasil = s/t;
        System.out.println("Kecepatan Yang Ditempuh adalah: " + hasil );
        System.out.println("");

    }
    private static void jarak() {
        System.out.print("Masukkan Kecepatan : ");
        v = sc1.nextDouble();
        System.out.print("Masukkan waktu : ");
        t = sc1.nextDouble();
        hasil = v*t;
        System.out.println("Jarak Yang Ditempuh adalah: " + hasil );
        System.out.println("");
    }

    private static void waktu() {
        System.out.print("Masukkan jarak : ");
        s = sc2.nextDouble();
        System.out.print("Masukkan kecepatan : ");
        v = sc2.nextDouble();
        hasil = s/v;
        System.out.println("Waktu Yang Ditempuh adalah: " + hasil );
        System.out.println("");
    }

}
