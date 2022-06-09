package JS11;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int [] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);

        System.out.println("-------------------------------");
        System.out.println("     Hasil Tugas No 5          ");
        System.out.println("-------------------------------");
        bta.add(90);
        bta.add(72);
        System.out.println("Method Traverse PreOrder");
        bta.traversePreOrder(0);
        System.out.println();
        System.out.println("Method Traverse PostOrder");
        bta.traversePostOrder(0);
        System.out.println();
    }
}
