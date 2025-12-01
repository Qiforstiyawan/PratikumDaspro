package jobsheet11;

import java.util.Scanner;

public class nilaiMahasiswa27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int jumlah = scan.nextInt();

        double[] dataNilai = new double[jumlah];

        isiNilai(dataNilai, scan);
        tampilkanNilai(dataNilai);

        double total = totalNilai(dataNilai);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + total);
    }

    static void isiNilai(double[] arr, Scanner scan) {
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + index++ + ": ");
            arr[i] = scan.nextDouble();
        }
    }

    static void tampilkanNilai(double[] arr) {
        System.out.println("\nDaftar nilai mahasiswa:");
        int nomor = 1;
        for (double nilai : arr) {
            System.out.println("Mahasiswa ke-" + nomor++ + ": " + nilai);
        }
    }

    static double totalNilai(double[] arr) {
        double jumlah = 0;
        for (double a : arr) {
            jumlah += a;
        }
        return jumlah;
    }
}
