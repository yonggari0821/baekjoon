package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2750_C {

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
		
		int i = 0;
		while (i < num - 1)
		{
			int j = i + 1;
			while (j < num)
			{
				if (numArr[i] > numArr[j])
				{
					int tmp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = tmp;
				}
				j++;;
			}
			i++;
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