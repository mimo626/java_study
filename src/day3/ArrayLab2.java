package day3;

public class ArrayLab2 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		int sum = 0;
		
		System.out.print("모든 원소의 값 : ");
		for (int i = 0; i < ary.length; i++) {
			ary[i] = (int)(Math.random()*17) + 4;
			sum += ary[i];
			System.out.print((i == ary.length-1) ? ary[i] + "\n" : ary[i] + ", ");
		}
		
		System.out.println("모든 원소의 합 : " + sum);

	}

}
