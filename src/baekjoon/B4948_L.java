package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B4948_L {

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
		ArrayList<Integer> numArr = new ArrayList<Integer>();
		
		while (true)
		{
			int i = Integer.parseInt(br.readLine());
			if (i == 0)
				break;
			else
				numArr.add(i);
		}
		
		int index = 0;
		while ((index) < numArr.size())
		{
			int j = 1;
			int count = 0;
			while (numArr.get(index) + j <= 2 * numArr.get(index))
			{
				if (IsPrime(numArr.get(index) + j) == 1)
					count++;
				j++;
			}
			System.out.println(count);
			index++;
		}
		br.close();
	}
}