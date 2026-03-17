package day2;

public class SwitchLab1 {

	public static void main(String[] args) {
		int grade = (int)(Math.random() * 6) + 1;
		switch(grade) {
		case 1:
		case 2:
		case 3:
			System.out.printf("%d학년은 저학년입니다.", grade);
			break;
		default:
			System.out.printf("%d학년은 고학년입니다.", grade);
		}
	}
}
