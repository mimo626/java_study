package day5;

public class MethodLab7 {

	public static void main(String[] args) {
		System.out.println("[ 실행 결과 ]\n");
		
		int[][] nums = new int[4][];
		nums[0] = new int[] {10, 2, 5, 13, 7};
		nums[1] = new int[] {11, 22, 33, 44, 55, 66};
		nums[2] = new int[0];
		nums[3] = new int[] {100, 101, 103};
		
		for(int i = 0; i<nums.length; i++) {
			System.out.println("호출 " + (i+1) + " : " + addEven(nums[i]));
		}
	}
	static int addEven(int ... nums) {
		if(nums.length == 0) return -1;
		
		int evenSum = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				evenSum += nums[i];
			}
		}
		return evenSum;
	}
}
