package sec01.exam01_sumavg;

public class SumAvg {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 �հ� : " + sum);
		System.out.println("��� : " + (avg = sum/100.0));
		
	}

}
