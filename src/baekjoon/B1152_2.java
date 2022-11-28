package baekjoon;

import java.util.Scanner;

public class B1152_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
        String[] strarr = str.split(" ");
        int i = 0;
        int count = 0;
        while (i < strarr.length)
        {
            if ( strarr[i] == "" )
                count++;
            i++;
        }
        System.out.println("count = " + count);
        System.out.println(strarr.length - count);
		sc.close();
	}
}
