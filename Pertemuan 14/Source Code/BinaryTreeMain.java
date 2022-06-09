package JS11;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        bt.addNodeR(50);

        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find "+bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.println("------------------------------");
        System.out.println("Data Terbesar Adalah : ");
        bt.maksimal();
        System.out.println("Data Terkecil Adalah : ");
        bt.minimal();
        System.out.println("-------------------------------");
        System.out.println("data yang ada di leaf : ");
        bt.printLeft(bt.root);
        System.out.println();
        System.out.println("Data Leaf Berjumlah : "+bt.jumlahLeft());

    }
}
