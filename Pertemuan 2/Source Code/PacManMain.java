package JS2;
import java.util.Scanner;
public class PacManMain {
    public static void main(String[] args) {
        PacMan pman = new PacMan();
        Scanner sc = new Scanner(System.in);
        pman.x = 0;
        pman.y = 0;

        System.out.print("Masukkan batasan arena x = ");
        pman.width = sc.nextInt();
        System.out.print("Masukkan batasan arena y = ");
        pman.height = sc.nextInt();

        while (true) {
            System.out.print(
                    "\nPilih Arah : \nKiri Tekan -> 1\nKanan Tekan -> 2\nAtas Tekan -> 3\nBawah Tekan -> 4\nExit tekan -> 5\nPilih : ");
            int input = sc.nextInt();

            if (pman.x == 0 && input == 1) {
                System.out.println("\nPacman Keluar Arena");
                pman.printPosition(pman.x, pman.y);
                continue;
            } else if (pman.y == 0 && input == 4) {
                System.out.println("\nPacman Keluar Arena");
                pman.printPosition(pman.x, pman.y);
                continue;
            } else if (pman.x == pman.width && input == 2) {
                System.out.println("\nPacman Keluar Arena");
                pman.printPosition(pman.x, pman.y);
                continue;
            } else if (pman.y == pman.height && input == 3) {
                System.out.println("\nPacman Keluar Arena");
                pman.printPosition(pman.x, pman.y);
                continue;
            }

            if (input == 1) {
                pman.moveLeft(pman.x);
                pman.printPosition(pman.x, pman.y);
            } else if (input == 2) {
                pman.moveRight(pman.x);
                pman.printPosition(pman.x, pman.y);
            } else if (input == 3) {
                pman.moveUp(pman.y);
                pman.printPosition(pman.x, pman.y);
            } else if (input == 4) {
                pman.moveDown(pman.y);
                pman.printPosition(pman.x, pman.y);
            } else{
                System.out.println("\nInput Salah atau Anda Sudah Keluar\n");
                break;
            }

        }
    }
}
