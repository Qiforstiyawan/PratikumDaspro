import java.util.Scanner;

public class perpustakaanKampus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String skm, registrasi;

        System.out.print("Apakah kamu membawa SKM (iya/tidak): ");
        skm = sc.nextLine();
        System.out.print("Apakah sudah melakukan registrasi (iya/tidak): ");
        registrasi = sc.nextLine();

        if (skm.equalsIgnoreCase("iya")) {
            System.out.println("Boleh masuk");
        } else if (registrasi.equalsIgnoreCase("iya")) {
            System.out.println("Boleh masuk");
        } else {
            System.out.println("Tidak boleh masuk");
        }
        sc.close();
    }
}