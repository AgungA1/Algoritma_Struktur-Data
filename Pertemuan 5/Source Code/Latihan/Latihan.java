package JS4;

public class Latihan {
    public int jumlah;
    public String[] kandidat;

    Latihan(int jumlah) {
        this.jumlah = jumlah;
        this.kandidat = new String[jumlah];
    }

    public int ModusArray(String[] nama, int awal, int length, int hasil) {
        int middle = length / 2;
        int akhirArrayKiri = middle - 1;
        int akhirArrayKanan = length - 1;
        return rekursifDC(nama, awal, hasil, akhirArrayKanan, akhirArrayKiri, middle);
    }

    public int rekursifDC(String[] nama, int awal, int hasil, int akhirArrayKanan, int akhirArrayKiri, int middle) {
        if (akhirArrayKanan == (akhirArrayKiri + 1) && akhirArrayKiri == (awal + 1)) {
            return hasil;
        } else {
            if (awal != akhirArrayKiri) {
                if (nama[awal].equalsIgnoreCase(nama[akhirArrayKiri])) {
                    return hasil = awal;
                } else {
                    return rekursifDC(nama, awal, hasil, akhirArrayKanan, (akhirArrayKiri - 1), middle);
                }
            } else {
                if (nama[middle].equalsIgnoreCase(nama[akhirArrayKanan])) {
                    return hasil = middle;
                } else {
                    return rekursifDC(nama, middle, hasil, (akhirArrayKanan - 1), akhirArrayKiri, middle);
                }
            }
        }
    }
}
