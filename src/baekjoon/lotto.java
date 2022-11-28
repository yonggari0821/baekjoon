package baekjoon;

public class lotto {

	public static int is_in(int val, int[] num_arr, int index) {
		int j = 0;
		while (j < index)
		{
			if (num_arr[j] == val)
				return (1);
			j++;
		}
		return (0);
	}
	
	public static void main(String[] args) {
		int[] ball = new int[6];
		
		/* 초기화 확인
		for (int i = 0; i < ball.length; i++) {
			System.out.println(ball[i]);
		}
		*/

		int i = 0;
		
		while (i < 6)
		{
			ball[i] = (int)(Math.random()*45 + 1);
			if ( i > 0 && (is_in(ball[i], ball, i) == 1) )
			{
				do {
					ball[i] = (int)(Math.random()*45 + 1);
				} while (is_in(ball[i], ball, i) == 1);
			}	
			i++;
		}
		
		int step = i;
		i = 1;
		
		while (step > 0)
		{
			i = 1;
			while (i < step)
			{
				if (ball[i] < ball[i-1])
				{
					int tmp;
					
					tmp = ball[i-1];
					ball[i-1] = ball[i];
					ball[i] = tmp;
				}
				i++;
			}
			step--;
		}
		
		i = 0;
		System.out.println("제가 추천드리는 번호는\n");
		while (i < 5)
			System.out.print(ball[i++] + ", ");
		System.out.print(ball[5] + " 입니다.");		
	}
}
