import java.util.Scanner;

public class StarNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i;

        System.out.print("Masukkan nilai n = ");
        n = sc.nextInt();

        sc.close();

        for (i = 1 ; i <= n; i++) {
            System.out.print("*");
        }
    }
}