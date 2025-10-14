import java.util.Scanner;

public class MenghitungLuasPesegiPanjang {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;

        panjang=sc.nextInt();
        lebar=sc.nextInt();

        sc.close();

        luas=panjang*lebar;

        System.out.println("Luas persegi adalah " +luas);
    }
}