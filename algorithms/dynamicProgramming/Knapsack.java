package hackerhank.algorithms.dynamicProgramming;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * 
 * @author Samuel
 *
 *	https://www.hackerrank.com/challenges/unbounded-knapsack/problem
 *
 */

public class Knapsack {

    // Complete the unboundedKnapsack function below.
    static int unboundedKnapsack(int k, int[] arr) {
    	int[] dp = new int[k+1];
    	
    	for (int i = 0; i < k+1; i++) {
    		for (int x = 0; x < arr.length; x++) {
    			if (arr[x] <= i) {
    				dp[i] = max(dp[i], dp[i-arr[x]]+arr[x]); 
    			}
    		}
    	}
    	
    	return dp[k];
    }

    private static int max(int i, int k) {
    	return i > k ? i : k;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = scanner.nextInt();
        int[] result = new int[t];
        
        for (int x = 0; x < t; x++) {
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	
	        String[] nk = scanner.nextLine().split(" ");
	
	        int n = Integer.parseInt(nk[0]);
	
	        int k = Integer.parseInt(nk[1]);
	
	        int[] arr = new int[n];
	
	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	
	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }
	
	        result[x] = unboundedKnapsack(k, arr);
	
        }

        for (int x = 0; x < t; x++) {
	        bufferedWriter.write(String.valueOf(result[x]));
	        bufferedWriter.newLine();
        }

        
        bufferedWriter.close();

        scanner.close();
    }

}
