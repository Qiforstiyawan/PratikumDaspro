import java.util.Scanner;

public class nestedUjianSkripsiNoPrefensi {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan pembimbing 1: ");
        int pembimbing1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 2: ");
        int pembimbing2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase(bebasKompen= "Ya")) {
            if (pembimbing1 >= 8 && pembimbing2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (pembimbing1 < 8 && pembimbing2 < 4) {
                pesan = "Gagal! log bimbingan pembimbing 1 kurang dari 8 kali dan pembimbing 2 kurang dari 4 kali";
            } else if (pembimbing1 < 8) {
                pesan = "Gagal! log bimbingan pembimbing 1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! log bimbingan pembimbing 2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! log mahasiswa masih belum memiliki tanggungan kompen";
        }
        System.out.println(pesan);
        sc.close();
    }
}