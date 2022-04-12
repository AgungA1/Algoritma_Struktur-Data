package JS6;

public class NilaiSort {
    Nilai dataArray[] = new Nilai[10];
    int idx;

    public void tambah(Nilai t){
        if(idx < dataArray.length) {
            dataArray[idx] = t;
            idx++;
        }
    }

    public void bubbleSort(){
        for(int i=0; i< dataArray.length-1; i++){
            for(int j=1; j< dataArray.length-i; j++){
                if(dataArray[j].arr < dataArray[j-1].arr){
                    Nilai tmp = dataArray[j];
                    dataArray[j] = dataArray[j-1];
                    dataArray[j-1] = tmp;
                }
            }
        }
    }

    public int BinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;
            if(cari == dataArray[mid].arr){
                return(mid);
            } else if(dataArray[mid].arr > cari){
                return BinarySearch(cari, left, mid-1);
            } else {
                return BinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    public void tampil(){
        for(Nilai t : dataArray){
            t.tampil();
        }
    }

    public void posisi(int x, int pos){
        if(pos!= -1){
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void Max(){
        int datMax = 0;
        for(int i=0; i<dataArray.length; i++){
            if (datMax < dataArray[i].arr){
                datMax = dataArray[i].arr;
            }
        }
        System.out.println(datMax);

        int index = 0;
        for(int i=0; i< dataArray.length;i++){
            if (dataArray[i].arr == datMax){
                index= index+1;
            }
        }
        System.out.println("Dengan jumlah indexs = " + index);
        System.out.println("Pada Index ke : ");

        for(int i=0; i< dataArray.length;i++){
            if(dataArray[i].arr == datMax){
                System.out.println(i+ " ");
            }
        }
    }
}
