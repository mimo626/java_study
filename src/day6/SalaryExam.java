package day6;

import day4.MethodLab4;

class SalaryExpr{
	int bonus;
	
	SalaryExpr(){
		// 기본값이 0이기에 초기화 안해도 가능함 
		this.bonus = 0;
	}
	
	SalaryExpr(int bonus){
		this.bonus = bonus;
	}
	
// bonus에 값이 누적되고, 보너스가 월급의 기능을 하게 됨 
// return을 반복하는 건 가독성에 좋지 않음 - 마지막에 1번!
//	int getSalary(int grade){
//		switch(grade) {
//			case 1: bonus += 100; return bonus;
//			case 2: bonus += 90; return bonus;
//			case 3: bonus += 80; return bonus;
//			default: bonus += 70; return bonus;
//		}
//	}
	
	// 지역변수를 생성해 bonus의 용도에 맞게 함수 구현! 
	int getSalary(int grade){
		// res를 초기화했기에 default문이 없어도 에러 나지 않음
		int res = 0;
		switch(grade) {
			case 1: res = bonus + 100; break;
			case 2: res = bonus + 90; break;
			case 3: res = bonus + 80; break;
			case 4: res = bonus + 70; break;
		}
		return res;
	}
}

public class SalaryExam {

	public static void main(String[] args) {	
		int month = MethodLab4.getRandom(1, 12);
		int grade = (int)(Math.random()*4) + 1;
		// int bonus;
		int resultResult = 0;
		SalaryExpr salaryExpr;
		
		if(month % 2 == 0) {
			salaryExpr = new SalaryExpr(100);
			grade = 1;
			
		} else {
			salaryExpr = new SalaryExpr();
		}
		
		// 1번만 결과를 이용한다면 굳이 변수로 선언하지 않아도 가능, bonus와 월급은 다른 기능을 해야 
		// bonus = salaryExpr.getSalary(grade);
		// resultResult = salaryExpr.getSalary(grade);
		
		System.out.printf("%d월 %d등급의 월급은 %d입니다.\n", month, grade, salaryExpr.getSalary(grade));
	}

}
