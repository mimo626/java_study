package day7.mobile;

public class MobileTest {

	public static void main(String[] args) {
		Mobile ltab = new Ltab("Ltab", 500, "ABC-01");
		Mobile otab = new Otab("Otab", 1000, "XYZ-20");
		
		printTitle();
		printMobile(ltab);
		printMobile(otab);

		int minute = 10;
		ltab.charge(minute);
		otab.charge(minute);
		
		System.out.println("\n[ 10분 충전 ]");
		printTitle();
		printMobile(ltab);
		printMobile(otab);
		
		minute = 5;
		ltab.operate(minute);
		otab.operate(minute);
		
		System.out.println("\n[ 5분 통화 ]");
		printTitle();
		printMobile(ltab);
		printMobile(otab);

	}                                                                                                                                                                                                                                                                                                                                                                                                  
	public static void printMobile(Mobile mobile) {
		System.out.println(mobile.getMobileName() + "                  " 
		+ mobile.getBatterySize() + "                    " + mobile.getOsType());
	 }
	 public static void printTitle() {
			System.out.println("Mobile              Battery                  OS");
			System.out.println("------------------------------------------");
	 }
}
