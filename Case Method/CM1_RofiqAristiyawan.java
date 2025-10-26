import java.util.Scanner;

public class CM1_RofiqAristiyawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi//
        double nilaiUtsAP, nilaiUasAP, nilaiTugasAP, nilaiUtsSD, nilaiUasSD, nilaiTugasSD, nilaiAkhirAP, nilaiAkhirSD,
                rataRata;
        String nama, nim, prodi, kelas, statusMatkulAP, statusMatkulSD, statusSemester, nilaiHurufAP, nilaiHurufSD,
                nilaiAkhirLimitAP, nilaiAkhirLimitSD, rataRataLimit, nilaiUtsLimitAP, nilaiUasLimitAP, nilaiTugasLimitAP,
                nilaiUtsLimitSD, nilaiUasLimitSD, nilaiTugasLimitSD;
        double nilaiUtsM, nilaiUasM, nilaiTugasM, nilaiAkhirM, rataRataSD, rataRataAP, rataRataM;
        String nilaiHurufM, statusMatkulM, rataRataTerbesar, rataRataTerbesarLimit, rataRataAPLimit, rataRataMLimit, rataRataSDLimit, nilaiUtsLimitM, nilaiUasLimitM, nilaiTugasLimitM, nilaiAkhirLimitM;

        // input data mahasiswa//
        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Nama\t: ");
        nama = input.nextLine();
        System.out.print("NIM\t: ");
        nim = input.nextLine();
        System.out.print("Prodi\t: ");
        prodi = input.nextLine();
        System.out.print("Kelas\t: ");
        kelas = input.nextLine();

        // input nilai mata kuliah//
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS\t: ");
        nilaiUtsAP = input.nextDouble();
        System.out.print("Nilai UAS\t: ");
        nilaiUasAP = input.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        nilaiTugasAP = input.nextDouble();

        // input nilai mata kuliah//
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t: ");
        nilaiUtsSD = input.nextDouble();
        System.out.print("Nilai UAS\t: ");
        nilaiUasSD = input.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        nilaiTugasSD = input.nextDouble();

        // input nilai mata kuliah//
        System.out.println("\n--- Mata Kuliah 3: Matematika ---");
        System.out.print("Niali UTS\t: ");
        nilaiUtsM = input.nextDouble();
        System.out.print("Nilai UAS\t: ");
        nilaiUasM = input.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        nilaiTugasM = input.nextDouble();

        input.close();

        // proses hitung nilai akhir//
        nilaiAkhirAP = (nilaiUtsAP * 0.3) + (nilaiUasAP * 0.4) + (nilaiTugasAP * 0.3);
        nilaiAkhirSD = (nilaiUtsSD * 0.3) + (nilaiUasSD * 0.4) + (nilaiTugasSD * 0.3);
        nilaiAkhirM = (nilaiUtsM * 0.3) + (nilaiUasM * 0.4) + (nilaiTugasM * 0.3);

        // proses lulus mata kuliah//
        if (nilaiAkhirAP >= 60 && nilaiAkhirAP <= 100) {
            statusMatkulAP = "Lulus Mata Kuliah";
        } else if (nilaiAkhirAP >= 0 && nilaiAkhirAP < 60) {
            statusMatkulAP = "Tidak Lulus";
        } else {
            statusMatkulAP = "ERROR";
        }

        if (nilaiAkhirSD >= 60 && nilaiAkhirSD <= 100) {
            statusMatkulSD = "Lulus Mata Kuliah";
        } else if (nilaiAkhirSD >= 0 && nilaiAkhirSD < 60) {
            statusMatkulSD = "Tidak Lulus";
        } else {
            statusMatkulSD = "ERROR";
        }

        if (nilaiAkhirM >= 60 && nilaiAkhirM <= 100) {
            statusMatkulM = "Lulus Mata Kuliah";
        } else if (nilaiAkhirM >= 0 && nilaiAkhirM < 60) {
            statusMatkulM = "Tidak Lulus";
        } else {
            statusMatkulM = "ERROR";
        }

        // proses nilai huruf//
        if (nilaiAkhirAP > 80 && nilaiAkhirAP <= 100) {
            nilaiHurufAP = "A";
        } else if (nilaiAkhirAP > 73 && nilaiAkhirAP <= 80) {
            nilaiHurufAP = "B+";
        } else if (nilaiAkhirAP > 65 && nilaiAkhirAP <= 73) {
            nilaiHurufAP = "B";
        } else if (nilaiAkhirAP > 60 && nilaiAkhirAP <= 65) {
            nilaiHurufAP = "C+";
        } else if (nilaiAkhirAP > 50 && nilaiAkhirAP <= 60) {
            nilaiHurufAP = "c";
        } else if (nilaiAkhirAP > 39 && nilaiAkhirAP <= 50) {
            nilaiHurufAP = "D";
        } else if (nilaiAkhirAP >= 0 && nilaiAkhirAP <= 39) {
            nilaiHurufAP = "E";
        } else {
            nilaiHurufAP = "ERROR";
        }

        if (nilaiAkhirSD > 80 && nilaiAkhirSD <= 100) {
            nilaiHurufSD = "A";
        } else if (nilaiAkhirSD > 73 && nilaiAkhirSD <= 80) {
            nilaiHurufSD = "B+";
        } else if (nilaiAkhirSD > 65 && nilaiAkhirSD <= 73) {
            nilaiHurufSD = "B";
        } else if (nilaiAkhirSD > 60 && nilaiAkhirSD <= 65) {
            nilaiHurufSD = "C+";
        } else if (nilaiAkhirSD > 50 && nilaiAkhirSD <= 60) {
            nilaiHurufSD = "C";
        } else if (nilaiAkhirSD > 39 && nilaiAkhirSD <= 50) {
            nilaiHurufSD = "D";
        } else if (nilaiAkhirSD >= 0 && nilaiAkhirSD <= 39) {
            nilaiHurufSD = "E";
        } else {
            nilaiHurufSD = "ERROR";
        }

        if (nilaiAkhirM > 80 && nilaiAkhirM <= 100) {
            nilaiHurufM = "A";
        } else if (nilaiAkhirM > 73 && nilaiAkhirM <= 80) {
            nilaiHurufM = "B+";
        } else if (nilaiAkhirM > 65 && nilaiAkhirM <= 73) {
            nilaiHurufM = "B";
        } else if (nilaiAkhirM > 60 && nilaiAkhirM <= 65) {
            nilaiHurufM = "C+";
        } else if (nilaiAkhirM > 50 && nilaiAkhirM <= 60) {
            nilaiHurufM = "C";
        } else if (nilaiAkhirM > 39 && nilaiAkhirM <= 50) {
            nilaiHurufM = "D";
        } else if (nilaiAkhirM >= 0 && nilaiAkhirM <= 39) {
            nilaiHurufM = "E";
        } else {
            nilaiHurufM = "ERROR";
        }

        // rata-rata nilai//
        rataRata = (nilaiAkhirAP + nilaiAkhirSD + nilaiAkhirM) / 3;
        rataRataSD = (nilaiUtsSD + nilaiUasSD + nilaiTugasSD) / 3;
        rataRataAP = (nilaiUtsAP + nilaiUasAP + nilaiTugasAP) / 3;
        rataRataM = (nilaiUtsM + nilaiUasM + nilaiTugasM) / 3;

        // proses Status kelulusan semester//
        if (statusMatkulAP.equals("Lulus Mata Kuliah") && statusMatkulSD.equals("Lulus Mata Kuliah" ) && statusMatkulM.equals("Lulus Mata Kuliah" )) {
            if (rataRata >= 70) {
                statusSemester = "Lulus";
            } else {
                statusSemester = "Tidak Lulus";
            }
        } else {
            statusSemester = "Tidak Lulus";
        }

        // nilai rata-rata tertinggi //
        if (rataRataAP > rataRataSD && rataRataAP > rataRataM) {
            rataRataTerbesar = "materi kuliah Algoritma Pemograman =" + rataRataAP;
        } else if (rataRataSD > rataRataAP && rataRataSD > rataRataM) {
            rataRataTerbesar = "materi kuliah Struktur Data =" + rataRataSD;
        } else {
            rataRataTerbesar = "materi Kuliah matematika =" + rataRataM;
        } 

        // limit belakang koma//
        nilaiUtsLimitAP = String.format("%.2f", nilaiUtsAP);
        nilaiUasLimitAP = String.format("%.2f", nilaiUasAP);
        nilaiTugasLimitAP = String.format("%.2f", nilaiTugasAP);
        nilaiUtsLimitSD = String.format("%.2f", nilaiUtsSD);
        nilaiUasLimitSD = String.format("%.2f", nilaiUasSD);
        nilaiTugasLimitSD = String.format("%.2f", nilaiTugasSD);
        nilaiUtsLimitM = String.format("%.2f", nilaiUtsM);
        nilaiUasLimitM = String.format("%.2f", nilaiUasM);
        nilaiTugasLimitM = String.format("%.2f", nilaiTugasM);
        nilaiAkhirLimitAP = String.format("%.2f", nilaiAkhirAP);
        nilaiAkhirLimitSD = String.format("%.2f", nilaiAkhirSD);
        nilaiAkhirLimitM = String.format("%.2f", nilaiAkhirM);
        rataRataLimit = String.format("%.2f", rataRata);
        rataRataAPLimit = String.format("%.2f", rataRataAP);
        rataRataSDLimit = String.format("%.2f", rataRataSD);
        rataRataMLimit = String.format("%.2f", rataRataM);
        rataRataTerbesarLimit = String.format("%.2f", rataRataTerbesar);

        // pembatas nilai// 

        // output data mahasiswa dan hasil penilaian akademik//
        System.out.println("\n============== HASIL PENILAIAN AKADEMIK ==============");
        System.out.printf("Nama \t: %s%n", nama);
        System.out.printf("NIM  \t: %s%n", nim);
        System.out.printf("Prodi\t: %s%n", prodi);
        System.out.printf("Kelas\t: %s%n", kelas);

        System.out.println("\nMata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println(
                "=================================================================================================");
        System.out.println("Algoritma Pemograman\t:" + nilaiUtsLimitAP + "\t" + nilaiUasLimitAP + "\t"
                + nilaiTugasLimitAP + "\t" + nilaiAkhirLimitAP + "\t\t" + nilaiHurufAP + "\t\t" + statusMatkulAP);
        System.out.println("Struktur Data\t\t:" + nilaiUtsLimitSD + "\t" + nilaiUasLimitSD + "\t" + nilaiTugasLimitSD
                + "\t" + nilaiAkhirLimitSD + "\t\t" + nilaiHurufSD + "\t\t" + statusMatkulSD);
        System.out.println("Matematika\t\t:" + nilaiUtsLimitM + "\t" + nilaiUasLimitM + "\t" + nilaiTugasLimitM
                + "\t" + nilaiAkhirLimitM + "\t\t" + nilaiHurufM + "\t\t" + statusMatkulM);
        System.out.println("Rata-Rata Nilai Akhir\t:" + rataRataLimit);
        System.out.println("Status Semester\t\t:" + statusSemester);
        System.out.println("Rata-rata nilai AP\t: " + rataRataAPLimit);
        System.out.println("Rata-rata nilai SD\t: " + rataRataSDLimit);
        System.out.println("Rata-rata nilai M\t: " + rataRataMLimit);
        System.out.println("rata rata terbesar\t: " + rataRataTerbesarLimit);
    }
}