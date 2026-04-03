package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CheckEmpLab {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try(Connection conn = DriverManager.getConnection(url, user, passwd);
				Statement stmm = conn.createStatement();
				Scanner scan = new Scanner(System.in) ) {
			while(true) {
				System.out.print("직원 이름: ");
				String name = scan.nextLine();
				ResultSet rs = stmm.executeQuery("select ename, date_format(hiredate, '%Y년 %m월') hiredate1, "
						+ "deptno from emp where ename ='" + name + "'");
				if(rs.next()) {
					System.out.printf("%s직원은 근무중입니다.\n%s에 입사했고 현재 %s번 부서에서 근무하고 있습니다.\n",
							rs.getString("ename"), rs.getString("hiredate1"), rs.getString("deptno"));
				} else {
					System.out.printf("%s직원은 근무하지 않습니다.\n", name);
				}
				System.out.println("emp 테이블 조회 완료");
				System.out.print("계속 입력하겠습니까?(y/n)");
				String aws = scan.nextLine();
				if (aws.equalsIgnoreCase("y")) {
					continue;
				} 
				System.out.println("emp 테이블 조회 작업 종료");
				break;
			}
				
		} catch (SQLException se1) {
			System.out.println("오류: " + se1.getMessage());
		}


	}

}
