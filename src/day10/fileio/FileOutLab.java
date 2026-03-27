package day10.fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
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
				PrintWriter out = new PrintWriter(writer);) {
			LocalDate ld1 = LocalDate.of(2026, 8, 15);
			LocalDate ld2 = LocalDate.of(2026, 12, 25);

			DayOfWeek day1 = ld1.getDayOfWeek();
			DayOfWeek day2 = ld2.getDayOfWeek();

			String korday1 = day1.getDisplayName(TextStyle.FULL, Locale.KOREAN);
			String korday2 = day2.getDisplayName(TextStyle.FULL, Locale.KOREAN);

			out.printf("%d년 %d월 %d일은 %s입니다.\r\n", 2026, 8, 15, korday1);
			out.printf("%d년 %d월 %d일은 %s입니다.\r\n", 2026, 12, 25, korday2);

			System.out.println("저장이 완료되었습니다.");

		} catch (Exception e) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
	}
}
