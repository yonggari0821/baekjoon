package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B1157_F {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		str = sc.nextLine();
		char[] arr = str.toCharArray();
		
		int i = 0;
		while (i < arr.length)
		{
			if (arr[i] >= 'a' && arr[i] <= 'z')
				arr[i] -= ' ';
			i++;
		}
		
		Arrays.sort(arr);
		
		if (arr.length == 1)
		{
			System.out.println(arr[0]);
			return ;
		}
		
		i = 1;
		int[] usedAlpha = new int[26];
		while (i < arr.length)
		{
			if (arr[i-1] == arr[i])
			{
				usedAlpha[arr[i-1]-'A']++;
			}
			else
			{
				usedAlpha[arr[i-1]-'A']++;
				usedAlpha[arr[i]-'A']++;
			}
			i++;
		}
		usedAlpha[arr[0] - 'A']++;
		usedAlpha[arr[arr.length -1 ] - 'A']++;
		
		i = 0;
		int max = 0;		
		int maxCount = 0;
		int max_index = 0;
		while (i < 26)
		{
			usedAlpha[i]--;  // max 값을 정확하게 구하는 문제가 아니므로 이부분은 굳이 안빼줘도 되긴 함!
			if (max <= usedAlpha[i])
			{
				max = usedAlpha[i];
				max_index = i;
			}
			i++;
		}
		
		i = 0;
		while (i < 26)
		{
			if (max == usedAlpha[i])
				maxCount++;
			i++;
		}
		if (maxCount != 1)
			System.out.println("?");
		else {
			System.out.println((char)(max_index + 'A'));
		}
		sc.close();
	}
	
}
