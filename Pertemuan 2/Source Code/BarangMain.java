package JS2;

public class BarangMain {
    public static void main(String[] args) {
        /*Barang b1 = new Barang();
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = " + hargaTotal);

        System.out.println();

        Barang b2 = new Barang("Logitech", "Wireless Mouse", 25,150000);
        b2.tambahStok(3);
        b2.kurangStok(1);
        b2.tampilBarang();

        int total = b2.hitungHargaTotal(5);
        System.out.println("Harga 5 buah = " + total);

        System.out.println();

        Barang b3 = new Barang("Gudang Garam","Rokok Kretek",20,16000);
        b3.tambahStok(3);
        b3.kurangStok(1);
        b3.tampilBarang();

        int total2 = b3.hitungHargaTotal(5);
        System.out.println("Harga 5 buah = " + total2);*/

        Barang pt = new Barang();
        pt.nama = "Notebook";
        pt.hargaSatuan = 200000;
        pt.jumlah = 2;

        System.out.println("Harga Total : Rp." + pt.hitungHargaTotal(pt.hargaSatuan, pt.jumlah)+ ",00");
        System.out.println("Diskon : Rp." + pt.hitungDiskon(pt.hitungHargaTotal(pt.hargaSatuan, pt.jumlah))+ ",00");
        System.out.println("Harga Bayar : Rp." + pt.hitungHargaBayar(pt.hitungHargaTotal(pt.hargaSatuan, pt.jumlah), pt.hitungDiskon(pt.hitungHargaTotal(pt.hargaSatuan, pt.jumlah)))+ ",00");


    }
}
