package hackerhank.algorithms.strings;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * 
 * @author Samuel
 * 
 * https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */
public class SherlockAndAnagrams {

	   private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	    	 //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
	    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	    	

	         int q = scanner.nextInt();
	         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	         for (int qItr = 0; qItr < q; qItr++) {
	             String s = scanner.nextLine();

	             int result = sherlockAndAnagrams2(s);

	             bufferedWriter.write(String.valueOf(result));
	             bufferedWriter.newLine();
	         }

	         bufferedWriter.close();

	         scanner.close();
	    }
	    
	    // Complete the sherlockAndAnagrams function below.
	    static int sherlockAndAnagrams2(String s) {
	    	int count = 0;
	    	for (int t = s.length()-1; t >= 1; t--) { //block size
		    	for (int i = 1; i+t <= s.length(); i++) { //iterate front to back
		    		for (int z = s.length(); z > i+t-1; z--) { //iterate back to front
						String s1 = s.substring(i-1, i-1+t);
						String s2 = s.substring(z-t, z);
						if (isAnagram(s1, s2)) {
							count++;
						}
		    		}
		    	}
	    	}
	    	
	    	return count;
	    }	    
	    
	    static boolean isAnagram(String s1, String s2) {
	    	int[] charCountS1 = new int[127];
	    	int[] charCountS2 = new int[127];

	    	char[] charArrS1 = s1.toCharArray();
	    	char[] charArrS2 = s2.toCharArray();
	    	
	    	for (int i = 0; i < charArrS1.length; i++) {
	    		charCountS1[charArrS1[i]]++;
	    	}

	    	for (int i = 0; i < charArrS2.length; i++) {
	    		charCountS2[charArrS2[i]]++;
	    	}

	    	for (int i = 0; i < charCountS1.length; i++) {
	    		if (charCountS1[i] != charCountS2[i]) {
	    			return false;
	    		}
	    	}
	    	return true;
	    }
}
