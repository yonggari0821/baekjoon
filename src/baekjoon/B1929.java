package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929 {

	public static int IsPrime (int n)
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
		String str = new String(br.readLine());
		StringTokenizer strT = new StringTokenizer(str);
		int M = Integer.parseInt(strT.nextToken());
		int N = Integer.parseInt(strT.nextToken());
		
		while (M <= N)
		{
			if (IsPrime(M) == 1)
				System.out.println(M);
			M++;
		}
		br.close();
	}

}
