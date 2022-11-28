package baekjoon;

import java.util.Scanner;

public class B3003 {

	public static void main(String[] args) {
		Scanner NP = new Scanner(System.in);
		
		int king = NP.nextInt();
		int queen = NP.nextInt();
		int rook = NP.nextInt();
		int bishop = NP.nextInt();
		int knight = NP.nextInt();
		int pawn = NP.nextInt();
		
		System.out.printf("%d %d %d %d %d %d", 1 - king, 1 - queen, 2 - rook, 2 - bishop, 2 - knight, 8 - pawn);
		
		NP.close();
	}

}
