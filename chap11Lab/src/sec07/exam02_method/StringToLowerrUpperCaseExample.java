package sec07.exam02_method;

public class StringToLowerrUpperCaseExample {

	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2)); // false (주소가아닌 데이터 비교)
		System.out.println(str1.equalsIgnoreCase(str2)); // true (대소문자 비교 안하는 equalsIgnoreCase)
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); // true
		
		
		
	}

}
