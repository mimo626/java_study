package day2;

public class OperAndLab {

	public static void main(String[] args) {
		int grade = (int)(Math.random() * 6) + 1;
		
		if(grade != 4 && grade != 5 && grade != 6) { // !=를 반복하는건 가독성 떨어짐 1<= grade <=3으로 범위 설정이 나
			System.out.printf("%d학년은 저학년입니다.", grade);
		} else {
			System.out.printf("%d학년은 고학년입니다.", grade);
		}

	}

}
