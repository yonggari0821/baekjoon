package baekjoon;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int input, answer;
		
		answer = (int)(Math.random()*101);
		System.out.println("answer="+answer);
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("0���� 100������ ������ �Է��ϼ���.");
			input = scanner.nextInt();
			
			if (input > answer)
				System.out.println("������ �� �۽��ϴ�. �ٽ� �����غ�����!!");
			else if (input < answer)
				System.out.println("������ �� Ů�ϴ�. �ٽ� �����غ�����!!");
		}
		while (input!=answer);
		
	System.out.println("�����Դϴ�!!");
	}
}
