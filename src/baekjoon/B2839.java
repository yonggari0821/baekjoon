package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = -1;
		
		if (N < 3 || N > 5000)
			return ;		
		if (N == 4 || N == 7)
		{
			System.out.println(result);
			return ;
		}
		
		/*
		{0, 5}
		{3, 6, 9}
		{8}
		{1, 4, 7}
		{2}
		*/
		
		if ((N % 10) == 1 || (N % 10) == 4 || (N % 10) == 7)
			result = ((N - 10) / 10) * 2 + ((N % 10) / 3 + 3);
		else if ((N % 10) == 3 || (N % 10) == 6 || (N % 10) == 9)
			result = (N / 10) * 2 + (N % 10 / 3);
		else if ((N % 10) == 2)
			result = ((N - 12) / 10) * 2 + 4;
		else if ((N % 10) == 0 || (N % 10) == 5)
			result = (N / 5);
		else {
			result = (N / 10) * 2 + 2;
		}
				
		System.out.println(result);
		br.close();
	}

}
