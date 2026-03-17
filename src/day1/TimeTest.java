package day1;

public class TimeTest {

	public static void main(String[] args) {
		int time = 32150;
		int hour = time / 3600;
		time %= 3600;
		int minute = time/ 60;
		int second = time % 60;
		
		System.out.print(hour + "시간 " + minute + "분 " + second + "초");

	}

}
