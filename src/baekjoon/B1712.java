package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toString();  // toString()��������!!
		
		/*
		// 1. �Է� ���� String Ŭ������ �ٲ��� �� split�� �̿��ؼ� ������ delimeter�� ������ �����ϴ� ��� 
		
		String[] arr = str.split(" ");
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		int C = Integer.parseInt(arr[2]);
		*/
		
		// 2. StringTokenizer�� �̿��ؼ� ������ �������� �и��� ������ nextToken���� �����ϴ� ���
		StringTokenizer strT = new StringTokenizer(str);
		int A = Integer.parseInt(strT.nextToken());
		int B = Integer.parseInt(strT.nextToken());
		int C = Integer.parseInt(strT.nextToken());
		if (C > B)
			System.out.println(A / (C - B) + 1);
		else
			System.out.println(-1);
		
	}

}
