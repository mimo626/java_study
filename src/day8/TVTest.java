package day8;

public class TVTest {
	public static void main(String args[]) {
		SaleTV saleTv = new SaleTV(300000, "SALETV-1", 40, 1);
		RentalTV rentalTv = new RentalTV(100000, "RENTALTV-10", 42, 1);
		
		saleTv.channelUp();
		saleTv.channelUp();
		
		rentalTv.channelDown();
		rentalTv.channelDown();
		rentalTv.channelDown();
		
		printAllTV(saleTv);
		System.out.println();
		printAllTV(rentalTv);
		
		printRentalTV(rentalTv);
}
	static void printAllTV(TV tv) {
		System.out.println(tv.toString());
		
		if(tv instanceof SaleTV) {
			SaleTV tv1 = ((SaleTV)tv);
			tv1.play();
			tv1.sale();
		}
		else if(tv instanceof RentalTV) {
			RentalTV tv1 = ((RentalTV)tv);
			tv1.play();
		}
	}
	static void printRentalTV(Rentable tv) {
		tv.rent();
	}
}