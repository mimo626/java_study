package day9;

import java.util.Scanner;

public class EqualsTest1 {
	public static void main(String[] args) {
		String s1 = "가나다";
		String s2 = "가나다";
		String s3 = new String("가나다");
		String s4 = new String("가나다");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println();
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		// String만 hashCode 오버라이딩됨
		// 주소값이 아니라 글자 조합("가나다")을 수학 공식에 넣어서 계산한 결과값을 반환
		// equals()가 true면, 두 객체의 hashCode() 숫자도 무조건 같
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		// 객체 고유의 진짜 주소 기반 해시코드보는 방
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String inputStr = scan.next();
		if(inputStr.equals(s3)) 
			System.out.println("\"가나다\"를 입력했군요...");
		else 
			System.out.println("\"가나다\"가 아니군요...");
		scan.close();
	}
}
