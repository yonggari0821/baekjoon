package baekjoon;

import java.util.Scanner;

public class B5597 {
	
	static int IsIn(int num, int[] nar) 
	{
		int i = 0;
		while (i < nar.length)
		{
			if (num == nar[i])
				return (1);
			i++;
		}
		return (0);
	}
	
	public static void main(String[] args) {
		int i = 0;
		int[] arr;
		arr = new int[30];
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (i < 28)
		{
			arr[i] = scanner.nextInt();
			i++;
		}
		
		i = 1;
		while (i <= 30)
		{
			if (IsIn(i, arr) == 0 && count < 1)
			{
				System.out.printf("%d ", i);
				count++;
			}
			else if (IsIn(i, arr) == 0)
			{
				System.out.printf("%d", i);
			}
			i++;
		}
		return ;
	}
}

