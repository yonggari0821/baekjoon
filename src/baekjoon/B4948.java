package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4948 {

	static int IsPrime (int n)
	{
		if (n < 2)
			return 0;
		else if (n < 4)
			return 1;
		int i = 2;
		while ((n / i) >= i)
		{
			if (n % i == 0)
				return 0;
			i++;
		}
		return 1;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		
		int[] numArr;
		int index = 0;
		
		while (true)
		{
			int i = Integer.parseInt(br.readLine());
			if (i == 0)
				break;
			else 
			{
				numArr[index] = i;
				index++;
			}
		}
		
		index = 0;
		
		while (numArr[index] != 0)
		{
			int j = 1;
			int count = 0;
			while (numArr[index] + j <= 2*numArr[index])
			{
				if (IsPrime(numArr[index] + j) == 1)
					count++;
				j++;
			}
				System.out.println(count);
		}
		br.close();
				
		*/
		
		while (true)
		{
			int i = Integer.parseInt(br.readLine());
			if (i == 0)
				break;
			else 
			{
				int j = 1;
				int count = 0;
				while (i + j <= 2*i)
				{
					if (IsPrime(i + j) == 1)
						count++;
					j++;
				}
				System.out.println(count);
			}
		}
		br.close();
	}
}
