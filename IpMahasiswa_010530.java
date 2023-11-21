import java.util.Scanner;

public class IpMahasiswa {
	public IpMahasiswa() {
	}
	
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
		
		System.out.print("Masukkan nilai PKN: ");
        double var2 = var1.nextDouble();
		
		System.out.print("Masukkan nilai Akidah Akhlak: ");
        double var4 = var1.nextDouble();
		
		System.out.print("Masukkan nilai PTIK: ");
		double var6 = var1.nextDouble();
		
		System.out.print("Masukkan nilai Bahasa Indonesia: ");
		double var8 = var1.nextDouble();
		
		double var10 = (var2 + var4 + var6 + var8) / 4.0;
		double var12 = 0.0;
        if (var10 >= 85.0) {
			var12 = 4.0;
        } else if (var10 >= 70.0) {
			var12 = 3.0 + (var10 - 70.0) / 8.0 ;
        } else if (var10 >= 55.0) {
			var12 = 2.0 + (var10 - 55.0) / 8.0;
        } else if (var10 >= 40.0) {
			var12 = 1.0 + ( var10 - 40.0) / 8.0;
		}
		
		System.out.println("Nilai PKN adalah: " + var2);
		System.out.println("Nilai Akidah Akhlak adalah: " + var4);
		System.out.println("Nilai PTIK adalah: " + var6);
		System.out.println("Nilai Bahasa Indonesia adalah: " + var8);
		System.out.println("IP Mahasiswa: " + var12);
		var1.close();
    }
}