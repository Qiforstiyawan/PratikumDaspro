import java.util.Scanner;

public class GajiKaryawan27 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int gajiPokok, totGaji;
        double bonus;
        double tunjTransp=600000;
        double tunjMkn=400000;

        gajiPokok=sc.nextInt();
        sc.close();
        
        bonus= 0.05*gajiPokok;
        totGaji=(int)(gajiPokok+tunjTransp+tunjMkn+bonus-(0.1*gajiPokok));

        System.out.println("Bonus Bulanan anda adalah Rp.  " +bonus);
        System.out.println("Gaji yang diterima adalah Rp. " +totGaji);
    }
}
