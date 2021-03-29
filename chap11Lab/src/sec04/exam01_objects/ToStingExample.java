package sec04.exam01_objects;

import java.util.Objects;

public class ToStingExample {

	public static void main(String[] args) {
		
		// again and again and again and again
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(str1.toString()); // "홍길동"
		// System.out.println(str2.toString()); // NullPointerException 예외 발생
		
		System.out.println(Objects.toString(str1)); // "홍길동"
		System.out.println(Objects.toString(str1, "이름이 없습니다.")); // "홍길동"
		System.out.println(Objects.toString(str2)); // 예외 발생x -> "null" 출력
		System.out.println(Objects.toString(str2, "이름이 없습니다.")); // null이면 "이름이 없습니다." 출력

	}

}
