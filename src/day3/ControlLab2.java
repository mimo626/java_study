package day3;

public class ControlLab2 {

	public static void main(String[] args) {
		int count = 0;
		
		while(true) {
			int randomNum = (int)(Math.random()*11) + 10;
			
			if(randomNum % 3 == 0 || randomNum % 5 == 0) {
				int sum = 0;
				count++;
				for(int i = 1; i <= randomNum; i++) sum += i;
				System.out.println("1부터 " + randomNum + "까지의 합: " + sum);
				continue;
			} else if(randomNum == 11 || randomNum == 17 || randomNum == 19) {
				break;
			} else {
				System.out.println("재수행");
			}
		}
		System.out.println(count + "회 반복함");
	}

}
