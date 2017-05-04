package hackerhank.algorithms.strings;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();

		int count = 0;
		char[] arr = s.toCharArray();
		if (arr.length > 0)
			count++;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 97)
				count++;
		}

		System.out.println(count);
	}

}
