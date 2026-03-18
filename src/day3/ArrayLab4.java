package day3;

public class ArrayLab4 {

	public static void main(String[] args) {
		int arrLength = (int)(Math.random()*6) + 5;
		int[] intArr = new int[arrLength];
		char[] charArr = new char[arrLength];
		
		for(int i = 0; i <arrLength; i++) {
			int randomNum = (int)(Math.random()*26) + 1;
			intArr[i] = randomNum;
			charArr[i] = (char)(randomNum +96);
		}

		for(int i = 0; i <arrLength; i++) {
			System.out.print((i == arrLength-1) ? intArr[i] + "\n" : intArr[i] + ", ");
		}

		for(int i = 0; i <arrLength; i++) {
			System.out.print((i == arrLength-1) ? charArr[i] + "" : charArr[i] + ", ");
		}
	}

}
