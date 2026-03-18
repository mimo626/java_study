package day3;

public class WhileLab1 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 5;
		
		System.out.println("[ for 결과 ]");
		for(int i = 1; i <= num; i++) {
			System.out.printf("%d -> %d\n", i, i*i);
		}
		
		System.out.println("[ while 결과 ]");
		int i = 1;
		while (i <= num) {
			System.out.printf("%d -> %d\n", i, i*i);
			i++;
		}

	}

}
