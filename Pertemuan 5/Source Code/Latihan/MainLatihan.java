package JS4;
import java.util.Scanner;
public class MainLatihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Banyak Suara : ");
        int suara = input.nextInt();

        Latihan test = new Latihan(suara);
        input.nextLine();

        for(int i = 0; i < suara; i++){
            System.out.println("Masukkan Nama/Suara ke - "+ (i+1) + " = ");
            test.kandidat[i] = input.nextLine();
        }
        int hasil = test.ModusArray(test.kandidat, 0, suara, 0);
        System.out.println("Mayoritas Jumlah Suara adalah : " + test.kandidat[hasil]);
    }
}
