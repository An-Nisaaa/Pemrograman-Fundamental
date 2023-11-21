import java.util.Scanner;

public class LuasSegitiga {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan nilai alas: ");
		int a = input.nextInt();
		
		System.out.println("Masukkan nilai tinggi: ");
		int t = input.nextInt();
		
		int luasSegitiga = a * t / 2;
		
		System.out.println("Masukkan jari jari lingkaran: ");
		int r = input.nextInt();
		
		double luasLingkaran = 3.14 * r * r;
		
		System.out.println("Luas Segitiga = " + luasSegitiga);
		System.out.println("Luas Lingkaran = " + luasLingkaran);
		if (luasSegitiga < luasLingkaran) {
			System.out.println("Luas lingkaran > luas segitiga");
		} else {
			System.out.println("Luas lingkaran < luas segitiga");
		}
	}
}