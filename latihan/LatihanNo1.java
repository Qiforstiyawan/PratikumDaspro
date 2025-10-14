import java.util.Scanner;

public class LatihanNo1 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //deklarasi//
        int lamaSewa, jarakTempuh, biayaSewa, biayaSupir, biayaBensin, totalBiaya;
        int sewaPerhari = 300000;
        int supirPerhari = 200000;
        int bensinPerKm = 1000;

        //input//
        System.out.println("Masukkan lama sewa (hari)");
        lamaSewa = sc.nextInt();
        System.out.println("Masukkan jarak tempuh (km)");
        jarakTempuh = sc.nextInt();
        sc.close();

        //proses//
        biayaSewa = sewaPerhari * lamaSewa;
        biayaSupir = supirPerhari * lamaSewa;
        biayaBensin = bensinPerKm * jarakTempuh;
        totalBiaya = biayaSewa + biayaSupir + biayaBensin;

        //output//
        System.out.println("Total biaya sewa mobil adalah Rp. " +totalBiaya);
    }
}
