package JS1;
import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM Anda : ");
        int nim = sc.nextInt();
        int digit = nim % 100;
        if (digit < 10){
            digit += 10;
        }

        for (int i = 1; i <= digit; i++){
            if (i % 7 == 1){
                System.out.print("Senin ");
            }else if (i % 7 == 2){
                System.out.print("Selasa ");
            }else if (i % 7 == 3){
                System.out.print("Rabu ");
            }else if (i % 7 == 4){
                System.out.print("Kamis ");
            }else if (i % 7 == 5){
                System.out.print("Jumat ");
            }else if (i % 7 == 6){
                System.out.print("Sabtu ");
            }else {
                System.out.print("Minggu ");
            }
        }



    }
}
