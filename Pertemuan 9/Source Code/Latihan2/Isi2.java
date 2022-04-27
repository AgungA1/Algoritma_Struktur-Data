package JS7.Latihan2;

public class Isi2 {
    Tugas2 tgs2[];
    int size, top;

    public Isi2(int idx){
        tgs2 = new Tugas2[idx];
        this.size = idx;
        top = -1;
    }

    public boolean IsEmpty(){
        if (top==-1){
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull(){
        if (top==size-1){
            return true;
        } else {
            return false;
        }
    }

    public void push (Tugas2 struk){
        if (!IsFull()){
            top++;
            tgs2[top] = struk;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop(){
        if (!IsEmpty()){
            Tugas2 x = tgs2[top];
            top--;
            System.out.println("===STACK YANG DIKELUARKAN===");
            System.out.println("Nomor Trx: " + x.noTrx);
            System.out.println("Tanggal Pembelian: " + x.tglBeli);
            System.out.println("Jumlah Barang: " + x.jmlBrg);
            System.out.println("Total Harga Bayar: " + x.hargaByr);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void print(){
        System.out.println("ISI STACK STRUK PEMBELIAN");
        for (int i=top; i>=0;i--){
            System.out.println("========================");
            System.out.println("Nomor Trx: " + tgs2[i].noTrx);
            System.out.println("Tanggal Pembelian: " + tgs2[i].tglBeli);
            System.out.println("Jumlah Barang: " + tgs2[i].jmlBrg);
            System.out.println("Total Harga Bayar: " + tgs2[i].hargaByr);
            System.out.println("========================");
        }
        System.out.println("");
    }
}
