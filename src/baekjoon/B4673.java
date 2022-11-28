package baekjoon;

public class B4673 {

	static int Make (int num){
		int res;
		int first_num = num;
		int digit_total = 0;
		
		while (num >= 10)
		{
			digit_total += num % 10;
			num = num / 10;
		}
		digit_total += num % 10;
		
		res = first_num + digit_total;
		return res;
	}
	
	static int IsIn (int num, int[] arr) {
		int i = 0;
		while (i < arr.length)
		{
			if (num == arr[i])
				return (1);
			i++;
		}
		return (0);
	}
	
	public static void main(String[] args) {

		int[] arr;
		arr = new int[10000];
		
		int num = 1;
		
		while (num <= 10000)
		{
			arr[num-1] = Make(num);
			num++;
		}
		
		int start = 1;
		while (start <= 10000)
		{
			if (IsIn(start, arr) == 0)
				System.out.println(start);
			start++;
		}
	}

}
