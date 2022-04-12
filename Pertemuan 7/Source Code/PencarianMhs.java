package JS6;

public class PencarianMhs {
    Mahasiswa listMhs[];
    int idx;

    PencarianMhs(int jumMhs){
        listMhs = new Mahasiswa[jumMhs];
    }

    void tambah(Mahasiswa m){
        if(idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("--------------");
        }
    }

    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++){
            if(listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;
            if(cari == listMhs[mid].nim){
                return(mid);
            } else if(listMhs[mid].nim < cari){
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    public void Tampilposisi(int x, int pos){
        if(pos!= -1){
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos){
        if (pos!= -1){
            System.out.println("Nim : " + x);
            System.out.println("Nama : " + listMhs[pos].nama);
            System.out.println("Umur : "+ listMhs[pos].umur);
            System.out.println("IPK : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}
