package sec12.exam01_wrapper;

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		
		// 문자열을 기본형으로 바꿈
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("vaule1 : " + value1);
		System.out.println("vaule2 : " + value2);
		System.out.println("vaule3 : " + value3);

	}

}
