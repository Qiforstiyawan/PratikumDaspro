package jobsheet10;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int JUMLAH_RESPONDEN = 10;
        int JUMLAH_PERTANYAAN = 6;

        int[][] nilai = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];

        System.out.println("=== INPUT HASIL SURVEI ===");

        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.println("\nResponden ke-" + (i + 1));

            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                int jawaban;

                do {
                    System.out.print("Nilai pertanyaan " + (j + 1) + " (1-5): ");
                    jawaban = sc.nextInt();
                } while (jawaban < 1 || jawaban > 5);

                nilai[i][j] = jawaban;
            }
        }

        System.out.println("\n=== RATA-RATA PER RESPONDEN ===");

        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            double total = 0;

            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                total += nilai[i][j];
            }

            double rata = total / JUMLAH_PERTANYAAN;
            System.out.println("Responden " + (i + 1) + ": " + rata);
        }

        System.out.println("\n=== RATA-RATA PER PERTANYAAN ===");

        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            double total = 0;

            for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
                total += nilai[i][j];
            }

            double rata = total / JUMLAH_RESPONDEN;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata);
        }

        double totalSemua = 0;

        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                totalSemua += nilai[i][j];
            }
        }

        double rataKeseluruhan = totalSemua / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN);

        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        System.out.println("Nilai rata-rata keseluruhan: " + rataKeseluruhan);

        sc.close();
    }
}
