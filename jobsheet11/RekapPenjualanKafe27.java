package jobsheet11;

import java.util.Scanner;

public class RekapPenjualanKafe27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input jumlah menu
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = scan.nextInt();
        scan.nextLine();

        // Input nama menu
        String[] menu = new String[jumlahMenu];
        for (int m = 0; m < jumlahMenu; m++) {
            System.out.print("Nama menu ke-" + (m + 1) + ": ");
            menu[m] = scan.nextLine();
        }

        // Input jumlah hari
        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahHari = scan.nextInt();

        // Array data penjualan
        int[][] data = new int[jumlahMenu][jumlahHari];

        isiDataPenjualan(data, menu, scan);
        tampilkanTabelPenjualan(data, menu);
        cariMenuTerlaris(data, menu);
        tampilkanRataRata(data, menu);

        scan.close();
    }

    // ===== Input penjualan =====
    static void isiDataPenjualan(int[][] data, String[] menu, Scanner scan) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("\nInput penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                data[i][j] = scan.nextInt();
            }
        }
    }

    // ===== Tampilkan tabel =====
    static void tampilkanTabelPenjualan(int[][] data, String[] menu) {
        System.out.println("\nTABEL PENJUALAN");
        System.out.print("Menu\t\t");

        for (int h = 0; h < data[0].length; h++) {
            System.out.print("H" + (h + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.print((menu[i].length() < 7 ? menu[i] + "\t\t" : menu[i] + "\t"));

            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // ===== Menu terlaris =====
    static void cariMenuTerlaris(int[][] data, String[] menu) {
        int indexMax = 0;
        int totalMax = -1;

        for (int i = 0; i < data.length; i++) {
            int total = 0;

            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }

            if (total > totalMax) {
                totalMax = total;
                indexMax = i;
            }
        }

        System.out.println("\nMenu dengan total penjualan tertinggi:");
        System.out.println("Nama menu  : " + menu[indexMax]);
        System.out.println("Total jual : " + totalMax);
    }

    // ===== Rata-rata tiap menu =====
    static void tampilkanRataRata(int[][] data, String[] menu) {
        System.out.println("\nRata-rata penjualan per menu:");

        for (int i = 0; i < data.length; i++) {
            int total = 0;

            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }

            double rata = (double) total / data[i].length;
            System.out.println(menu[i] + " : " + rata);
        }
    }
}
