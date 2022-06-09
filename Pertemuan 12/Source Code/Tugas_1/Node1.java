package JS10.Tugas_1;

public class Node1 {
    String dataNama;
    int dataAntrian;
    Node1 prev, next;

    Node1(Node1 prev, int dataAntrian, String dataNama, Node1 next){
        this.prev=prev;
        this.dataAntrian=dataAntrian;
        this.dataNama=dataNama;
        this.next=next;
    }
}
