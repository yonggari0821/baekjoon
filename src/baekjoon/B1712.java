package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toString();  // toString()생략가능!!
		
		/*
		// 1. 입력 값을 String 클래스로 바꿔준 후 split을 이용해서 공백을 delimeter로 나눠서 배정하는 방법 
		
		String[] arr = str.split(" ");
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		int C = Integer.parseInt(arr[2]);
		*/
		
		// 2. StringTokenizer를 이용해서 공백을 기준으로 분리된 값들은 nextToken으로 배정하는 방법
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
