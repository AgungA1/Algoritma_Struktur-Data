package JS10.Tugas_2;
import java.util.Scanner;
public class Tugas2Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DLLFilm DLLFm = new DLLFilm();
        int id;
        String judul;
        float rating;
        while (true){
            menuFilm();
            int pilih = sc.nextInt();
            if(pilih==1){
                System.out.println("Masukkan Data Film Posisi Awal");
                System.out.print("ID Film: ");
                id = sc.nextInt();
                System.out.print("Judul Film: ");
                judul =sc.next();
                System.out.print("Rating Film: ");
                rating= sc.nextFloat();
                DLLFm.addFirst(id, judul,rating);
            }else if(pilih==2){
                System.out.println("Masukkan Data Film Posisi Akhir");
                System.out.print("ID Film: ");
                id = sc.nextInt();
                System.out.print("Judul Film: ");
                judul =sc.next();
                System.out.print("Rating Film: ");
                rating= sc.nextFloat();
                DLLFm.addLast(id, judul,rating);
            }else if(pilih==3){
                System.out.println("Masukkan index: ");
                int urutan = sc.nextInt();
                System.out.println("Masukkan Data Film index  " + urutan);
                System.out.print("ID Film: ");
                id = sc.nextInt();
                System.out.print("Judul Film: ");
                judul =sc.next();
                System.out.print("Rating Film: ");
                rating= sc.nextFloat();
                DLLFm.add(id, judul, rating, urutan);

            }else if(pilih==4){
                DLLFm.removeFirst();
            }else if(pilih==5){
                DLLFm.removeLast();
            }else if(pilih==6){
                System.out.println("Masukkan urutan yang akan dihapus");
                int urutan = sc.nextInt();
                DLLFm.remove(urutan);

            }else if(pilih==7){
                System.out.println("Cetak Data");
                System.out.println("----------------------------------");
                DLLFm.print();

            }else if(pilih==8){
                System.out.println("Masukkan ID Film: ");
                id = sc.nextInt();
                DLLFm.getId(id);

            }else if(pilih==9){
                DLLFm.bubbleSort();
                DLLFm.print();

            }else if(pilih==10){
                System.out.println("Terimakasih");
                break;
            }else{
                System.out.println("Inputan salah!");
            }

        }
    }
    public static void menuFilm(){
        System.out.println("==============================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("==============================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("==============================");
    }

}
