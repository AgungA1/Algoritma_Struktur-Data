package JS4;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Program menghitung keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int np = sc.nextInt();
        Sum[] sm = new Sum[np];

        for (int i = 0; i < np; i++) {
            System.out.println("PERUSAHAAN "+(i+1));
            System.out.print("masukkan jumlah bulan : ");
            int elemen = sc.nextInt();
            sm[i] = new Sum(elemen);
            for (int j = 0; j < sm[i].elemen ; j++) {
                System.out.print("Masukkan untung bulan ke-"+(j+1)+" = ");
                sm[i].keuntungan[j]= sc.nextDouble();
            }
        }

        for (int i = 0; i < np; i++) {
            System.out.println("=============================================");
            System.out.println("\nPERUSAHAAN "+(i+1));
            System.out.println("=============================================");
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungan perusahaan selama %d bulan adalah = %.2f\n",sm[i].elemen,sm[i].totalBF(sm[i].keuntungan));
            System.out.println("\nAlgoritma Divide Conquer");
            System.out.printf("Total keuntungan perusahaan selama %d bulan adalah = %.2f\n",sm[i].elemen,sm[i].totalDC(sm[i].keuntungan,0 , sm[i].elemen-1));
        }
    }
}
