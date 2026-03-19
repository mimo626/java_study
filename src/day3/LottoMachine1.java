package day3;

public class LottoMachine1 {

	public static void main(String[] args) {
		int[] intArr = new int[6 + 1];
		boolean[] isExist = new boolean[45 + 1];
		
//		for(int i = 1; i < intArr.length; i++) {
//			int randomNum = (int)(Math.random()*45) + 1;
//			while(isExist[randomNum]) {
//				randomNum = (int)(Math.random()*45) + 1;
//				if(!isExist[randomNum]) break;
//			}
//			isExist[randomNum] = true;
//			intArr[i] = randomNum;
//		}
		int count = 0; // 뽑힌 로또 번호의 개수
		
		// 6개를 모두 뽑을 때까지 반복
        while (count < 6) {
            int randomNum = (int)(Math.random() * 45) + 1;
            
            if (!isExist[randomNum]) {
                isExist[randomNum] = true;
                intArr[count] = randomNum; 
                count++; 
            }
        }
		
		System.out.print("오늘의 로또 번호 - ");
		for(int i = 1; i < intArr.length; i++) {
			System.out.print((i == intArr.length-1) ? intArr[i] + "" : intArr[i] + ", ");
		}

	}

}
