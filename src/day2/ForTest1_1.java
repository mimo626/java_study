package day2;

public class ForTest1_1 {
	public static void main(String[] args) {
		int num; // 미리 선언된 num을 여러 for문에서 사용
		for(num=1; num <= 10; num++)
		   System.out.println(num);
		System.out.println();
		for(num=1; num <= 10; num+=2)
		   System.out.println(num);
		System.out.println(num);  // 11(10보다 크므로 for문에서 빠져나감)
	}
}
