package Jobsheet7;

import java.util.Scanner;

public class bioskopDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int hargaTiket = 50000;
        int jumlahTiket, totalTiket = 0;
        double totalPenjualan = 0;
        String namaPelanggan;
        double totalHarga, diskon = 0;

        System.out.println("=== Program Penjualan Tiket Bioskop ===");

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'selesai' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            // kondisi berhenti
            if (namaPelanggan.equalsIgnoreCase("selesai")) {
                System.out.println("Input penjualan selesai.");
                break;
            }

            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();

            // validasi input
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan input ulang!");
                sc.nextLine();
                continue;
            }

            totalHarga = jumlahTiket * hargaTiket;

            // diskon
            if (jumlahTiket > 10) {
                diskon = 0.15 * totalHarga;
                System.out.println("Diskon 15% diberikan!");
            } else if (jumlahTiket > 4) {
                diskon = 0.10 * totalHarga;
                System.out.println("Diskon 10% diberikan!");
            }

            totalHarga -= diskon;

            System.out.println("Total harga untuk " + namaPelanggan + ": Rp " + totalHarga);

            // update total keseluruhan
            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            sc.nextLine();
        } while (true);

        // hasil akhir
        System.out.println("\n=== Rekapitulasi Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total pendapatan    : Rp " + totalPenjualan);

        sc.close();
    }
}
