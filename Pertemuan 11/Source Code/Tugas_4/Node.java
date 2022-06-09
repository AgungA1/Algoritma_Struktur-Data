package JS9.Tugas_4;

public class Node {
    String nim, nama;
    int absen;
    double ipk;
    Node next;

    public Node(String nim, String nama, int absen, double ipk, Node berikutnya){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk =ipk;
        this.next = berikutnya;
    }
}
