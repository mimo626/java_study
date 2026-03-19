package day4;

public class MethodLab1 {

	public static void main(String[] args) {
		System.out.print("좋아하는 음식은 ");
		printMyFood() ;
		System.out.print(" 입니다.\n좋아하는 숫자는 " + getMyNumber() + " 입니다.");

	}

	static void printMyFood() {
		System.out.print("떡볶이");
	}
	
	static int getMyNumber() {
		return 2;
	}
}
