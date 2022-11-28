package baekjoon;

import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		int[] AlphaIndex = new int[26];
		
		int i = 0;
		while (i < arr.length)
		{
			if (arr[i] >= 'a' && arr[i] <= 'z')
				AlphaIndex[arr[i] - 'a']++;
			else 
				AlphaIndex[arr[i] - 'A']++;
			i++;
		}
		
		int max = 0;
		int maxCount = 0;
		int maxIndex = 0;
		
		i = 0;
		while (i < 26)
		{
			if ( AlphaIndex[i] != 0 && max <= AlphaIndex[i])
			{
				max = AlphaIndex[i];
				maxIndex = i;
			}
			i++;
		}
		
		i = 0;
		while (i < 26)
		{
			if (max == AlphaIndex[i])
				maxCount++;
			i++;
		}
		
		if (maxCount != 1)
			System.out.println("?");
		else 
			System.out.println((char)(maxIndex + 'A'));
		sc.close();
	}

}
