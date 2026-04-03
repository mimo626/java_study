package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertBookLab {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try ( Connection conn = DriverManager.getConnection(url, user, passwd);
				PreparedStatement pstm = conn.prepareStatement("INSERT INTO book(title, price, kind) VALUES(?, ?, ?)");
				Scanner sc = new Scanner(System.in)
		){
			int count = 0;
			while(true) {
				System.out.print("도서명을 입력하세요 : ");
				String title = sc.nextLine();
				System.out.print("가격을 입력하세요 : ");
				int price = Integer.parseInt(sc.nextLine());
				System.out.print("도서분류에 대한 넘버를 입력하세요.\n"
						+ "1. 프로그래밍 언어\n"
						+ "2. 웹 프로그래밍\n"
						+ "3. 빅데이터\n"
						+ "4. 데이터베이스\n"
						+ " 5. 인프라\n선택(1~5) :");
				int num = Integer.parseInt(sc.nextLine());
				pstm.setString(1, title);
				pstm.setInt(2, price);
				pstm.setString(3, "b0" + num);
				int isInsert = pstm.executeUpdate();
				System.out.println(isInsert);
				if(isInsert == 1) {
					System.out.println("정보가 입력되었습니다.");
					count++;
				}
				else {
					System.out.println("정보가 저장되지 못했습니다.");
				}
				
				System.out.print("계속 입력하겠습니까?(y/n)");
				String aws = sc.nextLine();
				if (aws.equalsIgnoreCase("y")) {
					continue;
				} 
				System.out.printf("%d개의 데이터 입력 완료!\n", count);
				break;
			}
			
		} catch (SQLException se) {
			System.out.println("오류: " + se.getMessage());
		}
		

	}

}
