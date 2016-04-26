package Praktikum5;

public class Produksi {

    public String produk[] = {"Jaket A", "Jaket B", "Jaket C"};
    public final int hargajaket[] = {100000, 125000, 175000};
    public int jumlah[];
    public int diskon[] = {5000, 5000, 15000};
    public int harga[] = new int[3];
    public int bayar;

    public void setBeli(int a[]) {
        jumlah = a;
        bayar = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] > 100) {
                harga[i] = (hargajaket[i] * a[i]) - (diskon[i] * a[i]);
            } else {
                harga[i] = (hargajaket[i] * a[i]);
            }
            bayar += harga[i];
        }
    }

    public void cetakHarga() {
        System.out.println("Nama    Jumlah    Harga");
        for (int i = 0; i < 3; i++) {
            System.out.println(produk[i] + "    " + jumlah[i] + "      Rp." + harga[i]);
        }
        System.out.println("=======================================");
        System.out.println("Total Harga: Rp." + bayar);
    }
}
