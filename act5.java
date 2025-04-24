import java.util.Scanner;

public class act5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nMasukan angka: ");
        int angka = input.nextInt();

        System.out.println("\n=== Hitung Maju ===");
        for (int i = 1; i <= angka; i++) {
            System.out.println(i);
            
        }

        System.out.println("\n=== Hitung Mundur ===");

        for (int i = angka; i >= 1; i--) {
            System.out.println(i);
            
        }

        input.close();
    }
}