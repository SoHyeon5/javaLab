package sec01.exam03_signpring;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		String result = (num > 0) ? "���" : ((num < 0 ? "����" : "0"));
		System.out.println(num + "�� " + result + "�Դϴ�.");

	}

}
