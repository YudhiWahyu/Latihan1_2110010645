package hitung;

public class Matematika {
    private double bil1, bil2;

//KONSTUKTOR
public Matematika (double bil1, double bil2) {
    this.bil1 = bil1;
    this.bil2 = bil2;
}

//PENJUMLAHAN
double setPenjumlahan(){
    return bil1 + bil2;
}

//PENGURANGAN
double setPengurangan(){
    return bil1 - bil2; 
}

//PERKALIAN
double setPerkalian(){
    return bil1 * bil2;
}

//PEMBAGIAN
double setPembagian(){
    return bil1 / bil2;
}
    
}
