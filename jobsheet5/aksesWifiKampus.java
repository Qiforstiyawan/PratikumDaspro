import java.util.Scanner;

public class aksesWifiKampus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pengguna;
        int sks = 0;

        System.out.print("kamu civitas kampus sebagai: ");
        pengguna = sc.nextLine();
    
        if (pengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses wifi diberikan (Dosen)");
        } 
        else if (pengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            sks = sc.nextInt();

            if (sks >= 12) {
                System.out.println("Akses diberikan (Mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12.");
            }
        } 
        else {
            System.out.println("Akses ditolak, bukan civitas kampus.");
        }
        sc.close();
    }
}