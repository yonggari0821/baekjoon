package baekjoon;

import java.util.Scanner;

public class B1065 {
	
	static int Hansu (int n)
	{
		int count = 0;
		int i = 0;
		
		while (++i <= n)
		{
			if (i == 1000)
				break;
			if (i <= 99)
				count++;
			else if ((i / 100 - i % 100 / 10) == (i % 100 / 10 - i % 10))
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Qnum = sc.nextInt();		
		System.out.println(Hansu(Qnum));
		sc.close();
	}
}
