package hackerhank.algorithms.warmup;

import java.util.Scanner;

public class StairCase {

	static void stairCase(int n) {
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n-i; s++)
				sb.append(" ");
			for (int h = 1; h <= i; h++)
				sb.append("#");
			sb.append("\r\n");
		}
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        stairCase(n);
	}

}
