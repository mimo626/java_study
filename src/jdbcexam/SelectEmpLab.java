package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class SelectEmpLab {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try(Connection conn = DriverManager.getConnection(url, user, passwd);
				Statement stmm = conn.createStatement()) {
			boolean istrue = new Random().nextBoolean();
			if(istrue) {
				ResultSet rs = stmm.executeQuery("select ename, (format(sal, 0)) as sal from emp");
				if(rs.next()) {
					do {
						System.out.printf("%s 직원의 월급은 %s달러입니다.\n",
							rs.getString("ename"), rs.getString("sal"));
					} while(rs.next());
				} else {
					System.out.println("조회되는 직원이 없습니다.");
				}
			} else {
				ResultSet rs = stmm.executeQuery("select ename, date_format(hiredate, '%Y년 %m월 %d일') hiredate1 "
						+ "from emp order by hiredate desc");
				if(rs.next()) {
					do {
						System.out.printf("%s 직원은 %s에 입사하였습니다.\n", 
								rs.getString("ename"), rs.getString("hiredate1"));
					}while(rs.next());
				} else {
					System.out.println("조회되는 직원이 없습니다.");
				}
			}
			
		} catch (SQLException se1) {
			System.out.println("오류: " + se1.getMessage());
		}
	}

}
