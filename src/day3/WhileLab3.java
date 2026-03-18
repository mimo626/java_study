package day3;

public class WhileLab3 {

	public static void main(String[] args) {
		System.out.println("[ 수행시작 ]");
		int count = 0;
		
		while(true) {
			int randomNum = (int)(Math.random()*31);
			if(randomNum == 0 || randomNum >= 27) {
				break;
			}
			else {
				count++;
				int plusNum =(randomNum+64);
				System.out.printf("%d-%c, %d, 0x%x\n", randomNum, plusNum, plusNum, plusNum);
			}
		}
		System.out.println("[ 수행 종료 ] - 출력횟수는 " + count + " 번");
	}

}
