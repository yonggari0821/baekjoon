package baekjoon;

import java.util.*;

public class B1152 {
	
	static int IsAlphabet (char c)
	{
		if (c >= 'a' && c <= 'z')
			return 1;
		if (c >= 'A' && c <= 'Z')
			return 1;
		return 0;
	}

	static int NumOfWords(char[] str)
	{
		int count = 0;
		int i = 0;
		
		if (str == null)
			return 0;
		while (i < str.length)
		{
			if (str[i] == 32)
				count++;
			i++;
		}
		
		if (str[0] == 32 && str[str.length-1] == 32)
			count = count - 1;
		else if (str[0] != 32 && str[str.length-1] != 32)
			count = count + 1;
		
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(NumOfWords(str.toCharArray()));
		sc.close();
	}

}
