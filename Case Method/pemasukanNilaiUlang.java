import java.util.Scanner;

public class pemasukanNilaiUlang {

    // bobot
    static final double BOBOT_UTS   = 0.30;
    static final double BOBOT_UAS   = 0.40;
    static final double BOBOT_TUGAS = 0.30;

    // lulus matkul
    static final double BATAS_LULUS_MATKUL   = 60.0;
    static final double BATAS_LULUS_SEMESTER = 70.0;

    // Rentang nilai huruf: interval (bawah, atas] kecuali 0 yang inklusif bawah
    // Urut dari atas → bawah agar pencocokan mudah dibaca dan diedit
    static final double[] BATAS_ATAS  = {100, 80, 73, 65, 60, 50, 38};
    static final double[] BATAS_BAWAH = { 81, 74, 66, 61, 51, 39, 0};
    static final String[] HURUF       = {"A","B+","B","C+","C","D","E"};

    // batas nilai
    static boolean validRentang100(double v) { return v >= 0 && v <= 100; }

    // angka dibelakang koma
    static String fmt2(double v) { return String.format("%.2f", v); }

    // batas inputan
    static double bacaNilai(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!sc.hasNextDouble()) {
                System.out.println("Input harus berupa angka. Coba lagi.");
                sc.next();
                continue;
            }
            double val = sc.nextDouble();
            if (!validRentang100(val)) {
                System.out.println("Nilai harus di antara 0 sampai 100. Coba lagi.");
                continue;
            }
            return val;
        }
    }

    // hitung nilai akhir
    static double hitungNilaiAkhir(double uts, double uas, double tugas) {
        return uts * BOBOT_UTS + uas * BOBOT_UAS + tugas * BOBOT_TUGAS;
    }

    static String nilaiHuruf(double nilaiAkhir) {
        for (int i = 0; i < HURUF.length; i++) {
            double bawah = BATAS_BAWAH[i], atas = BATAS_ATAS[i];
        
            if ((nilaiAkhir > bawah || (bawah == 0 && nilaiAkhir >= 0)) && nilaiAkhir <= atas) {
                return HURUF[i];
            }
        }
        return "ERROR";
    }

    // lulus matkul
    static String statusMatkul(double nilaiAkhir) {
        if (nilaiAkhir >= BATAS_LULUS_MATKUL && nilaiAkhir <= 100) return "Lulus Mata Kuliah";
        if (nilaiAkhir >= 0 && nilaiAkhir < BATAS_LULUS_MATKUL)    return "Tidak Lulus";
        return "ERROR";
    }

    // lulus semester
    static String statusSemester(double akhirAP, double akhirSD, double akhirM,
                                 String stAP, String stSD, String stM) {
        boolean semuaLulus = "Lulus Mata Kuliah".equals(stAP)
                          && "Lulus Mata Kuliah".equals(stSD)
                          && "Lulus Mata Kuliah".equals(stM);
        double rataAkhir = (akhirAP + akhirSD + akhirM) / 3.0;
        if (semuaLulus && rataAkhir >= BATAS_LULUS_SEMESTER) return "Lulus";
        return "Tidak Lulus";
    }

    // rata-rata terbesar
    static String deskripsiRataTerbesar(double rAP, double rSD, double rM) {
        if (rAP > rSD && rAP > rM) return "Materi kuliah Algoritma dan Pemrograman = " + fmt2(rAP);
        if (rSD > rAP && rSD > rM) return "Materi kuliah Struktur Data = " + fmt2(rSD);
        if (rM > rSD && rM > rAP) return "Materi kuliah Matematika = " + fmt2(rM);
        return "Rata - rata Sama";
    }

    public static void main(String[] args) {
        String nama, nim, prodi, kelas;

        // Scanner
        Scanner input;

        // Nilai mentah
        double utsAP, uasAP, tugasAP;
        double utsSD, uasSD, tugasSD;
        double utsM,  uasM,  tugasM;

        // Nilai akhir per matkul
        double akhirAP, akhirSD, akhirM;

        // Rata-rata
        double rataAP, rataSD, rataM, rataAkhir;

        // Nilai huruf & status per matkul
        String hurufAP, hurufSD, hurufM;
        String stAP, stSD, stM;

        // Status semester & deskripsi rata-rata terbesar
        String stSemester, rrTerbesar;

        // -----------------------------------------------------
        // INPUT
        
        input = new Scanner(System.in);

        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Nama\t: ");  nama  = input.nextLine();
        System.out.print("NIM\t: ");   nim   = input.nextLine();
        System.out.print("Prodi\t: "); prodi = input.nextLine();
        System.out.print("Kelas\t: "); kelas = input.nextLine();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        utsAP   = bacaNilai(input, "Nilai UTS\t: ");
        uasAP   = bacaNilai(input, "Nilai UAS\t: ");
        tugasAP = bacaNilai(input, "Nilai Tugas\t: ");

        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        utsSD   = bacaNilai(input, "Nilai UTS\t: ");
        uasSD   = bacaNilai(input, "Nilai UAS\t: ");
        tugasSD = bacaNilai(input, "Nilai Tugas\t: ");

        System.out.println("\n--- Mata Kuliah 3: Matematika ---");
        utsM    = bacaNilai(input, "Nilai UTS\t: ");
        uasM    = bacaNilai(input, "Nilai UAS\t: ");
        tugasM  = bacaNilai(input, "Nilai Tugas\t: ");

        input.close();

        // PERHITUNGAN
        akhirAP = hitungNilaiAkhir(utsAP, uasAP, tugasAP);
        akhirSD = hitungNilaiAkhir(utsSD, uasSD, tugasSD);
        akhirM  = hitungNilaiAkhir(utsM,  uasM,  tugasM);

        hurufAP = nilaiHuruf(akhirAP);
        hurufSD = nilaiHuruf(akhirSD);
        hurufM  = nilaiHuruf(akhirM);

        stAP = statusMatkul(akhirAP);
        stSD = statusMatkul(akhirSD);
        stM  = statusMatkul(akhirM);

        rataAP    = (utsAP + uasAP + tugasAP) / 3.0;
        rataSD    = (utsSD + uasSD + tugasSD) / 3.0;
        rataM     = (utsM  + uasM  + tugasM ) / 3.0;
        rataAkhir = (akhirAP + akhirSD + akhirM) / 3.0;

        stSemester = statusSemester(akhirAP, akhirSD, akhirM, stAP, stSD, stM);
        rrTerbesar = deskripsiRataTerbesar(rataAP, rataSD, rataM);

        // OUTPUT
        System.out.println("\n============== HASIL PENILAIAN AKADEMIK ==============");
        System.out.printf("Nama \t: %s%n", nama);
        System.out.printf("NIM  \t: %s%n", nim);
        System.out.printf("Prodi\t: %s%n", prodi);
        System.out.printf("Kelas\t: %s%n", kelas);

        System.out.println();
        System.out.printf("%-28s %8s %8s %8s %14s %12s %18s%n",
                "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Huruf", "Status");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        System.out.printf("%-28s %8s %8s %8s %14s %12s %18s%n",
                "Algoritma dan Pemrograman",
                fmt2(utsAP), fmt2(uasAP), fmt2(tugasAP), fmt2(akhirAP), hurufAP, stAP);

        System.out.printf("%-28s %8s %8s %8s %14s %12s %18s%n",
                "Struktur Data",
                fmt2(utsSD), fmt2(uasSD), fmt2(tugasSD), fmt2(akhirSD), hurufSD, stSD);

        System.out.printf("%-28s %8s %8s %8s %14s %12s %18s%n",
                "Matematika",
                fmt2(utsM), fmt2(uasM), fmt2(tugasM), fmt2(akhirM), hurufM, stM);

        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.printf("%-28s %s%n", "Rata-Rata Nilai Akhir", fmt2(rataAkhir));
        System.out.printf("%-28s %s%n", "Status Semester",       stSemester);
        System.out.printf("%-28s %s%n", "Rata-rata nilai AP",    fmt2(rataAP));
        System.out.printf("%-28s %s%n", "Rata-rata nilai SD",    fmt2(rataSD));
        System.out.printf("%-28s %s%n", "Rata-rata nilai M",     fmt2(rataM));
        System.out.printf("%-28s %s%n", "Rata-rata terbesar",    rrTerbesar);
    }
}
