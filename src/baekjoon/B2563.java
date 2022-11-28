package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2563 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pNum = Integer.parseInt(br.readLine());
		
		boolean[][] square = new boolean[100][100];
		while (0 < pNum)
		{
			StringTokenizer str = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(str.nextToken());
			int y = Integer.parseInt(str.nextToken());
			int to9_1 = 0;
			while (to9_1 < 10)
			{
				int to9_2 = 0;
				while (to9_2 < 10)
				{
					square[x+to9_1][y+to9_2] = true;
					to9_2++;
				}
				to9_1++;
			}
			pNum--;
		}
		
		int covered = 0;
		int to99_1 = 0;
		while (to99_1 < 100)
		{
			int to99_2 = 0;
			while (to99_2 < 100)
			{
				if (square[to99_1][to99_2])
					covered++;
				to99_2++;
			}
			to99_1++;
		}
		System.out.println(covered);
        br.close();
	}
}