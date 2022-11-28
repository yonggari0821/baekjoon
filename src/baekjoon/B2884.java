package baekjoon;

import java.util.Scanner;

public class B2884 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();
			
		if (H < 0 || H > 23 || M < 0 || M > 59) {
			System.out.println("Error! Wrong Time Input!!");
			scanner.close();
			return ;
		}
		
		if (H == 0 && M < 45)
			System.out.printf("%d %d", 23, M + 15);
		else if (M >= 45)
			System.out.printf("%d %d", H, M - 45);
		else
			System.out.printf("%d %d", H - 1, M + 15);
		scanner.close();
		return ;
	}
}
