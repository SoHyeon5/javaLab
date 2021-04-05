package sec01.exam02_exitgame;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int i = 1;
		while (i <= 5) {
			System.out.println("입력 : ");
			int num = sc.nextInt();
			total = total + num;
			System.out.println("합" + total);
			if (total >= 100) {
				System.out.println("프로그램 종료!");
				break;
			}
			i++;
		}
	}

}
