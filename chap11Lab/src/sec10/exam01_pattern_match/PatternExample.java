package sec10.exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; // 정규식, \t = 탭키 (이것과 구분하기 위해 \를 하나 더 씀 그래서 \\d)
		String data = "010-123-4567"; // 검증 데이터
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("\t정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w +)?";
		// "angel@naver.co.kr" 허용
		data = "angel@naver.com";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("\t정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지않습니다.");
		}

	}

}
