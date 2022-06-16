# Laporan & Dokumentasi Praktikum Pertemuan 15

Agung Malik Al Qindy

TI-1G | 01 | 2141720114

# Jawaban Pertanyaan

#### **Pertanyaan 12.1**

1.  
   - Algoritma Prim, kegunaannya adalah mencari pohon rentang minimum untuk sebuah graf berbobot yang terhubung. Ini berarti menemukan subset dari tepi yang membentuk sebuah pohon yang mencakup etiap titik, di mana berat total semua tepi di pohon diminimalkan. Jika grafik tidak terhubung, maka ia menemukan hutan rentang minimum (pohon rentang minimum untuk setiap komponen terhubung).
    - Algoritma Dijkstra, kegunaannya adalah dipakai dalam memecahkan permasalahan jarak terpendek (shortest path problem) untuk sebuah graf berarah (directed graph)
    - Algoritma Warshall , kegunaannya menghitung jarak terpendek (shortest path) untuk semua pasangan titik pada sebuah graph, dan melakukannya dalam waktu berorde kubik. Algoritma warshall digunakan untuk menyelesaikan permasalahan jalur terpendek multi path

2. Berfungsi untuk di Untuk memanggil fungsi linked list dan mengisi list yang berupa vertex pada linked list tersebut

3. Alasannya adalah Untuk mengenalkan vertex tersebut dan koneksinya

4. Dengan cara ketika i == destination maka akan dilihat source dari i atau dengan cara melakukan looping vertex

5. Output program diatas tidak ada yang eror, akan tetapi vertex yang dilewati mengalami perubahan lintasan

#### **Pertanyaan 12.2**

1. Pada directed graph degree / derajat tidak selalu berhubungan kembali sedangkan pada undirected graph degree/derajat pasti berhubungan

2. Karena menggunakan array dan dimulai dari 0, maka harus perlu ditambah dengan

3. Method getEdge berfungsi untuk menampilkan suatu lintasan yang diperlukan 

4. Jenis graph diatas adalah "Directed graph" karena 1 berhubungan dengan 2 akan tetapi 2 tidak berhubungan dengan 1

5. Agar saat terjadi eror, eksekusi program dapat terus berjalan tanpa memberhentikan program sehingga meminimalisir terjadinya eror atau output tidak muncul

#### **Tugas Praktikum**

1. ```java
    package JS12;

    public class Graph {
        int vertex;
        DoubleLinkedLists list[];

        public Graph(int vertex){
            this.vertex = vertex;
            list = new DoubleLinkedLists[vertex];
            for (int i = 0; i < vertex; i++){
                list [i] = new DoubleLinkedLists();
            }
        }

        public void addEdge(int source, int destination) {
            list[source].addFirst(destination);
            list[destination].addFirst(source);
        }

        public void degree(int source) throws Exception {
            System.out.println("degree vertex " + source + " : " + list[source].size());
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i< vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == source)
                        ++totalIn;
                }
                //outDegree
                for (k = 0; k < list[source].size(); k++) {
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree dai vertex " + source + " : " + totalIn);
            System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
            System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
        }
        
        public void removeEdge(int source, int destination) throws Exception {
            for (int i = 0; i< vertex; i++) {
                if (i == destination) {
                    list[source].remove(destination);
                }
            }
        }

        public void removeAllEdges() {
            for (int i = 0; i< vertex; i++) {
                list[i].clear();
            }
            System.out.println("Graph berhasil dikosongkan");
        }

        public void printGraph() throws Exception {
            for (int i = 0; i< vertex; i++) {
                if (list[i].size() > 0) {
                    System.out.print("Vertex " + i + " terhubung dengan: ");
                    for (int j = 0; j < list[i].size(); j++) {
                        System.out.print(list[i].get(j) + " ");
                    }
                    System.out.println("");
                }
            }
            System.out.println(" ");
        }
    }

    ```
    Class Main : 
    ```java
    package JS12;
    import java.util.Scanner;

    public class GraphMain {

        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int vertex, edge, source, destination;
            Graph grp = new Graph(6);

            System.out.print("Masukkan Vertex\t\t: ");
            vertex = sc.nextInt();

            System.out.print("Masukkan Edge\t\t: ");
            edge = sc.nextInt();

            int menu;
            do{
                System.out.println("Pilih menu dibawah ini");
                System.out.println("1. Directed(Tugas Praktikum 1)\n2. Undirected(Tugas Pratikum 2)");
                System.out.print("Masukkan Menu : ");
                menu = sc.nextInt();

                if(menu == 1){

                    for(int i=0; i<edge; i++){
                        System.out.print("Masukkan Source\t\t: ");
                        source = sc.nextInt();
                        System.out.print("Masukkan Destination\t: ");
                        destination = sc.nextInt();

                        grp.addEdge(source, destination);
                    }
                    System.out.println("");
                    grp.printGraph();
                }else if(menu == 2){

                    for(int i=0; i<edge; i++){
                        System.out.print("Masukkan Source\t\t: ");
                        source = sc.nextInt();
                        System.out.print("Masukkan Destination\t: ");
                        destination = sc.nextInt();

                        grp.graphType(source, destination);
                    }
                    System.out.println("");
                    grp.printGraph();
                }
            }while (menu != 1 && menu != 2);
        }
    }
    ```

2. ```java
    public boolean graphType(int source, int destination) throws Exception{
        list[source].addFirst(destination);
        return true;
    }
    ```

    Main Class :

    ```java
    package JS12;
    import java.util.Scanner;

    public class GraphMain {

        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int vertex, edge, source, destination;
            Graph grp = new Graph(6);

            System.out.print("Masukkan Vertex\t\t: ");
            vertex = sc.nextInt();

            System.out.print("Masukkan Edge\t\t: ");
            edge = sc.nextInt();

            int menu;
            do{
                System.out.println("Pilih menu dibawah ini");
                System.out.println("1. Directed(Tugas Praktikum 1)\n2. Undirected(Tugas Pratikum 2)");
                System.out.print("Masukkan Menu : ");
                menu = sc.nextInt();

                if(menu == 1){

                    for(int i=0; i<edge; i++){
                        System.out.print("Masukkan Source\t\t: ");
                        source = sc.nextInt();
                        System.out.print("Masukkan Destination\t: ");
                        destination = sc.nextInt();

                        grp.addEdge(source, destination);
                    }
                    System.out.println("");
                    grp.printGraph();
                }else if(menu == 2){

                    for(int i=0; i<edge; i++){
                        System.out.print("Masukkan Source\t\t: ");
                        source = sc.nextInt();
                        System.out.print("Masukkan Destination\t: ");
                        destination = sc.nextInt();

                        grp.graphType(source, destination);
                    }
                    System.out.println("");
                    grp.printGraph();
                }
            }while (menu != 1 && menu != 2);
        }
    }
    ```
    
3. ```java
   public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i< vertex; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }
    ```

4. A) 
   ```java
   package JS12.Tugas4A;

    public class Graph <T> {
        T[] vertex;
        DoubleLinkedList list[];

        public Graph(T[] vertex) {
            this.vertex = vertex;
            list = new DoubleLinkedList[vertex.length];
            for (int i = 0; i < vertex.length; i++) {
                list[i] = new DoubleLinkedList();
            }
        }
        public void addEdge(int source, int destination) {
            list[source].addFirst(destination);
            list[destination].addFirst(source);
        }

        public void degree(int source) throws Exception {
            System.out.println("degree vertex " + vertex[source] + " : " + list[source].size());

            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex.length; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if(list[i].get(j) == source)
                        ++totalIn;
                }
                for (k = 0; k < list[source].size(); k++) {
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree dari vertex " + vertex[source] + " : " +totalIn);
            System.out.println("Outdegree dari vertex " + vertex[source] + " : " +totalOut);
            System.out.println("Degree vertex " + vertex[source] + " : " +(totalIn + totalOut));
        }
        public void removeEdge(int source, int destination) throws Exception {
            for (int i = 0; i < vertex.length; i++) {
                if(i==destination) {
                    list[source].remove(destination);
                }
            }
        }
        public void removeAllEdges() {
            for (int i = 0; i < vertex.length; i++) {
                list[i].clear();
            }
            System.out.println("Graph berhasil dikosongkan");
        }
        public void printGraph() throws Exception {
            for (int i = 0; i < vertex.length; i++) {
                if(list[i].size() > 0 ) {
                    System.out.print("Vertex " + vertex[i] + " terhubung dengan : ");
                    for(int j = 0; j < list[i].size(); j++) {
                        System.out.print(vertex[list[i].get(j)] + " ");
                    }
                    System.out.println("");
                }
            }
            System.out.println(" ");
        }
        boolean graphType(int source, int destination){
            list[source].addFirst(destination);
            return true;
        }
    }
    ```
    Main Class :

    ```java
    package JS12.Tugas4A;
    import java.util.Scanner;

    public class GraphMain {

        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan Vertex\t\t\t: ");
            String[] vertex = new String[sc.nextInt()];
            sc.nextLine();

            for (int i = 0; i < vertex.length; i++) {
                System.out.print("Masukkan data vertex ke-" + i + "\t: ");
                vertex[i] = sc.nextLine();
            }

            Graph<String> gph = new Graph<String>(vertex);

            System.out.print("Masukkan Edge\t\t\t: ");
            int edge = sc.nextInt();

            int menu;
            do {
                System.out.println("Pilih menu dibawah ini");
                System.out.println("1. Directed\n2. Undirected");
                System.out.print("Masukkan Menu : ");
                menu = sc.nextInt();

                System.out.println("Masukkan Edge: <from> <to>");
                if(menu == 1) {
                    for (int i = 0; i < edge; i++) {
                        gph.graphType(sc.nextInt(), sc.nextInt());
                    }
                    gph.printGraph();

                } else if (menu == 2) {
                    for (int i = 0; i < edge; i++) {;
                        gph.addEdge(sc.nextInt(), sc.nextInt());
                    }
                    gph.printGraph();
                }
            } while (menu!=1 && menu!=2);
            sc.close();
        }
    }
    ```

    B)
    ```java
    package JS12.Tugas4B;

    public class GraphArray<T> {
        private final T[] vertices;
        private final int[][] twoD_array;

        public GraphArray(T[] v) {
            vertices = v;
            twoD_array = new int[vertices.length + 1][vertices.length +1];
        }

        public void makeEdge(int to, int from, int edge) {
            try {
                twoD_array[to][from] = edge;
            }
            catch (ArrayIndexOutOfBoundsException index) {
                System.out.println("Vertex tidak ada");
            }
        }

        public int getEdge(int to, int from) {
            try{
                return twoD_array[to][from];
            }
            catch (ArrayIndexOutOfBoundsException index)
            {
                System.out.println("Vertex tidak ada");
            }
            return -1;
        }
    }
    ```

    Main Class :

    ```java
    package JS12.Tugas4B;
    import java.util.Scanner;

    public class GraphArrayMain {

        public static void main(String[] args) {
            int v, e, count = 1, to = 0, from = 0;
            Scanner sc = new Scanner(System.in);

            GraphArray<String> graph;

            try {
                System.out.print("Masukkan Jumlah Vertices\t: ");
                v = sc.nextInt();
                System.out.print("Masukkan Jumlah Edges\t\t: ");
                e = sc.nextInt();

                String[] vertexs = new String[v + 1];
                sc.nextLine();
                for (int i = 1; i <= v; i++) {
                    System.out.print("Masukkan data vertex ke-" + i + " : ");
                    vertexs[i] = sc.nextLine();
                }
                graph = new GraphArray<String>(vertexs);

                System.out.println("Masukkan Edge: <to> <from>");
                while (count <= e) {
                    to = sc.nextInt();
                    from = sc.nextInt();
                    graph.makeEdge(to, from, 1);
                    count++;
                }
                System.out.println("Array 2D sebagai representasi graph sbb: ");
                System.out.print("\t");
                for (int i = 1; i <= v; i++) {
                    System.out.print(vertexs[i] + "\t");
                }
                System.out.println();

                for (int i = 1; i <= v; i++) {
                    System.out.print(vertexs[i] + "\t");
                    for (int j = 1; j <= v; j++) {
                        System.out.print(graph.getEdge(i, j) + "\t");
                    }
                    System.out.println();
                }
            } catch (Exception E) {
                System.out.println("Error, Silahkan cek kembali\n" + E.getMessage());
            }
            sc.close();
        }
    }
    ```

