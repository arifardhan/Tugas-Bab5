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
            System.out.print("Masukkan pilihan  : ");
            pilih = in.nextInt();
            Menghitung hitung = new Menghitung();
            switch (pilih) {
                case 1:
                    System.out.println();
                    System.out.println("+PENJUMLAHAN+");
                    System.out.print("masukkan nilai 1 : ");
                    int nil1 = in.nextInt();
                    System.out.print("masukkan nilai 2 : ");
                    int nil2 = in.nextInt();
                    Menghitung.penjumlahan(nil1, nil2);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("-PENGURANGAN-");
                    System.out.print("masukkan nilai 1 : ");
                    int nilai1 = in.nextInt();
                    System.out.print("masukkan nilai 2 : ");
                    int nilai2 = in.nextInt();
                    Menghitung.pengurangan(nilai1, nilai2);
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("x PERKALIAN x");
                    System.out.print("masukkan nilai 1 : ");
                    int nilaia = in.nextInt();
                    System.out.print("masukkan nilai 2 : ");
                    int nilaib = in.nextInt();
                    hitung.perkalian(nilaia, nilaib);
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println(": PEMBAGIAN :");
                    System.out.print("masukkan nilai 1 : ");
                    int nilaix = in.nextInt();
                    System.out.print("masukkan nilai 2 : ");
                    int nilaiy = in.nextInt();
                    hitung.pembagian(nilaix, nilaiy);
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("/ PENYEDERHANAAN /");
                    System.out.print("masukkan nilai 1 : ");
                    int a = in.nextInt();
                    System.out.print("masukkan nilai 2 : ");
                    int b = in.nextInt();
                    hitung.sederhana(a, b);
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Terimakasih");
                    break;
                default: 
                    System.out.println();
                    System.out.println("Maaf menu tidak terdaftar...");
                    System.out.println();
            }
        }
    }
}
