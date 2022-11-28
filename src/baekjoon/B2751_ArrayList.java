package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class B2751_ArrayList {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringBuilder sb = new StringBuilder();
		ArrayList<Integer> numArr = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		int i = 0;
		while (i < N)
		{
			numArr.add(Integer.parseInt(br.readLine()));
			i++;
		}
		
		Collections.sort(numArr);
		
		i = 0;
		while (i < N)
		{
			bw.write(numArr.get(i).toString() + '\n'); // 이 부분과 주석처리된 부분은 양립불가
			//sb.append(numArr.get(i).toString()).append('\n');
			i++;
		}
		//bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}

}
