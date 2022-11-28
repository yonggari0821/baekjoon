package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2108 {

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
		
		int total = 0;
		int N = Integer.parseInt(br.readLine());
		int[] NumArr = new int[N];
		sorted = new int[N];
		int[] Appeared = new int[8001]; 
		
		int i = 0;
		int max = - 4000;
		int min = 4000;
		while (i < N)
		{
			NumArr[i] = Integer.parseInt(br.readLine());
			total += NumArr[i];
			Appeared[NumArr[i] + 4000]++;
			if (NumArr[i] >= max)
				max = NumArr[i];
			if (NumArr[i] <= min)
				min = NumArr[i];
			i++;
		}
		
		int a = 0;
		int amax = 0;
		while (a < 8001)
		{
			if (Appeared[a] > amax)
				amax = Appeared[a];
			a++;
		}
		
		a = 0;
		boolean flag = false;
		int MostAppeared = 0;
		while (a < 8001)
		{
			if (Appeared[a] == amax && flag == false)
			{
				MostAppeared = a - 4000;
				flag = true;
			}
			else if (Appeared[a] == amax && flag == true)
			{
				MostAppeared = a - 4000;
				break;
			}
			a++;
		}
		
		divide(NumArr, 0, N-1);
		
		if (N == 0)
		{
			int j = 0;
			while (j < 4)
			{
				bw.write(0 + "\n");
				j++;
			}
		}
		else 
		{
			bw.write(Math.round((float)total / N) + "\n"); // Math.round 함수는 소수점 첫 번째 자리에서 반올림해서 리턴
			bw.write(NumArr[N/2] + "\n");
			bw.write(MostAppeared + "\n");
			bw.write(max - min + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}