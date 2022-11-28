package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2751_M {
	
	private static int[] sorted;

	public static void divide (int[] numArr, int first, int last)
	{
		if (first < last)
		{
			int mid = first + ((last - first) / 2);
			divide(numArr, first, mid);
			divide(numArr, mid + 1, last);
			merge(numArr, first, mid, last);
		}
	}
	
	public static void merge(int[] numArr, int first, int mid, int last)
	{
		int a = first, b = mid + 1, c = first;
		while (a <= mid && b <= last)
		{
			if (numArr[a] <= numArr[b])
			{
				sorted[c] = numArr[a];
				a++;
			}
			else
			{
				sorted[c] = numArr[b];
				b++;
			}
			c++;
		}
		
		if (a > mid)
		{
			while (b <= last)
			{	
				sorted[c] = numArr[b];
				b++;
				c++;
			}
		}
		else {
			while (a <= mid)
			{
				sorted[c] = numArr[a];
				a++;
				c++;
			}
		}
		
		int i = first;
		while (i <= last)
		{
			numArr[i] = sorted[i];
			i++;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		int[] numArr = new int[num];
		sorted = new int[num];

		int i = 0;
		while (i < num)
		{
			numArr[i] = Integer.parseInt(br.readLine());
			i++;
		}
		
		divide(numArr, 0, num-1);
			
		i = 0;
		while (i < num)
		{
			bw.write(numArr[i] + "\n");
			i++;
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
