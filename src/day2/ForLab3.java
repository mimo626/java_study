package day2;

public class ForLab3 {

	public static void main(String[] args) {
		for(int i = 9; i >= 4; i--) {
			String oddOrEven = (i % 2 == 1) ? "홀수" : "짝수";
			System.out.println(i + " : " + oddOrEven);
		}

	}

}
