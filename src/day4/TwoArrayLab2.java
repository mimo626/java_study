package day4;

public class TwoArrayLab2 {

	public static void main(String[] args) {
		char[][] charArr = {
				{'B', 'C', 'A', 'A'},
				{'C', 'C', 'B', 'B'},
				{'D', 'A', 'A', 'D'}
		};
		
		int[] countArr = new int[4];
		
//		for(int row = 0; row < charArr.length; row++) {
//			for(int col = 0; col < charArr[row].length; col++) {
//				char c = charArr[row][col];
//				switch(c) {
//					case 'A': countArr[0]++; break;
//					case 'B': countArr[1]++; break;
//					case 'C': countArr[2]++; break;
//					default: countArr[3]++;
//				}
//			}
//		}
		
		for(int row = 0; row < charArr.length; row++) {
			for(int col = 0; col < charArr[row].length; col++) {
				char c = charArr[row][col];
				countArr[c-65]++;
			}
		}
		
		System.out.printf("A는 %d개입니다.\nB는 %d개입니다.\nC는 %d개입니다.\nD는 %d개입니다.",
				countArr[0], countArr[1], countArr[2], countArr[3]);
		
	}

}
