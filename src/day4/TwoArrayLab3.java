package day4;

public class TwoArrayLab3 {

	public static void main(String[] args) {
		int[][] gameTimes = {
				{5,  2,  1,  0,  2,  3,   6},
				{4,  3,  2,  1,  1,  0,   5},
				{3,  1,  2,  1,  3,  1,   3},
				{4,  3,  1,  0,  4,  2,   7},
		};
		char[] days = {'일', '월', '화', '수', '목', '금', '토'};
		int[] daysTime = new int[7];
		int[] weeksTime = new int[4];
		
		for(int col = 0; col < gameTimes[0].length; col++) {
			for(int row = 0; row < gameTimes.length; row++) {
				daysTime[col] +=  gameTimes[row][col];
			}
			System.out.printf("%c요일 : %d시간\n", days[col], daysTime[col]);
		}
		System.out.println();
		
		for(int row = 0; row < gameTimes.length; row++) {
			for(int col = 0; col < gameTimes[row].length; col++) {
				weeksTime[row] +=  gameTimes[row][col];
			}
			System.out.printf("%d주차 : %d시간\n", row+1, weeksTime[row]);
		}

	}

}
