package JS8.Latihan2;

public class Tugas2Queue {
    Tugas2 antrian[];
    int front;
    int rear;
    int size;
    int max;

    Tugas2Queue(int n){
        max = n;
        antrian = new Tugas2[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull(){
        if (size == max){
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue (Tugas2 antri){
        if(IsFull()){
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()){
                front = rear = 0;
            } else {
                if (rear == max-1){
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public Tugas2 Dequeue (){
        Tugas2 antri = new Tugas2();
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            antri =antrian[front];
            size--;
            if (IsEmpty()){
                front = rear = -1;
            } else {
                if (front == max-1){
                    front = 0;
                } else {
                    front ++;
                }
            }
        }
        return antri;
    }

    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear){
                System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen + " " + antrian[i].ipk);
                i=(i+1) % max;
            }
            System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen + " " + antrian[i].ipk);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan: " + antrian[front].nim + " " + antrian[front].nama + " " + antrian[front].absen + " " + antrian[front].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear (){
        if (!IsEmpty()){
            System.out.println("Elemen paling belakang: " + antrian[rear].nim + " " + antrian[rear].nama + " " + antrian[rear].absen + " " + antrian[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String peekPos) {
        int i = front;
        int posisi = 1;
        System.out.print("data " + peekPos + " ada pada posisi : ");
        while(i != rear) {
            if (antrian[i].nim.equals(peekPos)){
                System.out.print(posisi + " ");
            }
            i = (i+1) % max;
            posisi++;
        }
        if (antrian[i].nim.equals(peekPos)){
            System.out.print(posisi + " ");
        }
        System.out.println();
    }

    public void printMahasiswa(int position) {
        int idxCari = front;
        System.out.print("Data pada posisi " + position + " adalah : ");
        for (int i = 0 ; i < position - 1 ; i++){
            idxCari = (idxCari + 1) % max;
        }
        System.out.println(antrian[idxCari].nim + " " + antrian[idxCari].nama + " " + " " + antrian[idxCari].absen + " " + antrian[idxCari].ipk);
    }

}
