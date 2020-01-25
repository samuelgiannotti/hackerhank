package hackerhank.interviewprepkit.warmupchallenges;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * 
 * @author Samuel
 *
 *https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 *
 */
public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	int len = s.length();
    	long rest = n % len;
    	long div = n / len;
    	int aCount = 0;
    	
    	int pos = 0;
    	int fromIndex = 0;
    	
    	while (pos >= 0) {    		
    		pos = s.indexOf('a', fromIndex);
    		if (pos >= 0) {
    			fromIndex = pos+1;
    			aCount++;
    		}
    	}
    	
    	long ret = div*aCount;
    	
    	aCount = 0;
    	pos = 0;
    	fromIndex = 0;
    	s = s.substring(0, (int)rest);
    	while (pos >= 0) {    		
    		pos = s.indexOf('a', fromIndex);
    		if (pos >= 0) {
    			fromIndex = pos+1;
    			aCount++;
    		}
    	}
    	
    	ret = ret+aCount;
    	return ret;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
