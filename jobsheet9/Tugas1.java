package jobsheet9;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlah = sc.nextInt();
        int[] nilaiMhs = new int[jumlah];

        // Input nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        // Hitung rata-rata, nilai tertinggi, dan terendah
        int total = 0;
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        double rataRata = (double) total / nilaiMhs.length;

        // Output hasil
        System.out.println("\nDaftar nilai yang dimasukkan:");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }

        System.out.println("\nNilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        sc.close();
    }
}