package sec07.exam02_method;

public class StringToLowerrUpperCaseExample {

	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2)); // false (�ּҰ��ƴ� ������ ��)
		System.out.println(str1.equalsIgnoreCase(str2)); // true (��ҹ��� �� ���ϴ� equalsIgnoreCase)
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); // true
		
		
		
	}

}
