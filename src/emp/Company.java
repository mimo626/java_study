package emp;

public class Company {

	public static void main(String[] args) {
		// Employee 배열에 객체들을 생성하여 저장한다.
		Secretary secretary = new Secretary("Duke", 1, "secretary", 800);
		Sales sales = new Sales("Tuxi", 2, "sales", 1200);
		int employeeCount = 2;
		int incentive = 100;

		Employee[] employees = new Employee[employeeCount];
		employees[0] = new Secretary("Duke", 1, "secretary", 800);
		employees[1] = new Sales("Tuxi", 2, "sales", 1200);

//		employees[0] = secretary;
//		employees[1] = sales;

		printEmployee(employees, false);
		System.out.println();
		
		System.out.println("[ 인센티브 " + incentive + " ]");
		for(Employee e : employees) {
			if(e instanceof Sales) ((Sales)e).incentive(incentive);
			else ((Secretary)e).incentive(incentive);
		}
		
		printEmployee(employees, true);
	}
	
	public static void printEmployee(Employee[] emp, boolean isTax) {
		if(isTax) {
			System.out.println("name \t department \t salary \t tax \t extra pay");
			System.out.println("---------------------------------------------");
			for(Employee e : emp) {
				if(e instanceof Sales) {
					// Employee에 tax()는 저장되어있는 메서드로 바로 호출 가 -> tax()
					System.out.printf("%-10s %-10s %10d \t %.1f \t %.1f\n", 
							e.getName(), e.getDepartment(), e.getSalary(), e.tax(), ((Sales)e).getExtraPay());
					// ((Bonus)e).getExtraPay() -> Bonus 타입으로도 형변환 가능
				} else {
					System.out.printf("%-10s %-10s %10d \t %.1f\n",
							e.getName(), e.getDepartment(), e.getSalary(), e.tax());
				}
			}
		} else {
			System.out.println("name \t department \t salary \t extra pay");
			System.out.println("---------------------------------------------");
			for(Employee e : emp) {
				if(e instanceof Sales) {
					System.out.printf("%-10s %-10s %10d \t %.1f\n", 
							e.getName(), e.getDepartment(), e.getSalary(), ((Sales)e).getExtraPay());
				} else {
					System.out.printf("%-10s %-10s %10d\n",
							e.getName(), e.getDepartment(), e.getSalary());
				}
			}
		}
		
		
	}

}
