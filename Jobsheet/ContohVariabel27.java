public class ContohVariabel27 {
    public static void main(String[] args) {
        
        String hobiSaya = "Bermain petak umpet";
        boolean pandai = true;
        char jenisKelamin = 'L';
        byte umurSekarang = 20;
        double nilaiIpk = 3.24, tinggiBadan = 1.78;

        System.out.println(hobiSaya);
        System.out.println("apakah pandai? " + pandai);
        System.out.println("jenis kelamin: " + jenisKelamin);
        System.out.println("umurku sekarang: " + umurSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", nilaiIpk, tinggiBadan));
    }
}