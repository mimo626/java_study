package day3;

public class WhileLab2 {

	public static void main(String[] args) {
		String result;
		
		while(true) {
			int pairNum1 = (int)(Math.random()*6) + 1;
			int pairNum2 = (int)(Math.random()*6) + 1;
			
			if(pairNum1 == pairNum2) {
				result = "게임 끝";
				break;
			} else {
				result = (pairNum1 > pairNum2) ? (pairNum1 + "이 " +pairNum2 + "보다 크다") : (pairNum1 + "이 " +pairNum2 + "보다 작다") ;
			}
		System.out.println(result);
		}
		System.out.println(result);
	}

}
