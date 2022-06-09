package JS9.Tugas_3;

public class SingleLinkedList {
    Node head; //posisi awal linked list
    Node tail; //posisi akhir linked list

    public boolean isEmpty() {
        return head == null;
    }

    public void pr(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("Berhasil menambahkan "+ tmp.data);
        }
    }
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            while(tmp != null){
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public void peek(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("Elemen Teratas : "+tmp.data);
        }else{
            System.out.println("Stack Masih Kosong");
        }
    }
    public void push(String input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){ //jika linked list kosong
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
}
