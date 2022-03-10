package JS3;

public class Segitiga {
    public int alas;
    public int tinggi;

    Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }

    double hitungLuas(){
        return 0.5 * alas * tinggi;
    }

    int hitungKeliling(){
        return 3*alas;
    }

}
