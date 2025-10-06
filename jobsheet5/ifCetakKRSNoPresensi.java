import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas){
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Pembayaran belum lunas, silakan melakukan pembayara terlebih dahulu");
        }
        
        sc.close();
    }
}