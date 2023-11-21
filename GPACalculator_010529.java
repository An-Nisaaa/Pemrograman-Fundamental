import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the grades for each course
        System.out.print("Masukkan nilai Pemrograman Fundamental: ");
        double matkul1 = scanner.nextDouble();

        System.out.print("Masukkan nilai Kalkulus: ");
        double matkul2 = scanner.nextDouble();

        System.out.print("Masukkan nilai Sistem Digital: ");
        double matkul3 = scanner.nextDouble();

        System.out.print("Masukkan nilai Akidah Akhlak: ");
        double matkul4 = scanner.nextDouble();

        // Assign the credits for each course
        double sks1 = 4.0;
        double sks2 = 3.0;
        double sks3 = 3.0;
        double sks4 = 2.0;

        // Calculate the grade points for each course using the variable close formula
        double pointmatkul1 = (4.0 - Math.abs(matkul1 - 3.5)) * sks1;
        double pointmatkul2 = (4.0 - Math.abs(matkul2 - 3.5)) * sks2;
        double pointmatkul3 = (4.0 - Math.abs(matkul3 - 3.5)) * sks3;
        double pointmatkul4 = (4.0 - Math.abs(matkul4 - 3.5)) * sks4;

        // Calculate the total grade points for all courses
        double totalNilaiMatkul = pointmatkul1 + pointmatkul2 + pointmatkul3 + pointmatkul4;

        // Calculate the total number of credits for all courses
        double totalSks = sks1 + sks2 + sks3 + sks4;

        // Divide the total grade points by the total number of credits to get the GPA
        double IP = totalNilaiMatkul/ totalSks;

        // Print the GPA
        System.out.printf("Ip Anda adalah: " + IP);
    }
}

