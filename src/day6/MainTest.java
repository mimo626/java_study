package day6;


public class MainTest {
	public static void main(String[] args) {
		main(null);
		// Stack 오버 플로우가 남 -> Call Stack 영역에 main 메서드가 할당되며 쌓임
		// 메서드가 종료되어야 Call Stack에서 사라짐. 
		// 하지만, 계속 재귀로 호출하니 Call Stack 영역 오버 플로우 에러
	}
}
