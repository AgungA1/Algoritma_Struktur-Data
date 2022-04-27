package JS7.Latihan2;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Isi2 tgs = new Isi2(8);

        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("====STRUK PEMBELIAN====");
            System.out.println("Pilihan");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Print");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            char pilih = sc.next().charAt(0);
            if (pilih == '1'){
                sc.nextLine();
                System.out.print("Masukkan nomor transaksi: ");
                int noTrx = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan tanggal pembelian(format: dd/mm/yyyy): ");
                String tgl = sc.nextLine();
                System.out.print("Masukkan jumlah barang yang dibeli: ");
                int jum = sc.nextInt();
                System.out.print("Masukkan total harga bayar: ");
                int totHar = sc.nextInt();

                Tugas2 p = new Tugas2(noTrx, tgl, jum, totHar);
                tgs.push(p);
            } else if (pilih == '2'){
                tgs.pop();
            } else if (pilih == '3'){
                tgs.print();
            } else if (pilih == '4'){
                System.out.println("Terimakasih");
                break;
            } else {
                System.out.println("Input yang anda masukkan salah");
                System.out.println("==============================");
                System.out.println("Apakah anda ingin mengulang input? (y/n)");
                char pilihan = sc.next().charAt(0);
                if (pilihan == 'y'){
                    continue;
                } else {
                    System.out.println("Terimakasih");
                    break;
                }
            }
        }


    }
}
