package JS5;

public class MainTiket {
    public static void main(String[] args) {

        TiketService list = new TiketService();
        Tiket t1 = new Tiket("Lion" , 500 , "Surabaya" , "Kalimantan");
        Tiket t2 = new Tiket("Citilink" , 300 , "Bali" , "Nusa Tenggara Timur");
        Tiket t3 = new Tiket("Garuda" , 1000 , "Bali" , "Surabaya");
        Tiket t4 = new Tiket("Batik Air" , 800 , "Surabaya" , "Bali");
        Tiket t5 = new Tiket("Sriwijaya Air" , 900 , "Kalimantan" , "Bali");

        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);

        System.out.println("Data Tiket sebelum sorting = ");
        list.tampilAll();

        System.out.println("Data Tiket setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("Data Tiket setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampilAll();

    }
}
