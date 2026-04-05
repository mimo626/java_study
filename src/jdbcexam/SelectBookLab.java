package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SelectBookLab {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		
		// Map 사용: 번호와 SQL문을 명확하게 매핑
		Map<Integer, String> sqlMap = new HashMap<>();
		sqlMap.put(1, "SELECT id, title, concat(format(price, 0), '원') as resultPrice, kind FROM book");
		sqlMap.put(2, "SELECT id, title, concat(format(price, 0), '원') as resultPrice, kind FROM book ORDER BY price DESC");
		sqlMap.put(3, "SELECT title, concat(format(price, 0), '원') as resultPrice FROM book WHERE price > 20000");
		sqlMap.put(4, "SELECT title, concat(format(price, 0), '원') as resultPrice FROM book WHERE kind = 'b02'");
		sqlMap.put(5, "SELECT title, concat(format(price, 0), '원') as resultPrice FROM book WHERE kind = 'b04' or kind = 'b05'");
		sqlMap.put(6, "SELECT title, concat(format(price, 0), '원') as resultPrice FROM book WHERE title LIKE '%자바%'");

		// Connection과 Scanner는 프로그램 전체에서 쓰이므로 바깥쪽 try-with-resources에서 관리
		try ( Connection conn = DriverManager.getConnection(url, user, passwd);
			  Scanner sc = new Scanner(System.in) ) {
			
			while(true) {
				System.out.print("1. 모두 출력하기\n"
						+ "2. 가격이 높은 순으로 출력하기\n"
						+ "3. 20000 이상의 도서들만 출력하기 \n"
						+ "4. 웹 프로그래밍 도서들만 출력하기\n"
						+ "5. 데이터베이스와 인프라 도서들만 출력하기\n"
						+ "6. 도서명에 '자바'를 포함하는 도서들만 출력하기\n"
						+ "\n원하는 메뉴의 번호를 선택 : ");
				int selectNum = sc.nextInt();
				sc.nextLine();
				
				// Map에 없는 번호를 입력했을 때의 예외 처리 추가
				if (!sqlMap.containsKey(selectNum)) {
					System.out.println("잘못된 번호입니다. 다시 선택해주세요.\n");
					continue;
				}
				
				// PreparedStatement 사용 및 ResultSet 자원 해제
				try ( PreparedStatement pstmt = conn.prepareStatement(sqlMap.get(selectNum));
					  ResultSet rs = pstmt.executeQuery() ) {
					
					if(rs.next()) {
						// 번호가 1~2번이면 true, 그 외에는 false 
						//boolean isAllPrint = (selectNum == 1 || selectNum == 2);
						printDynamicBook(rs);
					} else {
						System.out.println("조회되는 내용이 없습니다.");
					}
					
				}
				
				System.out.println("\nbook 테이블 조회 완료");
				System.out.print("계속 입력하겠습니까?(y/n) ");
				String aws = sc.nextLine();
				if (aws.equalsIgnoreCase("y")) {
					System.out.println();
					continue;
				}  
				System.out.println("book 테이블 조회 작업 종료");
				break;
			}
			
		} catch (SQLException se) {
			System.out.println("오류: " + se.getMessage());
		}
	}

	private static void printSelectBook(ResultSet rs, boolean isAllPrint) throws SQLException {		
		System.out.println(isAllPrint ? 
				String.format( "%6s  %-28s  %12s  %-6s\n--------------------------------------------------------------", 
				"아이디", "제목", "가격", "종류")
				:
				String.format("%-28s  %12s\n------------------------------------------------", 
						"제목", "가격"));
		do {
			System.out.println( isAllPrint ? 
					String.format("%6d  %-28s  %12s %-6s",
					rs.getInt("id"), 
					rs.getString("title"),
					rs.getString("resultPrice"), 
					rs.getString("kind")) 
					:
					String.format("%-28s  %12s",
							rs.getString("title"),
							rs.getString("resultPrice")));
		} while (rs.next());
	}
	
	private static void printDynamicBook(ResultSet rs) throws SQLException {
	    // 1. 메타데이터 객체 가져오기
	    ResultSetMetaData rsmd = rs.getMetaData();
	    
	    // 2. 조회된 컬럼이 총 몇 개인지 파악 (예: 1번 메뉴는 4개, 3번 메뉴는 2개)
	    int columnCount = rsmd.getColumnCount();
	    
	    // 3. 동적으로 헤더(컬럼명) 출력하기
	    System.out.println("-------------------------------------------------");
	    for (int i = 1; i <= columnCount; i++) {
	        // DB에서 컬럼 이름을 직접 가져와서 출력
	        System.out.print(rsmd.getColumnName(i) + "\t\t"); 
	    }
	    System.out.println("\n-------------------------------------------------");
	    
	    // 4. 동적으로 실제 데이터 출력하기
	    while (rs.next()) {
	        for (int i = 1; i <= columnCount; i++) {
	            // 컬럼 개수만큼 반복하며 데이터 꺼내기 (타입 상관없이 String으로 가져옴)
	            System.out.print(rs.getString(i) + "\t\t");
	        }
	        System.out.println(); // 한 행(Row) 출력이 끝나면 줄바꿈
	    }
	}
}