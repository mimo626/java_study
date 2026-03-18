package day3;

public class ForLab10 {

	public static void main(String[] args) {
		int randomNum = (int)(Math.random()*2 + 1);
		for(int i = randomNum; i < 10; i += 2) {
			for(int j = 1; j <= 9; j++) {
				// 글자 수에 따라 밀리는 현상이 발생해 %3d로 자릿수 지정함 
				System.out.printf("%d x %d = %3d\t", i, j, (i*j));
			}
			System.out.println();
		}

	}

}
