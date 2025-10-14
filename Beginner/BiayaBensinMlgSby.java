import java.util.Scanner;

public class BiayaBensinMlgSby {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jarak;
        double pemakaian, biaya;

        System.out.println("masukkan jarak perjalanan (km): ");
        jarak = sc.nextInt();

        sc.close();
        
        pemakaian   = jarak / 2;
        biaya       = pemakaian * 10000;

        System.out.println("Biaya bensin yang diperlukan: Rp. " + biaya);
    }
}
