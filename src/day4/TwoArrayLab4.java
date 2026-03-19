package day4;

public class TwoArrayLab4 {

	public static void main(String[] args) {
		int[][] intArr = new int[4][];
		intArr[0] = new int[]{10, 20, 30, 40, 50};
		intArr[1] = new int[]{5, 10, 15};
		intArr[2] = new int[]{11, 22, 33, 44};
		intArr[3] = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
		
//		int sum;
//		for(int row = 0; row < intArr.length; row++) {
//			sum = 0;
//			for(int col = 0; col < intArr[row].length; col++) {
//				sum += intArr[row][col];
//			}
//			System.out.printf("%d행의 합은 %d입니다.\n", row+1, sum);
//		}
		
//		int[] sums = new int[intArr.length];
//
//		for(int row = 0; row < intArr.length; row++) {
//			for(int col = 0; col < intArr[row].length; col++) {
//				sums[row] += intArr[row][col];
//			}
//			System.out.printf("%d행의 합은 %d입니다.\n", row+1, sums[row]);
//		}
		
		int rowNum = 1;
		int num;
		for(int[] row: intArr ) {
			num = 0;
			for(int elem:row) {
				num += elem;
			}
			System.out.printf("%d행의 합은 %d입니다.\n", rowNum++,num);
		}

	}

}
