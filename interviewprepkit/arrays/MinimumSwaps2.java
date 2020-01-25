package hackerhank.interviewprepkit.arrays;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * 
 * @author Samuel
 *
 *	https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 *
 *	https://www.youtube.com/watch?v=J9ikRMK8Yhs
 */
public class MinimumSwaps2 {

	/*
	 * Algorithm Concept:
	 * 1. Look at each index and compare the index position with its element value if its same then move to the next index position.
	 * 2. If index position is not the same as element value then treat element value as index value for finding the next element.
	 * 3. If we come back to the visited element then there exist a cycle, then count the size of that cycle, the number of swaps for 
	 *    particular cycle would be size-1, do this for all the cycles and add them together.
	 */
	
	// Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	int minSwaps = 0;
    	boolean isVisited[] = new boolean[arr.length+1];
    	java.util.HashMap<Integer, Integer> numPos = new java.util.HashMap<Integer, Integer>();
    	
    	for (int i = 1; i < isVisited.length; i++) {
    		isVisited[i] = false;
    		numPos.put(i, arr[i-1]);
    	}
    	
    	java.util.Iterator<Integer> it = numPos.keySet().iterator();
    	
    	while (it.hasNext()) {
    		Integer key = it.next();
    		Integer value = numPos.get(key);
    		if (isVisited[key.intValue()] == false) {
    			isVisited[key.intValue()] = true;
	    		if (key.equals(value)) {
	    			continue;
	    		} else {
	    			Integer nextKey = numPos.get(key);
	    			
	    			while (!isVisited[nextKey]) {
	    				isVisited[nextKey] = true;
	    				nextKey = numPos.get(nextKey);
	    				minSwaps++;
	    			}
	    		}
    		}
    	}
    	
    	return minSwaps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}