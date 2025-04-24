import java.util.Scanner;

public class act4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("=== Menu Menghitung Luas Bangun Datar ===");
        System.out.println("1. Luas Segitiga");
        System.out.println("2. Luas Persegi");
        System.out.println("3. Luas Lingkaran");
        System.out.println("Pilih menu (1-3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
            System.out.print("\nMasukan Alas : ");
            double alas = input.nextDouble();
            System.out.print("Masukan Tinggi : ");
            double tinggi = input.nextDouble();
            double luasSegitiga = 0.5 * alas * tinggi;
            System.out.println("Luas Segitiga: " + luasSegitiga);
            break;

            case 2:
            System.out.print("\nMasukan Sisi : ");
            double sisi = input.nextDouble();
            double luasPersegi = sisi * sisi;
            System.out.println("Luas Persegi: " + luasPersegi);
            break;

            case 3:
            System.out.print("\nMasukan Jari-jari : ");
            double jari = input.nextDouble();
            double luasLingkaran = 3.14 * jari * jari;
            System.out.println("Luas Lingkaran: " + luasLingkaran);
            break;

            default:
                System.out.print("Pilihan tidak valid. Silakan pilih antara 1–3.");
        }
        input.close();
    }
}

