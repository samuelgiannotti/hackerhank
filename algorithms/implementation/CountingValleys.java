package hackerhank.algorithms.implementation;

import java.util.Scanner;

/**
 * 
 * @author Samuel Giannotti
 * 
 * https://www.hackerrank.com/challenges/counting-valleys
 *
 */
public class CountingValleys {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int result = 0;
		int level = 1;
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == 'U') {
				level++;
				if (level == 1) {
					result++;
				}
			} else {
				level--;
			}
		}

		System.out.println(result);
	}
}
