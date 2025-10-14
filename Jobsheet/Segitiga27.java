import java.util.Scanner;

public class Segitiga27 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int alas, tinggi;
        float luas;

        System.out.println("Masukkan alas segitiga: ");
        alas = sc.nextInt();

        System.out.println("Masukkan tinggi segitga: ");
        tinggi = sc.nextInt();
        sc.close();

        luas = 0.5f * alas * tinggi;

        System.out.println("Luas segitiga adalah: " + luas);
    }
}