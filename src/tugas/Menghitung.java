package Praktikum5;

public class Menghitung {

    public static void penjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("hasil = " + nilai);
    }

    public static void pengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("hasil = " + nilai);
    }

    public void perkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("hasil = " + nilai);
    }

    public void pembagian(int a, int b) {
        double nilai = (double) a / b;
        System.out.println("hasil = " + nilai);
    }

    public void sederhana(int a, int b) {
        int temp, bil1, bil2;
         if(b==0){
             return;
        }
        bil1 = (a < b) ? b:a;
        bil2 = (a < b) ? a:b;
        while(bil2!=0){
            temp = bil1%bil2;
            bil1=bil2;
            bil2=temp;
        }
        a /=bil1;
        b /=bil1;
        System.out.println("Hasil = "+a+"/"+b);
    }

}
