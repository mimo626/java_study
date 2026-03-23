package day6;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TodayTest {

	public static void main(String[] args) {
		Date d = new Date();
		// 부모가 Calendar
		// 년, 월, 일 정보 생성 가능 
		GregorianCalendar gc = new GregorianCalendar();
		
		// getDate를 잘 안 써서 이제 줄글 침 -> Deprecate됨 
		// get(Calendar.DAY_OF_WEEK)를 더 권장함 
		System.out.println(d.getDate());
		
		System.out.println(d.toString());
		
		// TimeStamp 타입으로 반환 
		System.out.println(d.getTime());
		
		System.out.println(gc);
		System.out.println(gc.toString());
		// 올해에서 몇 일 지났는지 
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));
		// 이번 달에서 몇 일 지났는지 
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));
		System.out.println(gc.get(Calendar.HOUR));
		System.out.println(gc.get(Calendar.HOUR_OF_DAY));
	}

}
