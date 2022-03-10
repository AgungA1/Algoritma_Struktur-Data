package JS3.Latihan_2;

public class Tanah {
    public int panjang ,lebar;

    public Tanah(int p, int l){
        panjang = p;
        lebar = l;
    }

    public int hitungLuas(){
        return (panjang*lebar);
    }
}
