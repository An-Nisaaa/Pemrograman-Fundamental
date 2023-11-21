import java.util.Scanner;

public class IpMahasiswa {	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Masukkan nilai PF: ");
		double PF = scanner.nextDouble();
		
		System.out.println("Masukkan nilai Sistem Digital: ");
		double SisDig = scanner.nextDouble();
		
		System.out.println("Masukkan nilai Kalkulus: ");
		double Kalkulus = scanner.nextDouble();
		
		System.out.println("Masukkan nilai Bahasa Indonesia: ");
		double bahasaIndonesia = scanner.nextDouble();
		
		double sksPF = 4.0;
		double sksSistemDigital = 3.0;
		double sksKalkulus = 3.0;
		double sksBahasaIndonesia = 2.0;
		
		double IPPF = (4.0 - Math.abs(PF - 3.5)) * sksPF;
		double IPSistemDigital = (4.0 - Math.abs(PF - 3.5)) * sksSistemDigital;
		double IPKalkulus = (4.0 - Math.abs(PF - 3.5)) * sksKalkulus;
		double IPBahasaIndonesia = (4.0 - Math.abs(PF - 3.5)) * sksBahasaIndonesia;
		
		double totalIP = IPPF + IPSistemDigital + IPKalkulus + IPBahasaIndonesia;
		double totalsks = sksPF + sksSistemDigital + sksKalkulus + sksBahasaIndonesia;
		double ipk = totalIP / totalsks;
		
		System.out.println("IPK Anda adalah: ", ipk);
	}
}