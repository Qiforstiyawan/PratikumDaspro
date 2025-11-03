import java.util.Scanner;

public class NilaiKelompok27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j, nilai;
        float totalNilai, rataNilai;
        float rataTertinggi = 0;
        int kelompokTertinggi = 0;

        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);

            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

            i++;
        }

        System.out.println("\nKelompok dengan nilai rata-rata tertinggi:");
        System.out.println("Kelompok " + kelompokTertinggi + " dengan rata-rata " + rataTertinggi);

        sc.close();
    }
}
