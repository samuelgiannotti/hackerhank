package hackerhank.algorithms.implementation;

import java.io.*;
import java.util.*;

/**
 * 
 * @author Samuel
 *
 *	https://www.hackerrank.com/challenges/cavity-map/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 *
 */
public class CavityMap {

    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {
    	String[] ret = new String[grid.length];
    	
    	for (int i = 0; i < grid.length; i++) {
    		if (i == 0 || i == grid.length-1) { //first or last row
    			ret[i] = grid[i];
    		} else {
    			char[] beforeRow = grid[i-1].toCharArray();
    			char[] actualRow = grid[i].toCharArray();
    			char[] nextRow = grid[i+1].toCharArray();
    			for (int j = 0; j < actualRow.length; j++) {
    				if (j > 0 && j < actualRow.length -1) {
    					int upper = Character.getNumericValue(beforeRow[j]);
    					int lower = Character.getNumericValue(nextRow[j]);
    					int left = Character.getNumericValue(actualRow[j-1]);
    					int right = Character.getNumericValue(actualRow[j+1]);
    					int actual = Character.getNumericValue(actualRow[j]);
    					if (actual > upper && actual > lower && actual > left && actual > right) {
    						actualRow[j] = 'X';
    					}
    					
    				}
    				if (ret[i] == null)
    					ret[i] = actualRow[j]+"";
    				else
    					ret[i] = ret[i]+actualRow[j];
    			}
    		}    		
    	}
    	
    	return ret;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }

}
