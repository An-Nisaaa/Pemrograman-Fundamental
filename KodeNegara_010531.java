import java.util.Scanner;

public class KodeNegara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Masukkan kode negara: ");
		String kodeNegara = scanner.nextLine();
		
		String namaNegara;
		
		 if (kodeNegara.equals("ES")) {
            namaNegara = "Spain";
        } else if (kodeNegara.equals("TN")) {
            namaNegara = "Tunisia";
        } else if (kodeNegara.equals("ID")) {
            namaNegara = "Indonesia";
        } else if (kodeNegara.equals("MM")) {
            namaNegara = "Myanmar";
        } else if (kodeNegara.equals("IN")) {
            namaNegara = "India";
        } else {
            namaNegara = "Maaf, kode negara TIDAK DIKETAHUI";
		}
		System.out.println("Kode negara " + kodeNegara + " = " + namaNegara);
		
		scanner.close();
	}
}