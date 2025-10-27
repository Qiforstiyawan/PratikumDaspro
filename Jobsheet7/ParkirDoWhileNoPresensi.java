package Jobsheet7;

import java.util.Scanner;

public class ParkirDoWhileNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenisKendaraan;
        double durasi, totalBayar;
        double totalPendapatan = 0;
        final int tarifMobil = 3000;
        final int tarifMotor = 2000;
        final int tarifMaks = 12500;

        System.out.println("=== PROGRAM PARKIR HARIAN ===");
        System.out.println("Masukkan jenis kendaraan: ");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("(Ketik 0 untuk keluar)\n");

        do {
            System.out.print("Pilih jenis kendaraan (1/2 atau 0 untuk keluar): ");
            jenisKendaraan = sc.nextInt();

            // kondisi berhenti
            if (jenisKendaraan == 0) {
                System.out.println("Program selesai.");
                break;
            }

            // validasi input jenis kendaraan
            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Jenis kendaraan tidak valid! Silakan input ulang.");
                continue;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextDouble();

            // validasi input durasi
            if (durasi <= 0) {
                System.out.println("Durasi parkir tidak valid! Silakan input ulang.");
                continue;
            }

            // perhitungan tarif parkir
            if (durasi > 5) {
                totalBayar = tarifMaks; // tarif tetap
            } else {
                if (jenisKendaraan == 1) {
                    totalBayar = durasi * tarifMobil;
                } else {
                    totalBayar = durasi * tarifMotor;
                }
            }

            System.out.println("Total biaya parkir: Rp " + totalBayar);
            totalPendapatan += totalBayar;

        } while (true);

        System.out.println("\n=== REKAP TOTAL HARIAN ===");
        System.out.println("Total pendapatan parkir hari ini: Rp " + totalPendapatan);

        sc.close();
    }
}
