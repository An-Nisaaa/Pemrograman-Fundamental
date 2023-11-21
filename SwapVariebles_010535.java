import java.util.Scanner;

public class SwapVariables {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, temp;
		
		System.out.println("Masukkan nilai a: ");
		a = input.nextInt();
		System.out.println("Masukkan nilai b: ");
		b = input.nextInt();
		
		System.out.println("Sebelum:");
		System.out.println("a = " + a + ", b = " + b);

        temp = a;
        a = b;
        b = temp;

		System.out.println("Sesudah:");
		System.out.println("a = " + a + ", b = " + b);
    }
}