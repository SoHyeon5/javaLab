package sec01.exam02_exitgame;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int i = 1;
		while (i <= 5) {
			System.out.println("�Է� : ");
			int num = sc.nextInt();
			total = total + num;
			System.out.println("��" + total);
			if (total >= 100) {
				System.out.println("���α׷� ����!");
				break;
			}
			i++;
		}
	}

}
