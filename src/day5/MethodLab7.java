package day5;

public class MethodLab7 {

	public static void main(String[] args) {
		System.out.println("[ 실행 결과 ]\n");
		
//     int ...의 가변형 인자는 정수로 나열된 값을 배열로 변환해 주기에 배열로 저장해서 전달할 필요가 없음
//		int[][] nums = new int[4][];
//		nums[0] = new int[] {10, 2, 5, 13, 7};
//		nums[1] = new int[] {11, 22, 33, 44, 55, 66};
//		nums[2] = new int[0];
//		nums[3] = new int[] {100, 101, 103};
//		
//		for(int i = 0; i<nums.length; i++) {
//			System.out.println("호출 " + (i+1) + " : " + addEven(nums[i]));
//		}
		
		// 가변형 인자의 목적 중 하나가 배열 생성의 번거로움을 제거한 것임 -> 정수로만 쓰는게 목적에 맞게 활용하는 것
		System.out.println("호출 1 : " + addEven(10, 2, 5, 13, 7));
		System.out.println("호출 1 : " + addEven(11, 22, 33, 44, 55, 66));
		System.out.println("호출 1 : " + addEven());
		System.out.println("호출 1 : " + addEven(100, 101, 103));

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
