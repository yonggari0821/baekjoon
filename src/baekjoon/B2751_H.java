package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2751_H {

	static void heapify (int[] numArr, int len, int i)
	{
		int parent = i;
		int leftChild = 2 * i + 1; // [lc]
		int rightChild = 2 * i + 2; // [rc]
		// 이 3가지 다 배열의 수가 아니라 인덱스 개념!! 즉 힙 내에서의 위치의 개념!!
		
		if (leftChild < len && numArr[parent] < numArr[leftChild])
			parent = leftChild;
		if (rightChild < len && numArr[parent] < numArr[rightChild])
			parent = rightChild;
		// 이 둘을 if와 elseif로 묶지 않았기 때문에 결국 lc와 rc중 큰 것이 부모 노드의 인덱스가 됨! 
		
		if (i != parent) // 처음의 부모인덱스가 바꼈다면 (부모보다 자식 노드의 값이 컸다면)
		{
			swap(numArr, parent, i); // 부모와 자식 노드의 인덱스를 참조해서 값을 서로 바꾸고
			heapify(numArr, len, parent); // 자기 서브 노드까지 한 번 더 힙화(여기서의 parent는 바낀 부분이라 자식 노드)
		}
	}
	
	static void swap (int[] numArr, int a, int b)
	{
		int tmp = numArr[a];
		numArr[a] = numArr[b];
		numArr[b] = tmp;
	}
	
	static void heapSort(int[] numArr)
	{
		int n = numArr.length;
		
		int i = (n / 2) - 1; // 자식을 가지는 첫 번째 부모 노드의 위치부터 힙화 시작할 것!
		while (i >= 0)
		{
			heapify(numArr, n, i); 
			i--;
		}
		
		i = n - 1;
		while (i > 0)
		{
			swap(numArr, 0, i); // 가장 큰 수 (0번째 인덱스에 위치한 수)를 가장 마지막 인덱스에 위치한 수와 바꾸고
			heapify(numArr, i, 0); // 그 마지막 인덱스를 길이로 해서 맨 위부터 다시 힙화!
			i--; // 즉 가장 큰 수를 배열의 뒤로 하나씩 쌓아가는 과정!!
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] numArr = new int[N];
		int i = 0;
		while (i < N)
		{
			numArr[i] = Integer.parseInt(br.readLine());
			i++;
		}
		
		heapSort(numArr);
		
		i = 0;
		while (i < N)
		{
			bw.write(numArr[i] + "\n");
			i++;
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
