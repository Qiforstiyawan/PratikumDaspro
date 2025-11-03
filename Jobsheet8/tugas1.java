import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        int n, kuadrat, sum;

        System.out.print("Masukkan rentang n\t: ");
        n = sc.nextInt();
        
        for (i = 1; i <= n; i++) {
            sum = 0;
            System.out.print("n = " + i + " -> jumlah kuadrat = ");

            for (j = 1; j <= i; j++) {
                kuadrat = j * j;
                sum += kuadrat;
                System.out.print(kuadrat);
                
                if (j < i) System.out.print(" + ");   
            }
            System.out.println(" = " + sum);
        }
        sc.close();
    }
}