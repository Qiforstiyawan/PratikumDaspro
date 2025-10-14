import java.util.Scanner;

public class Rofiq27 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //deklarasai//
        int biayaKos27 = 1000000;
        int internet27 = 200000;
        int uangSaku27 = 3000000;
        int biayaMakanPerHari27, biayaTransportasiPerHari27, sebulan27;
        double biayaMakanSebulan27, biayaTransportasiSebulan27, totalBiaya27, rataRataBiaya27, selisih27;

        //input//
        System.out.println("Masukkan biaya makan per hari = ");
        biayaMakanPerHari27 = sc.nextInt();
        System.out.println("Biaya transportasi per hari = ");
        biayaTransportasiPerHari27 = sc.nextInt();
        System.out.println("Masukkan jumlah hari dalam satu bulan = ");
        sebulan27 = sc.nextInt();
        sc.close();

        //proses//
        biayaMakanSebulan27 = biayaMakanPerHari27 * sebulan27;
        biayaTransportasiSebulan27 = biayaTransportasiPerHari27 * sebulan27;
        totalBiaya27 = biayaMakanSebulan27 + biayaTransportasiSebulan27 + biayaKos27 + internet27;
        rataRataBiaya27 = totalBiaya27 / sebulan27;
        selisih27 = uangSaku27 - totalBiaya27;

        //output//
        System.out.println("Total pengeluaran sebulan = " + totalBiaya27);
        System.out.println("Rata rata pengeluaran sebulan = " + rataRataBiaya27);
        System.out.println("Selisih uang saku dengan pengeluaran = " + selisih27);
    }
    
}