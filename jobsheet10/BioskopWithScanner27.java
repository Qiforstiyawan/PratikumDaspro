package jobsheet10;
import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();

                    int baris, kolom;

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Kursi tersebut tidak ada. Coba lagi.");
                            continue;
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi. Pilih kursi lain.");
                        } else {
                            break;
                        }
                    }

                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil disimpan.");

                    System.out.print("Input penonton lainnya? (y/n): ");
                    String next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }

            } else if (menu == 2) {
                System.out.println("\n=== DAFTAR PENONTON ===");

                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(isi + " ");
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Keluar dari program.");
                break;

            } else {
                System.out.println("Menu tidak valid.");
            }
        }
    }
}