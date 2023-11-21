import java.util.Scanner;

public class BilanganFaktorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan bilangan: ");
		int bilangan = input.nextInt();
		int faktorial = 1;
		for (int i = 1; i <= bilangan; i++) {
			faktorial *= i;
		}
		System.out.println("Faktorial dari " + bilangan + " adalah " + faktorial);
	}
}