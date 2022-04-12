package JS6;
import java.util.Scanner;
public class NilaiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NilaiSort answer = new NilaiSort();
        int array[] = {12,17,2,1,70,50,90,17,2,90};

        for(int i=0;i< array.length;i++){
            int arr = array[i];
            Nilai t = new Nilai(arr);
            answer.tambah(t);
        }

        System.out.println("Data sebelum di sorting");
        answer.tampil();
        System.out.println();
        answer.bubbleSort();
        System.out.println("data setelah di sorting");
        answer.tampil();
        System.out.println();
        System.out.println("data Array Terbesar adalah");
        answer.Max();
        System.out.print("Masukkan data yang ingin di cari : ");
        int cariData = sc.nextInt();
        int posisiData = answer.BinarySearch(cariData, 0, array.length-1);
        answer.posisi(cariData, posisiData);

    }
}
