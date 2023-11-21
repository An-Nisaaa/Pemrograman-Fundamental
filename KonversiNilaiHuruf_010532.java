import java.util.Scanner;

public class KonversiNilaiHuruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.println("Masukkan nilai huruf: ");
		char nilaiHuruf = input.next().charAt(0);
		double nilaiIndex;
		
		if (nilaiHuruf == 'A') {
			nilaiIndex = 4.0;
		} else if (nilaiHuruf == 'B') {
			nilaiIndex = 3.0;
		} else if (nilaiHuruf == 'C') {
			nilaiIndex = 2.0;
		} else if (nilaiHuruf == 'D') {
			nilaiIndex = 1.0;
		} else if (nilaiHuruf == 'F') {
			nilaiIndex = 0;
		} else {
			
		System.out.println("Nilai index dari " + nilaiHuruf + " = " + "Maaf, konversi nilai tidak diketahui");
		return;
		}
		System.out.println("Nilai index dari " + nilaiHuruf + " = " + nilaiIndex);
	}
}	