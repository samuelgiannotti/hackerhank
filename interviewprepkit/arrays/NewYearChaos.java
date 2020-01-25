package hackerhank.interviewprepkit.arrays;

import java.util.Scanner;

/**
 * 
 * @author Samuel
 *
 *	https://www.hackerrank.com/challenges/new-year-chaos
 *
 */
public class NewYearChaos {

	 // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	int swapCount = 0;
    	for (int i = q.length-1; i >= 0 ; i--) {
    		if (q[i] > i+2) {
    			System.out.println("Too chaotic");
    			return;
    		} else {
    			for (int j = q[i]-2 > 0 ? q[i]-2 : 0; j < i; j++) {
    				if (q[i] < q[j])
    					swapCount ++; 
    			}
    		}
    	}
    	System.out.println(swapCount);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }

}