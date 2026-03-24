package day7;

import java.util.Date;

public class PolyTest {

	public static void main(String[] args) {
		printInfo("가나다");
		printInfo("ABC");
		printInfo(new Date());
		printInfo(new int[10]);
		printInfo(new A());
		printInfo(new java.io.File("javaedu"));
//		printInfo(new Integer(100)); -> deprecate
		printInfo(Integer.valueOf(100));

	}
	
	static void printInfo(Object obj) {
		if(obj instanceof String) {
			System.out.println("String  객체가 전달됨 - " + obj.toString() + " - " + ((String)obj).length());
		} else {
			System.out.println("obj 변수에 전달된 객체의 클래스명 : " + obj.getClass().getName());
		}
	}

}
