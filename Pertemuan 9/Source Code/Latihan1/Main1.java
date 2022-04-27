package JS7.Latihan1;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Isi1 stack = new Isi1(5);
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("==========STACK===========");
            System.out.println("Pilihan");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. GetMin");
            System.out.println("6. Clear");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            char pilih = sc.next().charAt(0);
            if (pilih == '1'){
                sc.nextLine();
                System.out.print("Jenis: ");
                String jenis = sc.nextLine();
                System.out.print("Warna: ");
                String warna = sc.nextLine();
                System.out.print("Merk: ");
                String merk = sc.nextLine();
                System.out.print("Ukuran: ");
                String ukuran = sc.nextLine();
                System.out.print("Harga: ");
                double harga = sc.nextDouble();
                Tugas1 p = new Tugas1(jenis, warna, merk, ukuran, harga);
                stack.push(p);
            } else if (pilih == '2'){
                stack.pop();
            } else if (pilih == '3'){
                stack.peek();
            } else if (pilih == '4'){
                stack.print();
            } else if (pilih == '5'){
                stack.getMin();
            } else if (pilih == '6'){
                stack.clear();
            } else if (pilih == '7'){
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

