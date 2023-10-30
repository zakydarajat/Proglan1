import java.time.LocalDate;
import java.util.Scanner;

/**
 * DemoCalcOld adalah sebuah program sederhana untuk menghitung usia
 * berdasarkan tahun kelahiran yang dimasukkan oleh pengguna.
 * Program ini menggunakan kelas Scanner untuk menerima input dari pengguna
 * dan kelas LocalDate untuk mendapatkan tahun saat ini.
 *
 * @author [Muhammad Zaky Darajat]
 */
public class DemoCalcOld {
    private int yourBirthYear;

    /**
     * Mengembalikan tahun kelahiran pengguna.
     */
    public int getYourBirthYear() {
        return yourBirthYear;
    }

    /**
     * Mengatur tahun kelahiran pengguna.
     */
    public void setYourBirthYear(int yourBirthYear) {
        this.yourBirthYear = yourBirthYear;
    }

    /**
     * Metode utama untuk menjalankan program.
     */
    public static void main(String[] args) {
        // Membuat objek DemoCalcOld
        DemoCalcOld demo = new DemoCalcOld();

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan tahun kelahiran
        System.out.print("Masukkan tahun kelahiran Anda: ");
        int birthYear = input.nextInt();

        // Mengatur tahun kelahiran pengguna menggunakan metode setYourBirthYear
        demo.setYourBirthYear(birthYear);

        // Mendapatkan tahun saat ini menggunakan kelas LocalDate
        int currentYear = LocalDate.now().getYear();

        // Menghitung usia pengguna
        int age = currentYear - demo.getYourBirthYear();

        // Menampilkan hasil usia pengguna
        System.out.println("Anda berusia " + age + " tahun.");
    }
}
