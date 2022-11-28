package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2750_B {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] numArr = new int[num];
		
		int index = 0;
		while (index < num)
		{
			numArr[index] = Integer.parseInt(br.readLine());
			index++;
		}
		
		int end = num - 1;
		while (end > 0)
		{
			int i = 0;
			while (i < end)
			{
				if (numArr[i] > numArr[i + 1])
				{
					int tmp = numArr[i];
					numArr[i] = numArr[i+1];
					numArr[i+1] = tmp;
				}
				i++;;
			}
			end--;
		}

		index = 0;
		while (index < num)
		{
			System.out.println(numArr[index]);
			index++;
		}
        br.close();
	}
}