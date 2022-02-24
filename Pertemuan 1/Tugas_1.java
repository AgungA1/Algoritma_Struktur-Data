package JS1;

public class Tugas_1 {
    public static void main(String[] args) {
        int tarif = 4500;
        double diskon = 0.05;
        int total1 = 0,total2 = 0;
        String nama [] = {"Ani","Budi","Bina","Cita"};
        int kg [] = {4, 15, 6, 11};

        for (int i = 0; i < kg.length; i++){
            if (kg[i] > 10){
                System.out.print(nama[i] + ": Rp. ");
                double potongan = kg[i] * tarif * diskon;
                System.out.println((kg[i] * tarif)-(int)potongan  + ",00");
                total1 += (kg[i] * tarif)-(int)potongan;
            }else {
                System.out.print(nama[i] + ": Rp. ");
                System.out.println(kg[i] * tarif + ",00");
                total2 += kg[i] * tarif;
            }
        }
        System.out.println("Pendapatan Smile Laundry : Rp."+ (total1+total2) + ",00");


    }
}
