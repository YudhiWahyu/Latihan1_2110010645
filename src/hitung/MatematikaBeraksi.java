package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //objek 
        Matematika Wahyudhi = new Matematika(4,5);
    
        System.out.println("Hasil Penjumlahan : " +Wahyudhi.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " +Wahyudhi.setPengurangan());
        System.out.println("Hasil Perkalian   : " +Wahyudhi.setPerkalian());
        System.out.println("Hasil Pembagian   : " +Wahyudhi.setPembagian());
    }
}
