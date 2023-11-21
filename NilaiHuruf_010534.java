import java.util.Scanner;

public class NilaiHuruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.println("Masukkan nilai huruf: ");
		String nilaiHuruf = input.nextLine();
		
		double nilaiIndex;
		
		switch (nilaiHuruf) {
			case "A":
			nilaiIndex = 4.0;
			break;
			case "B":
			nilaiIndex = 3.0;
			break;
			case "C":
			nilaiIndex = 2.0;
			break;
			case "D":
			nilaiIndex = 1.0;
			break;
			case "F":
			nilaiIndex = 0;
			break;
			default:
			nilaiIndex = -1; // Menangani nilai huruf yang tidak diketahui
			break;
		}
		
		if (nilaiIndex == -1) {
			System.out.println("Maaf, konversi nilai tidak diketahui");
		} else {
			System.out.println("Nilai index dari " + nilaiHuruf + " = " + nilaiIndex);
		}
	}
}