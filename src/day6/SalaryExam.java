package day5;

class SalaryExpr{
	int bonus;
	
	SalaryExpr(){
		bonus = 0;
	}
	
	SalaryExpr(int bonus){
		this.bonus = bonus;
	}
	
	int getSalary(int grade){
		switch(grade) {
			case 1: bonus += 100; return bonus;
			case 2: bonus += 90; return bonus;
			case 3: bonus += 80; return bonus;
			default: bonus += 70; return bonus;
		}
	}
}

public class SalaryExam {

	public static void main(String[] args) {
		int month = (int)(Math.random()*12) + 1;
		int grade = (int)(Math.random()*4) + 1;
		int bonus;
		
		if(month % 2 == 0) {
			SalaryExpr salaryExpr = new SalaryExpr(100);
			bonus = salaryExpr.getSalary(1);
			
		} else {
			SalaryExpr salaryExpr = new SalaryExpr();
			bonus = salaryExpr.getSalary(grade);
		}
		
		System.out.printf("%d월 %d등급의 월급은 %d입니다.", month, grade, bonus);
	}

}
