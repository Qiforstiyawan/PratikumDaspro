import java.util.Scanner;

public class SquareNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, iOuter;

        System.out.print("Masukkan nilai n = ");
        n = sc.nextInt();

        sc.close();

        for (iOuter = 1; iOuter <= n; iOuter++) {
           for (i = 1; i <= n; i++) {
               System.out.print("*");
            }
            System.out.println();
        }
    }   
}