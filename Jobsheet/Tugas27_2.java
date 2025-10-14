import java.util.Scanner;

public class Tugas27_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lebarTanah , panjangTanah , diameterLingkaran, sisiPersegi, luasTanah, luasPersegi;
        double luasLingkaran, totalLuasKolam, luasRumput;

        System.out.println("Masukkan panjang tanah");
        panjangTanah = sc.nextInt();
        System.out.println("Masukkan lebar tanah");
        lebarTanah = sc.nextInt();
        System.out.println("Masukkan diameter lingkaran");
        diameterLingkaran = sc.nextInt();
        System.out.println("Masukkan sisi persegi");
        sisiPersegi = sc.nextInt();
        sc.close();

        luasTanah = panjangTanah * lebarTanah;
        luasLingkaran = Math.PI * diameterLingkaran;
        luasPersegi = sisiPersegi * sisiPersegi;
        totalLuasKolam = luasLingkaran + luasPersegi;
        luasRumput = luasTanah - totalLuasKolam;

        System.out.println("Jadi luas tanah yg ditanamin rumput adalah: "+ luasRumput);

    }
}

