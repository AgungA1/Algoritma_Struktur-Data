package JS2;

public class Barang {
    /*String namaBarang, jenisBarang;
    int stok, hargaSatuan;

    Barang(){

    }

    Barang(String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }

    void tampilBarang(){
        System.out.println("Nama = " + namaBarang);
        System.out.println("Jenis = " + jenisBarang);
        System.out.println("Stok = " + stok);
        System.out.println("Harga Satuan = " + hargaSatuan);
    }

    void tambahStok(int n){
        stok = stok + n;
    }

    void kurangStok(int n){
        stok = stok - n;
    }

    int hitungHargaTotal(int jumlah){
        return jumlah*hargaSatuan;
    }*/

    String nama;
    int hargaSatuan;
    int jumlah;

    int hitungHargaTotal(int a,int b){
        int total = a * b;
        return total;
    }

    int hitungDiskon(int z){
        int diskon = 0;
        if (z > 100000){
            diskon = z * 10/100;
        }else if ((z > 50000) && (z < 100000)){
            diskon = z * 5/100;
        }else {
            diskon = 0;
        }
        return diskon;
    }

    int hitungHargaBayar(int l,int q){
        int hargaAkhir = 0;

        hargaAkhir = l - q;

        return hargaAkhir;

    }

}
