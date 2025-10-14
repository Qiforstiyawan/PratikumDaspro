import java.util.Scanner;

public class Tugas27_1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int gajiPokok, tunjanganAnak , jumlahAnak, gajiKotor;
        double persentasePotongan =0.05, gajiBersih, potongan;

        System.out.println("masukkan gaji pokok yang diterima");
        gajiPokok = sc.nextInt();
        System.out.println("Masukkan jumlah anak yang dimiliki");
        jumlahAnak = sc.nextInt();
        System.out.println("Masukkan tunjangan anak per bulan");
        tunjanganAnak = sc.nextInt();
        sc.close();
        
        tunjanganAnak = jumlahAnak * tunjanganAnak;
        potongan      = persentasePotongan * tunjanganAnak;
        gajiKotor     = gajiPokok + tunjanganAnak;
        gajiBersih    = gajiKotor - potongan;

        System.out.println("Gaji bersih Bu Jesi senilai: "+ gajiBersih);

    }
}
