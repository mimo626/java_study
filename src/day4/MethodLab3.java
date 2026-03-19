package day4;

public class MethodLab3 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int diff;
		for(int i = 0; i < 5; i++) {
			num1 = (int)(Math.random()*30) + 1;
			num2 = (int)(Math.random()*30) + 1;
			diff = getDiff(num1, num2);
			System.out.printf("%d 와 %d 의 차는 %d 입니다.\n", num1, num2, diff);
		}
	}
	
	static int getDiff(int num1, int num2) {
		if(num1 > num2) return (num1-num2);
		else return(num2 - num1);
	}

}
