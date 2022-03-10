package JS3.Latihan_1;

public class Tabung {
    public int jari_jari, tinggiTabung;

    public Tabung(int r, int tt){
        jari_jari = r;
        tinggiTabung = tt;
    }

    int lpTabung(){
        return (2*22/7*jari_jari*(tinggiTabung + jari_jari));
    }

    int vTabung(){
        return (22/7*jari_jari*jari_jari* tinggiTabung);
    }

}
