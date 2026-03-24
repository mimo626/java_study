package day7;

import day4.MethodLab4;

public class GuGuDanApp {

	public static void main(String[] args) {
		int dan = MethodLab4.getRandom(1, 20);
		int number = MethodLab4.getRandom(1, 20);
		GuGuDanExpr g;
		
		if(dan <= 9) {
			if(number <= 9) {
				g = new GuGuDanExpr(dan, number);
				System.out.print(dan + " * " + number + " = ");
			}
			else {
				g = new GuGuDanExpr(dan);
				System.out.print(dan + "단 : ");
			}
			g.printPart();
		}
		else {
			GuGuDanExpr.printAll();
		}
	}
}
