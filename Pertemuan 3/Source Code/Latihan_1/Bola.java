package JS3.Latihan_1;

public class Bola {
    public int jariJari;

    public Bola(int rb){
        jariJari = rb;
    }

    int lpBola(){
        return (4*22/7*jariJari*jariJari);
    }

    double vBola(){
        return (4/3 * 3.14 * jariJari*jariJari*jariJari);
    }

}
