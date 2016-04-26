package Praktikum5;

import java.util.Scanner;

public class Mainproduksi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         Produksi jaket = new Produksi();
         int a[] = new int[3];
         System.out.println("======CV.Labkomdas======");
         for (int i = 0; i < 3; i++) {
             System.out.print("Masukkan Jumlah "+jaket.produk[i]+" : ");
             a[i]=in.nextInt();
         }
         jaket.setBeli(a);
         System.out.println("========================================");
         jaket.cetakHarga();

    }
}
