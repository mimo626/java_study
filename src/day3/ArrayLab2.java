package day3;

public class ArrayLab2 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		int sum = 0;
		
		System.out.print("모든 원소의 값 : ");
		for (int i = 0; i < ary.length; i++) {
			ary[i] = (int)(Math.random()*17) + 4;
			sum += ary[i];
			// 모든 원소의 합 출력문도 합
			System.out.print(
					(i == ary.length-1) ? ary[i] + "\n"
					+ "모든 원소의 합 : " + sum 
					: ary[i] + ", ");
		}
	}

}
