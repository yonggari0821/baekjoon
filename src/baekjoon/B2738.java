package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2738 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringTokenizer getNum = new StringTokenizer(str);
		int N = Integer.parseInt(getNum.nextToken());
		int M = Integer.parseInt(getNum.nextToken());
		
		int[][] arr1 = new int[N][M];
		int[][] arr2 = new int[N][M];
		
		// 첫 번째 행렬
		int n = 0;
		while (n < N)
		{
			String grid = br.readLine();
			StringTokenizer gridMake = new StringTokenizer(grid);
			int m = 0;
			while (m < M)
			{
				arr1[n][m] = Integer.parseInt(gridMake.nextToken());
				m++;
			}
			n++;
		}
		
		// 두 번째 행렬 
		n = 0;
		while (n < N)
		{
			String grid = br.readLine();
			StringTokenizer gridMake = new StringTokenizer(grid);
			int m = 0;
			while (m < M)
			{
				arr2[n][m] = Integer.parseInt(gridMake.nextToken());
				m++;
			}
			n++;
		}
		
		int[][] resultArr = new int[N][M];
		n = 0;
		while (n < N)
		{
			int m = 0;
			while (m < M)
			{
				resultArr[n][m] = arr1[n][m] + arr2[n][m];
				System.out.printf("%d", resultArr[n][m]);
				if (m + 1 == M)
					System.out.println("");
				else {
					System.out.printf(" ");
				}
				m++;
			}
			n++;
		}
		
		
	}

}
