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

// �������(Counting Sort)�� �ð� ���⵵�� O(N)!! (�ſ� ����!!)
// 'ũ��'�� �������� ������ ���⸸ �ϸ� �Ǳ� ������ ��ġ�� �ٲ� �ʿ� X