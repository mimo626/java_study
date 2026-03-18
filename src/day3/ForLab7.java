package day3;

public class ForLab7 {

	public static void main(String[] args) {
		final char CODE = '&';
		int randomNum = (int)(Math.random()*6 + 5);

		for(int i = 1; i <= randomNum; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(CODE);
			}
			System.out.println();
		}

	}

}
