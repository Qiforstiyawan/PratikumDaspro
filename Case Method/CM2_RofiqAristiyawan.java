import java.util.Scanner;

public class CM2_RofiqAristiyawan {

    //jumlah data
    static String[][] data = new String[5][5];
    static int jumlahData = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihMenu;
        boolean jalan = true;

        while (jalan) {
            System.out.println("=====================================");
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("=====================================");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Tahun");
            System.out.println("4. Hitung Jumlah Prestasi per Tingkat");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilihMenu = sc.nextInt();
            sc.nextLine();

            switch (pilihMenu) {
                case 1: tambahData();
                    break;
                case 2: tampilkanSemua();
                    break;
                case 3: mencariData();
                    break;
                case 4: hitungTingkat();
                    break;
                case 5: jalan = false;
                    break;
                default: System.out.println("Pilihan tidak valid");
            }
        }
        System.out.println("Selesai.");
    }

    //menambahkan data
    public static void tambahData() {
        Scanner sc = new Scanner(System.in);

        String nama, nim, jenis, tingkat = "";

        kapasitas();

        System.out.println("=== Input Data Prestasi ===");
        System.out.print("Nama\t\t: ");
        nama = sc.nextLine();
        System.out.print("NIM\t\t: ");
        nim = sc.nextLine();
        System.out.print("Jenis Prestasi\t: ");
        jenis = sc.nextLine();

        while (true) {
            System.out.print("Tingkat Prestasi (Lokal/Nasional/Internasional : ");
            tingkat = sc.nextLine();

            if (tingkat.equalsIgnoreCase("Lokal") ||
            tingkat.equalsIgnoreCase("Nasional") ||
            tingkat.equalsIgnoreCase("Internasional")) {
            break;
        }
        
        System.out.println("Input tingkat salah! ketikkan sesuai: Lokal/Nasional/Internasional.");
        }

        int tahun = 0;
        while (true) {
            System.out.print("Tahun Prestasi\t: ");
            tahun = sc.nextInt();

            if (tahun >= 2015 && tahun <= 2025) break;
            System.out.println("Hanya menerima di tahun 2015 - 2025");
        }

        data[jumlahData][0] = nama;
        data[jumlahData][1] = nim;
        data[jumlahData][2] = jenis;
        data[jumlahData][3] = tingkat;
        data[jumlahData][4] = String.valueOf(tahun);
        jumlahData++;

        System.out.println("Data prestasi berhasil ditambahkan.");
    }

    //menampilkan semua
    public static void tampilkanSemua() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data prestasi.");
            return;
        }
        
        System.out.println("=== Semua Data Prestasi ===");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.println("Nama\t\t: " + data[i][0]);
            System.out.println("NIM\t\t: " + data[i][1]);
            System.out.println("Jenis Prestasi\t: " + data[i][2]);
            System.out.println("Tingkat Prestasi: " + data[i][3]);
            System.out.println("Tahun Prestasi\t: " + data[i][4]);
            System.out.println("----------------------------");
        }
    }

    //mencari jenis
    public static void mencariData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tahun prestasi yang dicari: ");
        String target = sc.nextLine();

        boolean ditemukan = false;

        System.out.println("=== Hasil pencarian tahun: " + target + " ===");

        for (int i = 0; i < jumlahData; i++) {
            if (data[i][4].equalsIgnoreCase(target)) {
                ditemukan = true;
                System.out.println("Nama\t\t: " + data[i][0]);
                System.out.println("NIM\t\t: " + data[i][1]);
                System.out.println("Jenis Prestasi\t: " + data[i][2]);
                System.out.println("Tingkat Prestasi: " + data[i][3]);
                System.out.println("Tahun Prestasi\t: " + data[i][4]);
                System.out.println("----------------------------");
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada data prestasi dengan tahun tersebut.");
        }
    }

    //menghitung jumlah tingkat
    public static void hitungTingkat() {
        int lokal = 0, nasional = 0, internasional = 0;

        for (int i = 0; i < jumlahData; i++) {
            switch (data[i][3]) {
                case "Lokal":
                    lokal++;
                        break;
                case "Nasional":
                    nasional++;
                        break;
                case "Internasional":
                    internasional++;
                        break;
                default:
                    break;
            }
        }

        System.out.println("=== Jumlah Prestasi ===");
        System.out.println("Lokal\t\t: " + lokal);
        System.out.println("Nasional\t: " + nasional);
        System.out.println("Internasional\t: " + internasional);
    }

    
    //auto resize array
    public static void kapasitas() {
        if (jumlahData >= data.length) {
            String[][] baru = new String[data.length * 2][5];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < 5; j++) {
                baru[i][j] = data[i][j];
            }
        }

        data = baru;
        }
    }
}
