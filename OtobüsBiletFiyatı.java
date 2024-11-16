import java.util.Scanner;

public class OtobüsBiletFiyatı {

	public static void main(String[] args) {
		int km = 0;
		int age = 0;
		int tripType = 1;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Mesafeyi km türünden giriniz : ");
		km =sc.nextInt();
		System.out.print("Yaşınızı giriniz : ");
		age = sc.nextInt();
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş) : ");
		tripType = sc.nextInt();
		 
		
		if (km > 0 && age > 0 && (tripType == 1 || tripType == 2)) {
			double ticketPrice = km * 0.10;
			double ageDiscountRate = 0;
			
			if (age < 12) {
				ageDiscountRate = 0.50;
			}else if (age >=12 && age <=24) {
				ageDiscountRate = 0.10;
			}else if (age > 65) {
				ageDiscountRate = 0.30;
			}
			ticketPrice -= ticketPrice * ageDiscountRate;
			
			
			if(tripType == 2) {
				ticketPrice -= ticketPrice * 0.20;
				ticketPrice *=2;
			}
			
			System.out.println("Toplam Tutar = " + ticketPrice);
		}else {
			System.out.println("Hatalı veri girdiniz:");
		}
	
		}
	}


