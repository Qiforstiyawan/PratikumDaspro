import java.util.Scanner;

// Class untuk menyimpan data orang
class Person {
    private String name;
    private int birthYear;
    private int currentYear = 2026;

    // Constructor
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    // Method hitung umur
    public int calculateAge() {
        return currentYear - birthYear;
    }

    public String getName() {
        return name;
    }
}

// Class untuk mengecek kelayakan SIM
class LicenseCheck {

    public static boolean isEligible(int age) {
        return age >= 17;
    }

    public static void showResult(Person person) {
        int age = person.calculateAge();

        System.out.println("Halo, " + person.getName() + "!\n");
        System.out.println("Usia anda sekarang adalah " + age + " tahun.");

        if (isEligible(age)) {
            System.out.println("Anda sudah memenuhi syarat untuk mengurus SIM.");
        } else {
            System.out.println("Anda belum memenuhi syarat untuk mengurus SIM.");
        }
    }
}

// Class utama
public class DrivingLicenseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Siapakah nama anda? ");
        String name = scanner.nextLine();

        System.out.print("Tahun berapakah anda dilahirkan? ");
        int birthYear = scanner.nextInt();

        Person person = new Person(name, birthYear);
        LicenseCheck.showResult(person);

        scanner.close();
    }
}
