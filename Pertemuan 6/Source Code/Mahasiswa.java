package JS5;

public class Mahasiswa {
    public String nama;
    public int thnMasuk,umur;
    public double ipk;

    Mahasiswa(String n, int t,int u, double i){
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    public void tampil(){
        System.out.println("Nama = " + nama);
        System.out.println("Tahun Masuk = " + thnMasuk);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }

}
