import java.util.Scanner;

public class act3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nMasukan Nama anda : ");
        String nama = input.nextLine();
        System.out.print("Masukan Kelas anda : ");
        String kelas = input.nextLine();
        System.out.print("Masukan NPM anda : ");
        int npm = input.nextInt();
        System.out.print("Masukan Nilai anda : ");
        int nilai = input.nextInt();
        input.nextLine();

        String grade;
        String status;

        if( nilai >= 90 ) {
            grade = "A";
            status = "LULUS";
        }else if( nilai >= 80 ) {
            grade = "B";
            status = "LULUS";
        }else if( nilai >= 70) {
            grade = "C";
            status = "LULUS";
            
        }else if( nilai >= 60) {
            grade = "D";
            status = "LULUS";
        }else{
            grade = "E";
            status = "TIDAK LULUS";
        }


        System.out.println("\nNama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("NPM: " + npm);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);

        input.close();
    
    }
}
