package JS10.Tugas_1;
import java.util.Scanner;
public class Tugas1Main {
    public static void menu(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\tPENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DLList DLLVaksin = new DLList();

        while (true){
            menu();
            int pilih = sc.nextInt();
            if(pilih==1){
                System.out.println("--------------------------------");
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.println("--------------------------------");
                System.out.print("Nomor Antrian: ");
                int no = sc.nextInt();
                System.out.print("Nama Penerima: ");
                String nama= sc.next();
                DLLVaksin.addLast(no, nama);
            }else if(pilih==2){
                System.out.println("--------------------------------");
                System.out.println("Masukkan Index Antrian yang ingin dihapus");
                System.out.println("--------------------------------");
                int no = sc.nextInt();
                DLLVaksin.remove(no);
            }else if(pilih==3){
                System.out.println("--------------------------------");
                System.out.println("Daftar Pengantri Vakin");
                System.out.println("--------------------------------");
                DLLVaksin.print();
                DLLVaksin.size();
                System.out.println("Sisa antrian: " + DLLVaksin.size);
            }else if(pilih==4){
                System.out.println("Terimakasih");
                break;
            }else{
                System.out.println("Input salah!");
            }
        }
    }

}
