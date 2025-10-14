import java.util.Scanner;

public class Bank27 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double presentase_bunga =0.02, bunga, jml_tabungan_akhir;

        System.out.println("Masukkan jumlah awal tabungan anda");
        jml_tabungan_awal = input.nextInt();
        System.out.println("Masukkan lama menabung anda");
        lama_menabung = input.nextInt();
        input.close();

        bunga = lama_menabung * presentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = bunga + jml_tabungan_awal;

        System.out.println("Bunga adalah: "+ bunga);
        System.out.println("Jumlah tabungan akhir anda adalah: "+ jml_tabungan_akhir);
    }
}