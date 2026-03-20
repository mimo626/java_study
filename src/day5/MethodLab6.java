package day5;

public class MethodLab6 {

	public static void main(String[] args) {  
		System.out.println("[ 실행 결과 ]");
		printArray(powerArray(2));
		printArray(powerArray(3));
		printArray(powerArray(4));
	}
	
	static int[] powerArray(int num) {
		int[] numArr = new int[] {1, 2, 3, 4, 5, 6, 7,  8, 9, 10};
		for(int i = 0; i<numArr.length; i++) {
			numArr[i] *= num;
		}
		
		return numArr;
	}
	
	static void printArray(int[] numArr) {
		for(int i = 0; i < numArr.length; i++) {
			System.out.print((i == numArr.length-1) ? numArr[i] + "\n" : numArr[i] + ", ");
		}
	}
}
