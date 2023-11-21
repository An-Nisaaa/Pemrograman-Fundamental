public class SimpleArray {
	public static void main(String[] args) {

		int[] arr = {2, 3, 10, 9, 19, 4};
		int total = 0;
		
		System.out.println("Data: ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i] + " = genap");
			} else {
				System.out.println(arr[i] + " = ganjil");
			}
			total += arr[i];
		}
		
		System.out.println("Total Penjumlahan = " + total);
		System.out.println("Rata-Rata = " + (double) total / arr.length);
	}
}