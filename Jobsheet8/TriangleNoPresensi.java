import java.util.Scanner;

public class TriangleNoPresensi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i = 0;

        System.out.print("Masukkan nilai n = ");
        n = sc.nextInt();

        sc.close();
        
        while (i <= n) {
            int j = 0;
            while (j < n) {
                System.out.print("*");
                j++;
            }
            i++;
        }
    }
}