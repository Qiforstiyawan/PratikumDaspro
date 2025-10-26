import java.util.Scanner;

public class pembatasNilai {

    // Helper (tetap sebagai method, bukan variabel)
    static boolean valid(double v) { return v >= 0 && v <= 100; }
    static String fmt(double v) { return String.format("%.2f", v); }

    public static void main(String[] args) {
        String nama, nim, prodi, kelas;

        double nilaiUtsAP, nilaiUasAP, nilaiTugasAP;
        double nilaiUtsSD, nilaiUasSD, nilaiTugasSD;
        double nilaiUtsM,  nilaiUasM,  nilaiTugasM;

        // Nilai akhir per matkul
        double nilaiAkhirAP, nilaiAkhirSD, nilaiAkhirM;

        // Rata-rata
        double rataRataAP, rataRataSD, rataRataM, rataRataAkhir;

        // Status & huruf
        String statusMatkulAP, statusMatkulSD, statusMatkulM, statusSemester;
        String nilaiHurufAP, nilaiHurufSD, nilaiHurufM;

        String nilaiUtsLimitAP, nilaiUasLimitAP, nilaiTugasLimitAP;
        String nilaiUtsLimitSD, nilaiUasLimitSD, nilaiTugasLimitSD;
        String nilaiUtsLimitM,  nilaiUasLimitM,  nilaiTugasLimitM;
        String nilaiAkhirLimitAP, nilaiAkhirLimitSD, nilaiAkhirLimitM;
        String rataRataAPLimit, rataRataSDLimit, rataRataMLimit, rataRataLimit;
        String rataRataTerbesar;

        boolean apValid, sdValid, mValid;

        // INPUT
        Scanner input = new Scanner(System.in);

        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Nama\t: ");
        nama = input.nextLine();
        System.out.print("NIM\t: ");
        nim = input.nextLine();
        System.out.print("Prodi\t: ");
        prodi = input.nextLine();
        System.out.print("Kelas\t: ");
        kelas = input.nextLine();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS\t: ");
        nilaiUtsAP = input.nextDouble();
        System.out.print("Nilai UAS\t: ");
        nilaiUasAP = input.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        nilaiTugasAP = input.nextDouble();

        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t: ");
        nilaiUtsSD = input.nextDouble();
        System.out.print("Nilai UAS\t: ");
        nilaiUasSD = input.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        nilaiTugasSD = input.nextDouble();

        System.out.println("\n--- Mata Kuliah 3: Matematika ---");
        System.out.print("Nilai UTS\t: ");
        nilaiUtsM = input.nextDouble();
        System.out.print("Nilai UAS\t: ");
        nilaiUasM = input.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        nilaiTugasM = input.nextDouble();

        input.close();

        // VALIDASI NILAI
        apValid = valid(nilaiUtsAP) && valid(nilaiUasAP) && valid(nilaiTugasAP);
        sdValid = valid(nilaiUtsSD) && valid(nilaiUasSD) && valid(nilaiTugasSD);
        mValid  = valid(nilaiUtsM)  && valid(nilaiUasM)  && valid(nilaiTugasM);

        // PERHITUNGAN
        nilaiAkhirAP = apValid ? (nilaiUtsAP * 0.3) + (nilaiUasAP * 0.4) + (nilaiTugasAP * 0.3) : Double.NaN;
        nilaiAkhirSD = sdValid ? (nilaiUtsSD * 0.3) + (nilaiUasSD * 0.4) + (nilaiTugasSD * 0.3) : Double.NaN;
        nilaiAkhirM  = mValid  ? (nilaiUtsM  * 0.3) + (nilaiUasM  * 0.4) + (nilaiTugasM  * 0.3) : Double.NaN;

        statusMatkulAP = apValid
                ? (nilaiAkhirAP >= 60 && nilaiAkhirAP <= 100 ? "Lulus Mata Kuliah"
                : nilaiAkhirAP >= 0 && nilaiAkhirAP < 60   ? "Tidak Lulus" : "ERROR")
                : "ERROR";
        statusMatkulSD = sdValid
                ? (nilaiAkhirSD >= 60 && nilaiAkhirSD <= 100 ? "Lulus Mata Kuliah"
                : nilaiAkhirSD >= 0 && nilaiAkhirSD < 60   ? "Tidak Lulus" : "ERROR")
                : "ERROR";
        statusMatkulM = mValid
                ? (nilaiAkhirM >= 60 && nilaiAkhirM <= 100 ? "Lulus Mata Kuliah"
                : nilaiAkhirM >= 0 && nilaiAkhirM < 60   ? "Tidak Lulus" : "ERROR")
                : "ERROR";

        nilaiHurufAP = !apValid ? "ERROR"
                : (nilaiAkhirAP > 80 && nilaiAkhirAP <= 100) ? "A"
                : (nilaiAkhirAP > 73 && nilaiAkhirAP <= 80)  ? "B+"
                : (nilaiAkhirAP > 65 && nilaiAkhirAP <= 73)  ? "B"
                : (nilaiAkhirAP > 60 && nilaiAkhirAP <= 65)  ? "C+"
                : (nilaiAkhirAP > 50 && nilaiAkhirAP <= 60)  ? "C"
                : (nilaiAkhirAP > 39 && nilaiAkhirAP <= 50)  ? "D"
                : (nilaiAkhirAP >= 0 && nilaiAkhirAP <= 39)  ? "E" : "ERROR";

        nilaiHurufSD = !sdValid ? "ERROR"
                : (nilaiAkhirSD > 80 && nilaiAkhirSD <= 100) ? "A"
                : (nilaiAkhirSD > 73 && nilaiAkhirSD <= 80)  ? "B+"
                : (nilaiAkhirSD > 65 && nilaiAkhirSD <= 73)  ? "B"
                : (nilaiAkhirSD > 60 && nilaiAkhirSD <= 65)  ? "C+"
                : (nilaiAkhirSD > 50 && nilaiAkhirSD <= 60)  ? "C"
                : (nilaiAkhirSD > 39 && nilaiAkhirSD <= 50)  ? "D"
                : (nilaiAkhirSD >= 0 && nilaiAkhirSD <= 39)  ? "E" : "ERROR";

        nilaiHurufM = !mValid ? "ERROR"
                : (nilaiAkhirM > 80 && nilaiAkhirM <= 100) ? "A"
                : (nilaiAkhirM > 73 && nilaiAkhirM <= 80)  ? "B+"
                : (nilaiAkhirM > 65 && nilaiAkhirM <= 73)  ? "B"
                : (nilaiAkhirM > 60 && nilaiAkhirM <= 65)  ? "C+"
                : (nilaiAkhirM > 50 && nilaiAkhirM <= 60)  ? "C"
                : (nilaiAkhirM > 39 && nilaiAkhirM <= 50)  ? "D"
                : (nilaiAkhirM >= 0 && nilaiAkhirM <= 39)  ? "E" : "ERROR";

        rataRataAP = apValid ? (nilaiUtsAP + nilaiUasAP + nilaiTugasAP) / 3 : Double.NaN;
        rataRataSD = sdValid ? (nilaiUtsSD + nilaiUasSD + nilaiTugasSD) / 3 : Double.NaN;
        rataRataM  = mValid  ? (nilaiUtsM  + nilaiUasM  + nilaiTugasM)  / 3 : Double.NaN;
        rataRataAkhir = (apValid && sdValid && mValid)
                ? (nilaiAkhirAP + nilaiAkhirSD + nilaiAkhirM) / 3 : Double.NaN;

        if (apValid && sdValid && mValid
                && "Lulus Mata Kuliah".equals(statusMatkulAP)
                && "Lulus Mata Kuliah".equals(statusMatkulSD)
                && "Lulus Mata Kuliah".equals(statusMatkulM)) {
            statusSemester = (!Double.isNaN(rataRataAkhir) && rataRataAkhir >= 70) ? "Lulus" : "Tidak Lulus";
        } else if (!apValid || !sdValid || !mValid) {
            statusSemester = "ERROR";
        } else {
            statusSemester = "Tidak Lulus";
        }

        if (!Double.isNaN(rataRataAP) && !Double.isNaN(rataRataSD) && !Double.isNaN(rataRataM)) {
            if (rataRataAP >= rataRataSD && rataRataAP >= rataRataM) {
                rataRataTerbesar = "Materi kuliah Algoritma dan Pemrograman = " + fmt(rataRataAP);
            } else if (rataRataSD >= rataRataAP && rataRataSD >= rataRataM) {
                rataRataTerbesar = "Materi kuliah Struktur Data = " + fmt(rataRataSD);
            } else {
                rataRataTerbesar = "Materi kuliah Matematika = " + fmt(rataRataM);
            }
        } else {
            rataRataTerbesar = "ERROR";
        }

        nilaiUtsLimitAP   = valid(nilaiUtsAP) ? fmt(nilaiUtsAP) : "ERROR";
        nilaiUasLimitAP   = valid(nilaiUasAP) ? fmt(nilaiUasAP) : "ERROR";
        nilaiTugasLimitAP = valid(nilaiTugasAP) ? fmt(nilaiTugasAP) : "ERROR";

        nilaiUtsLimitSD   = valid(nilaiUtsSD) ? fmt(nilaiUtsSD) : "ERROR";
        nilaiUasLimitSD   = valid(nilaiUasSD) ? fmt(nilaiUasSD) : "ERROR";
        nilaiTugasLimitSD = valid(nilaiTugasSD) ? fmt(nilaiTugasSD) : "ERROR";

        nilaiUtsLimitM    = valid(nilaiUtsM) ? fmt(nilaiUtsM) : "ERROR";
        nilaiUasLimitM    = valid(nilaiUasM) ? fmt(nilaiUasM) : "ERROR";
        nilaiTugasLimitM  = valid(nilaiTugasM) ? fmt(nilaiTugasM) : "ERROR";

        nilaiAkhirLimitAP = apValid ? fmt(nilaiAkhirAP) : "ERROR";
        nilaiAkhirLimitSD = sdValid ? fmt(nilaiAkhirSD) : "ERROR";
        nilaiAkhirLimitM  = mValid  ? fmt(nilaiAkhirM)  : "ERROR";

        rataRataAPLimit = !Double.isNaN(rataRataAP) ? fmt(rataRataAP) : "ERROR";
        rataRataSDLimit = !Double.isNaN(rataRataSD) ? fmt(rataRataSD) : "ERROR";
        rataRataMLimit  = !Double.isNaN(rataRataM)  ? fmt(rataRataM)  : "ERROR";
        rataRataLimit   = !Double.isNaN(rataRataAkhir) ? fmt(rataRataAkhir) : "ERROR";

        // OUTPUT
        System.out.println("\n============== HASIL PENILAIAN AKADEMIK ==============");
        System.out.printf("Nama \t: %s%n", nama);
        System.out.printf("NIM  \t: %s%n", nim);
        System.out.printf("Prodi\t: %s%n", prodi);
        System.out.printf("Kelas\t: %s%n", kelas);

        System.out.println("\nMata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("=================================================================================================");
        System.out.println("Algoritma dan Pemrograman\t:" + nilaiUtsLimitAP + "\t" + nilaiUasLimitAP + "\t"
                + nilaiTugasLimitAP + "\t" + nilaiAkhirLimitAP + "\t\t" + nilaiHurufAP + "\t\t" + statusMatkulAP);
        System.out.println("Struktur Data\t\t\t:" + nilaiUtsLimitSD + "\t" + nilaiUasLimitSD + "\t" + nilaiTugasLimitSD
                + "\t" + nilaiAkhirLimitSD + "\t\t" + nilaiHurufSD + "\t\t" + statusMatkulSD);
        System.out.println("Matematika\t\t\t:" + nilaiUtsLimitM + "\t" + nilaiUasLimitM + "\t" + nilaiTugasLimitM
                + "\t" + nilaiAkhirLimitM + "\t\t" + nilaiHurufM + "\t\t" + statusMatkulM);

        System.out.println("Rata-Rata Nilai Akhir\t:" + rataRataLimit);
        System.out.println("Status Semester\t\t:" + statusSemester);
        System.out.println("Rata-rata nilai AP\t: " + rataRataAPLimit);
        System.out.println("Rata-rata nilai SD\t: " + rataRataSDLimit);
        System.out.println("Rata-rata nilai M\t: " + rataRataMLimit);
        System.out.println("Rata-rata terbesar\t: " + rataRataTerbesar);
    }
}
