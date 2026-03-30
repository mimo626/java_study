package day10.fileio;


import java.io.File;
import java.io.FileWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FileOutLab {
	public static void main(String[] args) {
		String path = "/Users/kangminju/Desktop";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdir();
		}
		try (FileWriter writer = new FileWriter("/Users/kangminju/Desktop/event.txt", true);
				//PrintWriter out = new PrintWriter(writer);
				) {
			LocalDate date1 = LocalDate.of(2026, 8, 15);
			LocalDate date2 = LocalDate.of(2026, 12, 25);

			DayOfWeek day1 = date1.getDayOfWeek();
			DayOfWeek day2 = date2.getDayOfWeek();

			String korday1 = day1.getDisplayName(TextStyle.FULL, Locale.KOREAN);
			String korday2 = day2.getDisplayName(TextStyle.FULL, Locale.KOREAN);
			
			// 이전 코드 
//			out.printf("%d년 %d월 %d일은 %s입니다.\r\n", 2026, 8, 15, korday1);
//			out.printf("%d년 %d월 %d일은 %s입니다.\r\n", 2026, 12, 25, korday2);

			writer.write(String.format("%d년 %d월 %d일은 %s입니다.\r\n", date1.getYear(), date1.getMonthValue(), date1.getDayOfMonth(), korday1));
			writer.write(String.format("%d년 %d월 %d일은 %s입니다.\r\n", date2.getYear(), date1.getMonthValue(), date2.getDayOfMonth(), korday2));
			
			// 포맷팅으로 하는 방식 
//			writer.write(String.format("%tY년 %1$tm월 %1$td일은 %1$tA입니다.\n", date1));
//			writer.write(String.format("%tY년 %1$tm월 %1$td일은 %1$tA입니다.\n", date2));

			System.out.println("저장이 완료되었습니다.");

		} catch (Exception e) {
			// 에러메시지 출력 습관적으로 하기 
			e.printStackTrace();
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
	}
}
