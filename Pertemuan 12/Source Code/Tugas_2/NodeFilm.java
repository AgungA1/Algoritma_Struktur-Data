package JS10.Tugas_2;

public class NodeFilm {
    int dataId;
    String dataJudul;
    float dataRating;
    NodeFilm prev, next;

    NodeFilm(NodeFilm prev, int id, String judul, float rating, NodeFilm next){
        this.prev=prev;
        this.dataId=id;
        this.dataJudul=judul;
        this.dataRating=rating;
        this.next=next;
    }
}
