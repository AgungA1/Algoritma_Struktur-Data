package JS9.Tugas_3;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();

        singLL.push("Bahasa");
        singLL.pr();
        singLL.print();
        singLL.push("Android");
        singLL.pr();
        singLL.print();
        singLL.push("Komputer");
        singLL.pr();
        singLL.print();
        singLL.push("Basis Data");
        singLL.pr();
        singLL.print();
        singLL.push("Matematika");
        singLL.pr();
        singLL.print();
        singLL.push("Algoritma");
        singLL.pr();
        singLL.print();
        singLL.push("Statistika");
        singLL.pr();
        singLL.print();
        singLL.push("Multimedia");
        singLL.pr();
        singLL.print();

        System.out.println("\n-----Isi Stack menjadi----\n");
        singLL.print();
        singLL.peek();
    }
}
