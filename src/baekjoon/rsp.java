package baekjoon;

public class rsp {

	public static void main(String[] args) {
		String[] rsp_arr = {"가위", "바위", "보"};
		int tmp = (int)(Math.random()*3);
		
		System.out.println(rsp_arr[tmp]);
	}

}
