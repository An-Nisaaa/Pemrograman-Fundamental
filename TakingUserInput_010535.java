import java.util.Scanner;

public class TakingUserInput {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			double bill = scanner.nextDouble();
			double tip = bill * 0.15; // 15% of the bill
			System.out.println(tip);
			
		}
}