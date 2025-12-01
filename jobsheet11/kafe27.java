package jobsheet11;

import java.util.Scanner;

public class kafe27 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Menu("Andi", true, "DISKON30");

    System.out.print("\nBerapa jenis menu yang ingin dipesan? ");
    int jumlahMenu = sc.nextInt();

    int totalKeseluruhan = 0;

    for (int i = 1; i <= jumlahMenu; i++) {
        System.out.println("\nPesanan ke-" + i);

        System.out.print("Masukkan nomor menu: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah porsi: ");
        int banyakItem = sc.nextInt();

        int total = hitungTotalHargaNoPresensi(pilihanMenu, banyakItem, "DISKON30");

        totalKeseluruhan += total;
    }

    System.out.println("\n===========================");
    System.out.println("Total keseluruhan pesanan: Rp " + totalKeseluruhan);
    System.out.println("===========================");

    sc.close();
}

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% dari program membership.");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo diterapkan! Anda mendapatkan DISKON 50% 🎉");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo diterapkan! Anda mendapatkan DISKON 30% 🎉");
        } else {
            System.out.println("Kode promo invalid");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHargaNoPresensi(int pilihanMenu, int jumlahPesanan, String kodePromo) {
    int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

    int totalHarga = hargaItems[pilihanMenu - 1] * jumlahPesanan;

    if (kodePromo.equals("DISKON50")) {
        System.out.println("Diskon 50% diterapkan!");
        totalHarga = totalHarga / 2;
    } 
    else if (kodePromo.equals("DISKON30")) {
        System.out.println("Diskon 30% diterapkan!");
        totalHarga = (int)(totalHarga * 0.7);
    } 
    else {
        System.out.println("Kode promo invalid (tidak ada diskon).");
    }

    return totalHarga;
    }

}
