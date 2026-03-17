package day2;

public class ForLab4 {

	public static void main(String[] args) {
		int oneToTen = (int)(Math.random()*10) + 1;
		int ThirtyToFourty = (int)(Math.random()*10) + 31;
		
		int sum = 0;
		
		for(int i = oneToTen; i <= ThirtyToFourty; i++) {
			if(i%2 == 0) sum += i;
		}
		
		System.out.print(oneToTen + " 부터 " + ThirtyToFourty + "까지 짝수의 합 : " + sum );

	}

}
