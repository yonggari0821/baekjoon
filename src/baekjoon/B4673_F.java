package baekjoon;

public class B4673_F {
	
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
	
	static int MuchMake (int num, int max) {
		int count = 0;
		
		while (num < max)
		{
			num = Make(num);
			count++;
		}
		return count;
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
		int i = 0;
		int j = 1;
		int start = 1;
		int num = MuchMake(1, 10000);
		
		int[] arr;
		arr = new int[num];
		
		arr[0] = 1;
		while (++i < num)
		{
			arr[i] = Make(start);
			start = Make(start);
		}
		
		while (j <= 10000)
		{
			if (IsIn(j, arr) == 0)
				System.out.println(j);
			j++;
		}
	}
}
