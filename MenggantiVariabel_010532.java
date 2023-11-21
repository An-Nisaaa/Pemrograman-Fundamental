public class MenggantiVariabel {
	public static void main(String[] args) {
		int a = 20;
		int b = 31;
		
		System.out.println("Sebelum ditukar:");
		System.out.println("a = " + a + ", b = " + b);
		
		//Menukar nilai variabel a dan b 
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("Setelah ditukar:");
		System.out.println("a = " + a + ", b = " + b);
	}
}