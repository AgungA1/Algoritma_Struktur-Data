package JS1;

public class Fungsi {
    public static String toko[] = {"RoyalGarden1","RoyalGarden2","RoyalGarden3","RoyalGarden4"};
    public static  int stock[][] = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
    };
    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        while (true){

            System.out.println("=====================================");
            System.out.println("Selamat Datang Di Royale Garden");
            System.out.println("=====================================");
            System.out.println("Menu : ");
            System.out.println("1. Menampilkan Stock Bunga");
            System.out.println("2. Menampilkan Seluruh Stock Bunga di Seluruh Cabang");
            System.out.println("3. Exit");

            System.out.print("Pilihan : ");
            int menu = sc.nextInt();

            if (menu == 1){
                menampilkanStockBunga();
            }else if (menu == 2){
                menampilkanSeluruhStock();
            }else if (menu == 3){
                break;
            }else {
                System.out.println("Inputan Tidak Valid !");
            }

        }
    }

    static void menampilkanStockBunga(){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("|\t             |\t Aglonema  |  Keladi  |\t Alocasia  |\tMawar  |");
        System.out.println("--------------------------------------------------------------------");

        for (int i = 0; i < 4; i++){
            System.out.println();
            System.out.print("\t" + toko[i]);
            for (int j = 0; j < 4; j++){
                if (j == 0){
                    System.out.print("\t     ");
                    System.out.print(stock[i][j]);
                }else if (j == 1){
                    System.out.print("\t         ");
                    System.out.print(stock[i][j]);
                }else if (j == 2){
                    System.out.print("\t         ");
                    System.out.print(stock[i][j]);
                }else {
                    System.out.print("\t         ");
                    System.out.print(stock[i][j]);
                }

            }
        }

        System.out.println();

    }

    static void menampilkanSeluruhStock(){
        int algonema = 0, keladi = 0, alocasia = 0, mawar = 0, totalBunga = 0;


        for (int i = 0; i < 4;i++){
            for (int j = 0; j < 4; j++){
                if (j == 0){
                    algonema += stock[i][j];
                }else if (j == 1) {
                    keladi += stock[i][j];
                } else if (j == 2) {
                    alocasia += stock[i][j];
                } else {
                    mawar += stock[i][j];
                }
            }
        }

        totalBunga = (algonema + keladi + alocasia + mawar);

        System.out.println("Jumlah Bunga di Seluruh Cabang: " + totalBunga);
        System.out.println("Jumlah Bunga Algonema   : " + algonema);
        System.out.println("Jumlah Bunga Keladi     : " + keladi);
        System.out.println("Jumlah Bunga Alocasia   : " + alocasia);
        System.out.println("Jumlah Bunga Mawar      : " + mawar);

        System.out.println();

    }
}
