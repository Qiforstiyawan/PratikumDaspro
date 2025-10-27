package Jobsheet7;

import java.util.Scanner;

public class siakadForNoPresensi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
                if (nilai > tertinggi) {
                    tertinggi = nilai;
                }
                if (nilai < terendah) {
                    terendah = nilai;
                }
                if (nilai <= 60) {
                    lulus++;
                } else {
                    tidakLulus++;
                }
        }   

        sc.close();

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendadah: " + terendah);
        System.out.println("Jumlah mahasiswa yg lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yg tidak lulus: " + tidakLulus);
    }
}