package day2;

public class ForLab6 {

	public static void main(String[] args) {
		int thrToTen = (int)(Math.random()*8 + 3); // 3~10범위이므로 *7이 아닌 8
		int oneToThr = (int)(Math.random()*3 + 1);
		final String SPECIALCODE; // 한번 선언 후 초기화는 한번만 하므로 final 상수 가능함.

		switch(oneToThr) {
			case 1: SPECIALCODE = "*"; break;
			case 2: SPECIALCODE = "$"; break;
			default: SPECIALCODE = "#";
		}

		for(int i = 1; i <= thrToTen; i++) {
			System.out.print(SPECIALCODE);
		}

	}

}
