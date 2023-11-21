import java.util.Scanner;

public class ShoppingList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] prices = {2500, 3000, 4000, 5000, 6000};
		int[] quantities = {2, 1, 3, 0, 3};
		
		int totalItems = 0;
		int totalPrice = 0;
		
		System.out.println("Daftar belanja dan harga: ");
		for (int i = 0; i < prices.length; i++) {
			int itemPrice = prices[i];
			int itemQuantity = quantities[i];
			
			totalItems += itemQuantity;
			totalPrice += itemPrice * itemQuantity;
			
		if (itemQuantity >= 0) {
			System.out.println("Harga barang ke-" + (i+1) + ", " + itemPrice +
			", " + itemQuantity + " item : " + (itemPrice * itemQuantity));
			}
		}
		
		System.out.println();
		System.out.println("TOTAL ITEM BELANJA : " + totalItems);
		System.out.println("TOTAL BELANJA : Rp." + totalPrice);
	}
}