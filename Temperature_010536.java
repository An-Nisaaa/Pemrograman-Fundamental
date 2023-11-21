import java.util.Scanner;

public class Conditionals {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan temperature: ");
		int temperatureCelsius = sc.nextInt();
			System.out.println("temperature: " + temperatureCelsius);
			
			if (temperatureCelsius >= 100) {
				System.out.println("Boiling");
			} else {
				System.out.println("Not boiling");
			}		
		}
}