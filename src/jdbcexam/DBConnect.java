package jdbcexam;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "jdbctest";
			String password = "jdbctest";
			// static 메서드에 접근해 연결 성공하면 Connection 객체 반환 받음 
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스에 접속했습니다.");
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB 서버명: " + meta.getDatabaseProductName()); // MySQL
			System.out.println("사용자명: " + meta.getUserName()); // jdbctest
		} catch (SQLException se1) {
			System.out.println(se1);
		} finally {
			try {
				conn.close();
			} catch (SQLException se2) {
				System.out.println(se2.getMessage());
			}
		}

	}

}
