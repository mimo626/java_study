package day3;

public class LottoMachine1 {

	public static void main(String[] args) {
		int[] intArr = new int[6 + 1];
		boolean[] isExist = new boolean[45 + 1];
		
		for(int i = 1; i < intArr.length; i++) {
			int randomNum = (int)(Math.random()*45) + 1;
			if(isExist[randomNum]) { 
				while(isExist[randomNum]) {
					randomNum = (int)(Math.random()*45) + 1;
					if(!isExist[randomNum]) break;
				}
			}
			isExist[randomNum] = true;
			intArr[i] = randomNum;
		}
		
		System.out.print("오늘의 로또 번호 - ");
		for(int i = 1; i < intArr.length; i++) {
			System.out.print((i == intArr.length-1) ? intArr[i] + "" : intArr[i] + ", ");
		}

	}

}
