import java.util.Scanner;

public class PersegiPanjang {
	public static void main(String[] args){
		double panjang, lebar, luas, keliling;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan panjang persegi panjang: ");
		panjang = input.nextDouble();
		System.out.print("Masukan lebar persegi panjang: ");
		lebar = input.nextDouble();
		luas = panjang * lebar;
		keliling = (panjang + lebar) * 2;
				
		System.out.println("Luas persegi panjang = " + luas);
		System.out.println("Keliling persegi panjang = " + keliling);
		
	
	}
}