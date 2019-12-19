package hackerhank.algorithms.strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Samuel
 * 
 * https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 *
 */
public class MakingAnagrams {

	   private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String a = scanner.nextLine();

	        String b = scanner.nextLine();

	        int res = makeAnagram(a, b);

	        bufferedWriter.write(String.valueOf(res));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }	
	
	static int makeAnagram(String a, String b) {
		int minDeletions = 0;
		int[] countStrA = new int[123];
		int[] countStrB = new int[123];
		Arrays.fill(countStrA, 0);
		Arrays.fill(countStrB, 0);
		char[] strA = a.toCharArray();
		char[] strB = b.toCharArray();
		
		int maxLenght = strA.length >= strB.length ? strA.length : strB.length;
		
		for (int i = 0; i < maxLenght; i++) {
			if (i < strA.length)
				countStrA[strA[i]]++;
			if (i < strB.length)
				countStrB[strB[i]]++;	
		}
		
		for (int i = 0; i < countStrA.length; i++) {
			if (countStrA[i] != countStrB[i]) {
				if (countStrA[i] > countStrB[i]) {
					minDeletions = minDeletions + (countStrA[i]-countStrB[i]);
				} else {
					minDeletions = minDeletions + (countStrB[i]-countStrA[i]);
				}
			}
		}
		
		return minDeletions;
	}
	
}
