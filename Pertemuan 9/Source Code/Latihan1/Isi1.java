package JS7.Latihan1;

public class Isi1 {
    int size;
    int top;
    Tugas1 data[];

    public Isi1(int size) {
        this.size = size;
        data = new Tugas1[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Tugas1 pkn) {
        if (!IsFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            Tugas1 x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        System.out.println("ELemen teratas: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }

    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga + " ");
        }
        System.out.println("");
    }

    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void getMin() {
        if (!IsEmpty()) {
            double harga = data[top].harga;
            for (int i = top; i >= 0; i--) {
                if (harga > data[i].harga) {
                    harga = data[i].harga;
                }
            }
            System.out.println("Harga pakaian terendah adalah " + harga);

            for (int i = top; i >= 0; i--) {
                if (data[i].harga == harga) {
                    System.out.println("dengan data pakaian: " + data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga);
                    System.out.println("yang berada pada index ke-" + i);
                }
            }
        }
    }
}
