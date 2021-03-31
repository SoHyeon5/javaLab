package sec14.exam02_calender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderExample {

	public static void main(String[] args) {
		
		// Calendar now = new Calendar(); // x (Calendar 클래스는 추상 클래스 이므로)
		Calendar now = Calendar.getInstance();
		Calendar now1 = new GregorianCalendar(); // 자동형 변환 GregorianCalendar(); : Calendar의 자식 클래스
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY : 
			strWeek = "월";
			break;
		case Calendar.TUESDAY : 
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY : 
			strWeek = "수";
			break;
		case Calendar.THURSDAY : 
			strWeek = "목";
			break;
		case Calendar.FRIDAY : 
			strWeek = "금";
			break;
		case Calendar.SATURDAY : 
			strWeek = "토";
			break;
		case Calendar.SUNDAY : 
			strWeek = "일";
			break;
		default : 
			strWeek = "일";
		}		
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");
		
	}

}
