package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] NumArr = new int[N];
		
		int i = 0;
		int max = 0;
		while (i < N)
		{
			NumArr[i] = Integer.parseInt(br.readLine());
			if (max < NumArr[i])
				max = NumArr[i];
			i++;
		}
		
		i = 0;
		int[] CountArr = new int [max];
		while (i < N)
		{
			CountArr[NumArr[i] - 1]++;
			i++;
		}
		
		i = 0;
		while (i < max)
		{
			while (CountArr[i] > 0)
			{
				bw.write((i+1) + "\n");
				CountArr[i]--;
			}
			i++;
		}
		br.close();
		bw.flush();
		bw.close();
	}

}

// 계수정렬(Counting Sort)의 시간 복잡도는 O(N)!! (매우 빠름!!)
// '크기'를 기준으로 개수를 세기만 하면 되기 때문에 위치를 바꿀 필요 X