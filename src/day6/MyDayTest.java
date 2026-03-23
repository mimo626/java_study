package day6;

import java.util.Calendar;
import java.util.GregorianCalendar;

class MyDay{
	static char birthDay;

	static {
		GregorianCalendar gc = new GregorianCalendar(2002, 5, 26);
		int weekNum = gc.get(Calendar.DAY_OF_WEEK);
		
		switch(weekNum) {
			case 1: MyDay.birthDay = '일'; break;
			case 2: MyDay.birthDay = '월'; break;
			case 3: MyDay.birthDay = '화'; break;
			case 4: MyDay.birthDay = '수'; break;
			case 5: MyDay.birthDay = '목'; break;
			case 6: MyDay.birthDay = '금'; break;
			case 7: MyDay.birthDay = '토'; break;
		}
	}	
}

public class MyDayTest {
	public static void main(String[] args) {
		System.out.printf("만두는 %c요일에 태어났어요.", MyDay.birthDay);
	}
}
