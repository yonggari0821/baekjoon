package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2587 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numArr = new int[5];
		int total = 0;
		
		int i = 0;
		while (i < 5)
		{
			numArr[i] = Integer.parseInt(br.readLine());
			i++;
		}
		
		int end = 4;
		while (end > 0)
		{
			i = 0;
			while (i < end)
			{
				if (numArr[i] > numArr[i + 1])
				{
					int tmp = numArr[i];
					numArr[i] = numArr[i + 1];
					numArr[i + 1] = tmp;
				}
				i++;
			}
			end--;
		}
		
		i = 0;
		while (i < 5)
		{
			total += numArr[i];
			i++;
		}
		
		System.out.println(total / 5);
		System.out.println(numArr[2]);
        br.close();
	}
}
