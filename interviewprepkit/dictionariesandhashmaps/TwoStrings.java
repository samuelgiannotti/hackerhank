package hackerhank.interviewprepkit.dictionariesandhashmaps;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
    	String ret = "NO";

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
    		if (charCountS1[i] > 0 && charCountS2[i] > 0) {
    			ret = "YES";
    			break;
    		}
    	}
    	
    	return ret;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

}