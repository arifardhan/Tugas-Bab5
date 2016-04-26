package Praktikum5;

import java.util.Scanner;

public class MainMenghitung {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih = 0;
        while (pilih != 6) {
            System.out.println("++++    Menu    ++++");
            System.out.println("(1) Penjumlahan");
            System.out.println("(2) Pengurangan");
            System.out.println("(3) Perkalian");
            System.out.println("(4) pembagian");
            System.out.println("(5) Penyederhanaan");
            System.out.println("(6) Keluar");
            System.out.println("===================");
            System.out.print("Masukkan pilihan");
            pilih = in.nextInt();
            
        }
    }
}
