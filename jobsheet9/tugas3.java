package jobsheet9;
import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar menu kafe (sudah diinisialisasi)
        String[] menu = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar", 
            "Kentang Goreng", 
            "Teh Tarik", 
            "Cappucino", 
            "Chocolate Ice"
        };

        System.out.println("===== DAFTAR MENU KAFE =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        // Proses pencarian linear search
        int hasil = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                hasil = i;
                break;
            }
        }

        System.out.println();
        if (hasil != -1) {
            System.out.println("Menu \"" + menu[hasil] + "\" tersedia di kafe kami 🍽️");
        } else {
            System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia di kafe kami 😔");
        }

        sc.close();
    }
}
