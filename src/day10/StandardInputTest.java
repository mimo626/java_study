package day10;

public class StandardInputTest {

	public static void main(String[] args) throws Exception{
		System.out.print("입력: ");
		int input = System.in.read(); // 1문자만 읽음
		System.out.println("입력된 문자 : " + (char)input);
	}

}
