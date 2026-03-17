package day2;

public class ConditionOperLab {

	public static void main(String[] args) {
		int randomNum = (int)(Math.random()*5) + 1;
		int result = 0;
		if(randomNum == 1) {
			 result = 300 + 50; 
		}
		else if(randomNum == 2) {
			 result = 300 - 50; 
		}
		else if(randomNum == 3) {
			 result = 300 * 50; 
		}
		else if(randomNum == 4) {
			 result = 300 / 50; 
		}
		else {
			 result = 300 % 50; 
		}
		System.out.printf("결과값 : %d", result);
	}

}
