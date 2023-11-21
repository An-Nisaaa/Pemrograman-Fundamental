import java.util.Scanner;

public class BilanganPangkat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan bilangan: ");
		double bilangan = input.nextDouble();
		System.out.println("Masukkan pangkat: ");
		double pangkat = input.nextDouble();
		double hasil = Math.pow(bilangan, pangkat);
		System.out.println(bilangan + " pangkat " + pangkat + " adalah " + hasil);
	}
}