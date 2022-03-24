package JS4;

public class Faktorial {
    public int nilai;

    public int faktorialBF(int n){
        int fakto = 1,i = 1;
        do {
            fakto *= i;
            i++;
        }
        while (i <= n);
        /*while ( i <= n){
            fakto *= i;
            i++;
        }*/
        /*int fakto = 1;
        for (int i = 1; i <= n; i++){
            fakto *= i;
        }*/
        return fakto;
    }

    public int faktorialDC(int n){
        if (n == 1){
            return 1;
        }else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }

}
