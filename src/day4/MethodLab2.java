package day4;

public class MethodLab2 {

	public static void main(String[] args) {
		System.out.println(isEven(10) ? "10은 짝수 입니다." : "10은 홀수 입니다.");
		System.out.println(isEven(3) ? "3은 짝수 입니다." : "3은 홀수입니다.");
	}
	
	static boolean isEven(int num) {
//		if(num % 2 == 0) return true;
//		else return false;
		return num % 2 == 0;
	}

}
