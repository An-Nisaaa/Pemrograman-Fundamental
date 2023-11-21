import java.util.Scanner;

class Demo{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int fact = 1;
		for(int x=1; x<=number; x++) {
			fact *= x;
		}
		System.out.println(fact);
	}
}