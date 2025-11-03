import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i , j;
        System.out.print("Masukkan nilai n (minimal 3): ");
        n = sc.nextInt();
        
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
        sc.close();
    }
}