package day4;

public class TwoArrayLab1 {

	public static void main(String[] args) {
		int[][] nums = new int[4][4];
		int plus = 8;

		for(int row = 0; row < nums.length; row++) {
			for(int col = 0; col < nums[row].length; col++) {
				plus += 2;
				nums[row][col] +=  plus;
			}
		}
		
		System.out.println("1행 1열의 데이터 : "+ nums[0][0]+" \n"
				+ "3행 4열의 데이터 : " + nums[2][3] + "\n"
				+ "행의 갯수 : " + nums.length + "\n"
				+ "열의 갯수 : " + nums[1].length);
		
		System.out.print("3행의 데이터들 : ");
		for(int col = 0; col < nums[2].length; col++) {
			System.out.print(nums[2][col] + " ");
		}
		System.out.println();
		
		System.out.print("2열의 데이터들 : ");
		for(int row = 0; row < nums.length; row++) {
			System.out.print(nums[row][1] + " ");
		}
		System.out.println();

		System.out.print("왼쪽 대각선 데이터들 : ");
		for(int row = 0; row < nums.length; row++) {
			System.out.print(nums[row][row] + " ");
		}
		System.out.println();

		System.out.print("오른쪽 대각선 데이터들 : ");
		for(int row = 0; row < nums.length; row++) {
			System.out.print(nums[row][nums.length-1 - row] + " ");
		}


	}

}
