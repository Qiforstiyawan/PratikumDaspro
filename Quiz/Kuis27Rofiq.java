public class Kuis27Rofiq {
    public static void main(String[] args) {
        /*
        Nama        : ROFIQ ARISTIYAWAN
        NIM         : 254107020060
        Kelas/Absen : TI-1G/13
         */

        //No 1 itu cari rata rata jumlah dari 1 baris, (Senin sabtu minggu) 
        int studio27[][] = {
            {12,18,14},//Reguler
            {9,11,10},
            {8,12,15},
            {7,9,8},
            {5,7,6}
        };
        String namaStudio27[]={
            "Reguler",
            "Dolby Atmos",
            "IMAX",
            "Premiere",
            "Luxury Suite"
        };

        int tempHargaStudio27[][] = new int[studio27.length][studio27[1].length];

        for (int i = 0; i < tempHargaStudio27.length; i++) {
            for (int j = 0; j < tempHargaStudio27[0].length; j++) {
                if (i < 2) {
                    tempHargaStudio27[i][j] = studio27[i][j]*40_000;
                }else{
                    tempHargaStudio27[i][j] = studio27[i][j]*70_000;
                }
            }
        }

        //Print banyak tiket yang terjual setiap hari
        int tempTiketSold27[] = new int [studio27.length];
        for (int i = 0; i < tempHargaStudio27.length; i++) {
            int total = 0;
            for (int j = 0; j < tempHargaStudio27[0].length; j++) {
                total += studio27[i][j];
            }
            tempTiketSold27[i] = total;
        }

        int tiketTerbanyak27 = 0;
        int indexTiketTerbanyak27 = 0;
        for (int i = 0; i < tempTiketSold27.length; i++) {
            if (tiketTerbanyak27 < tempTiketSold27[i]) {
                tiketTerbanyak27 = tempTiketSold27[i];;
                indexTiketTerbanyak27 = i;
            }
        }
        System.out.println("===================================");
        System.out.println("Tiket terjual terbanyak\t\t: " + tiketTerbanyak27);
        System.out.println("Studio\t\t\t\t: " + namaStudio27[indexTiketTerbanyak27]);
        System.out.println("===================================");


        //Hitung rata rata (Sabtu)
        double ratarataSabtu27 = 0;
        for (int i = 0; i < studio27.length; i++) {
            for (int j = 0; j < studio27[i].length; j++) {
                if (j == 1) {
                    ratarataSabtu27 += studio27[i][j];
                }
            }
        }
        ratarataSabtu27 /= studio27.length;

        System.out.println("Rata rata penjualan hari sabtu\t: " + ratarataSabtu27);

        //Hitung Total harga selama 3 hari
        int totalHarga27 = 0;
        for (int i = 0; i < studio27.length; i++) {
            for (int j = 0; j < studio27[i].length; j++) {
                totalHarga27 += tempHargaStudio27[i][j];
            }
        }

        System.out.println("===================================");
        System.out.println("Total Harga\t\t\t: " + totalHarga27);
        System.out.println("===================================");


        //Penjualan terendah
        int terendah27 = 100;
        for (int i = 0; i < studio27.length; i++) {
            for (int j = 0; j < studio27[i].length; j++) {
                if (terendah27 > studio27[i][j]) {
                    terendah27 = studio27[i][j];
                }
            }
        }
        System.out.println("Penjualan terendah\t\t: " + terendah27);
    }
}
