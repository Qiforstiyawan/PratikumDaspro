import java.util.Scanner;

public class CicilanMotorPakAli {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int harga, uangMuka;
        double sisaHarga, bunga, cicilan, lamaCicilan;

        System.out.println("Masukkan harga motor :Rp. ");
        harga = sc.nextInt();
        System.out.println("Masukkan uang muka :Rp. ");
        uangMuka = sc.nextInt();
        System.out.println("Masukkan lama cicilan (bulan): ");
        lamaCicilan = sc.nextInt();

        sc.close();

        sisaHarga   = harga + uangMuka;
        bunga       = 0.01 * sisaHarga * lamaCicilan;
        cicilan     = (sisaHarga + bunga) / lamaCicilan;

        System.out.println("Jumlah cicilan per bulan yang harus dibayar: Rp.  " +cicilan);
    }
}
