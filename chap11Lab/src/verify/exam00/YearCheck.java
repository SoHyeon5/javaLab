package verify.exam00;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		
		/*
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "은 윤년");
		} else {
			System.out.println(year + "은 평년");
		}
		*/
		
		// 작성 위치 : GregorianCalendar의 메소드를 이용하여 윤년인지를 파악한다.
		GregorianCalendar y = new GregorianCalendar();

		if (y.isLeapYear(year)) {
			System.out.println(year + "은 윤년입니다");
		} else {
			System.out.println(year + "은 평년입니다");
		}
		
	}
}
