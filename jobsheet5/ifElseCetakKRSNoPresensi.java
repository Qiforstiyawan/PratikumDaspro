import java.util.Scanner;

public class ifElseCetakKRSNoPresensi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad ---");
        System.out.print("Masukkan semester tahun ini: ");
        int semester = sc.nextInt();

        String pesan = (semester >= 1 && semester <= 8)
        ? "KRS semester " + semester + " ditampilkan"
        : "Semester tidak valid";
        System.out.println("== Versi Ternary Operator ==");
        System.out.println(pesan);

    sc.close();
    }
}
