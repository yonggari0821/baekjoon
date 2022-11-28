package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B9020 {

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
		ArrayList<Integer> numArr = new ArrayList<>();
		
		int i = Integer.parseInt(br.readLine());
		while (i > 0)
		{
			int j = Integer.parseInt(br.readLine());
			if (j < 4 || j > 10000 || j % 2 != 0)
			{
				System.out.println("Error!\nplease input even numbers within 4 and 10000\nfor Goldbach's conjecture!");
				return ;
			}
			else {
				numArr.add(j);
			}
			i--;
		}
		
		int evenIndex = 0;
		
		while (evenIndex < numArr.size())
		{
			int gap = 0;
			while (IsPrime(numArr.get(evenIndex) / 2 - gap) == 0 || IsPrime(numArr.get(evenIndex) / 2 + gap) == 0)
				gap++;
			System.out.printf("%d %d\n", numArr.get(evenIndex) / 2 - gap, numArr.get(evenIndex) / 2 + gap);
			evenIndex++;
		}
		br.close();
	}

}
