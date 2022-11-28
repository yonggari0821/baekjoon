package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2751_B {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		boolean[] arr = new boolean[2000001];
		int N = Integer.parseInt(br.readLine());
		
		int i = 0;
		while (i < N)
		{
			arr[Integer.parseInt(br.readLine()) + 1000000] = true; // 입력값을 인덱스로 이용해서 true 표시
			i++;
		}
		
		i = 0;
		while (i < arr.length)
		{
			if (arr[i]) // true로 표시된 인덱스 i 를 찾아서
			{
				sb.append(i - 1000000).append('\n');
			}
			i++;
		}
		
		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}

}
