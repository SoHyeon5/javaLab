package sec01.exam03_signpring;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		String result = (num > 0) ? "양수" : ((num < 0 ? "음수" : "0"));
		System.out.println(num + "은 " + result + "입니다.");

	}

}
