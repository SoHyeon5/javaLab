package sec04.exam01_objects;

import java.util.Objects;

public class ToStingExample {

	public static void main(String[] args) {
		
		// again and again and again and again
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(str1.toString()); // "ȫ�浿"
		// System.out.println(str2.toString()); // NullPointerException ���� �߻�
		
		System.out.println(Objects.toString(str1)); // "ȫ�浿"
		System.out.println(Objects.toString(str1, "�̸��� �����ϴ�.")); // "ȫ�浿"
		System.out.println(Objects.toString(str2)); // ���� �߻�x -> "null" ���
		System.out.println(Objects.toString(str2, "�̸��� �����ϴ�.")); // null�̸� "�̸��� �����ϴ�." ���

	}

}
