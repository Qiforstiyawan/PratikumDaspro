package jobsheet11;

import java.util.Scanner;

public class kubus27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Input Sisi Kubus ===");
        System.out.print("Masukkan nilai sisi: ");
        double s = input.nextDouble();

        double vol = hitungVolume(s);
        double lp = hitungLuasPermukaan(s);

        System.out.println("Volume Kubus\t\t: " + vol);
        System.out.println("Permukaan Kubus\t\t: " + lp);
    }

    static double hitungVolume(double x){
        // x^3
        return x * x * x;
    }

    static double hitungLuasPermukaan(double y){
        // 6 * sisi^2
        double luasSatuan = y * y;
        return 6 * luasSatuan;
    }
}
