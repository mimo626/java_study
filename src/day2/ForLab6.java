package day2;

public class ForLab6 {

	public static void main(String[] args) {
		int thrToTen = (int)(Math.random()*7 + 3);
		int oneToThr = (int)(Math.random()*3 + 1);
		String specialCode;

		switch(oneToThr) {
			case 1: specialCode = "*"; break;
			case 2: specialCode = "$"; break;
			default: specialCode = "#";
		}

		for(int i = 1; i <= thrToTen; i++) {
			System.out.print(specialCode);
		}

	}

}
