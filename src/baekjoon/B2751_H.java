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
		// �� 3���� �� �迭�� ���� �ƴ϶� �ε��� ����!! �� �� �������� ��ġ�� ����!!
		
		if (leftChild < len && numArr[parent] < numArr[leftChild])
			parent = leftChild;
		if (rightChild < len && numArr[parent] < numArr[rightChild])
			parent = rightChild;
		// �� ���� if�� elseif�� ���� �ʾұ� ������ �ᱹ lc�� rc�� ū ���� �θ� ����� �ε����� ��! 
		
		if (i != parent) // ó���� �θ��ε����� �ٲ��ٸ� (�θ𺸴� �ڽ� ����� ���� �Ǵٸ�)
		{
			swap(numArr, parent, i); // �θ�� �ڽ� ����� �ε����� �����ؼ� ���� ���� �ٲٰ�
			heapify(numArr, len, parent); // �ڱ� ���� ������ �� �� �� ��ȭ(���⼭�� parent�� �ٳ� �κ��̶� �ڽ� ���)
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
		
		int i = (n / 2) - 1; // �ڽ��� ������ ù ��° �θ� ����� ��ġ���� ��ȭ ������ ��!
		while (i >= 0)
		{
			heapify(numArr, n, i); 
			i--;
		}
		
		i = n - 1;
		while (i > 0)
		{
			swap(numArr, 0, i); // ���� ū �� (0��° �ε����� ��ġ�� ��)�� ���� ������ �ε����� ��ġ�� ���� �ٲٰ�
			heapify(numArr, i, 0); // �� ������ �ε����� ���̷� �ؼ� �� ������ �ٽ� ��ȭ!
			i--; // �� ���� ū ���� �迭�� �ڷ� �ϳ��� �׾ư��� ����!!
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
