package JS3.Latihan_1;

public class Balok {
    public int panjang, lebar, tinggi;

    public Balok(int p, int l, int tb){
        panjang = p;
        lebar = l;
        tinggi = tb;
    }

    int lpBalok(){
        return (2*(panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }

    int vBalok(){
        return panjang*lebar*tinggi;
    }

}
