package baekjoon;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int input, answer;
		
		answer = (int)(Math.random()*101);
		System.out.println("answer="+answer);
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("0부터 100사이의 정수를 입력하세요.");
			input = scanner.nextInt();
			
			if (input > answer)
				System.out.println("정답이 더 작습니다. 다시 도전해보세요!!");
			else if (input < answer)
				System.out.println("정답이 더 큽니다. 다시 도전해보세요!!");
		}
		while (input!=answer);
		
	System.out.println("정답입니다!!");
	}
}
