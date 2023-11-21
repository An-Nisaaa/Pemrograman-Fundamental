import java.util.Scanner;

public class KodeNegara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.println("Masukkan kode negara: ");
		String kode = input.nextLine().toUpperCase();
		
		String negara;
		
		switch (kode) {
			case "ES":
				negara = "Spain";
				break;
			case "TN":
				negara = "Tunisia";
				break;
			case "ID":
				negara = "Indonesia";
				break;
			case "MM":
				negara = "Myanmar";
				break;
			case "IN":
				negara = "India";
				break;
			default:
			negara = "Maaf, kode negara TIDAK DIKETAHUI";
			break;
		}
		System.out.println("Kode negara " + kode + " = " + negara);
	}
}	