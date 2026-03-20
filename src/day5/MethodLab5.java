package day5;

public class MethodLab5 {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[] {10, 20, 30};
		arr[1] = new int[] {100, 500, 300, 200, 400};
		arr[2] = new int[] {1, 10, 3, 4, 5, 8, 7, 6, 9, 2};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("가장 큰 값은 " + maxNumArray(arr[i]) + " 입니다.");
		}
	}
	
	static int maxNumArray(int[] numArr) {
		int max = numArr[0];
		for(int i = 1; i < numArr.length; i++) {
			if(max < numArr[i]) {
				max = numArr[i];
			}
		}
		return max;
	}

}
