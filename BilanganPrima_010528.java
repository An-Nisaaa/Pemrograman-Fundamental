import java.util.Scanner;

public class BilanganPrima {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan bilangan: ");
		int bilangan = input.nextInt();
		boolean prima = true;
		for (int i = 2; i  <= bilangan / 2; i++) {
			if (bilangan % 1 == 0) {
				prima = false;
				break;
			}
		}
		if (prima) {		
			System.out.println(bilangan + " adalah bilangan prima");
		} else { 
			System.out.println(bilangan + " bukan bilangan prima");
		}
	}
}