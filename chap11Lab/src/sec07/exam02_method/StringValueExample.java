package sec07.exam02_method;

public class StringValueExample {

	public static void main(String[] args) {
		
		// 기본형이 문자열로 변한다. (타입변환)
		String str1 = String.valueOf(10); // 10 -> "10", 참조형 <- 기본형
		String str2 = String.valueOf(10.5); // 10.5 -> "10.5"
		String str3= String.valueOf(true); // true -> "true"
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);	

	}

}
