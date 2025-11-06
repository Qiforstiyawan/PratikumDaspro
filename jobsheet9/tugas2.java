package jobsheet9;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];

        // Input data pesanan
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine();
        }

        // Hitung total biaya
        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += hargaPesanan[i];
        }

        // Tampilkan daftar pesanan
        System.out.println("\n===== DAFTAR PESANAN =====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }

        System.out.println("==========================");
        System.out.println("Total biaya: Rp " + total);
        System.out.println("==========================");

        sc.close();
    }
}
