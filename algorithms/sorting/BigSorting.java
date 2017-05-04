package hackerhank.algorithms.sorting;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BigSorting {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        
    	Arrays.sort(unsorted, new java.util.Comparator<String>() {
    	    @Override
    	    public int compare(String x, String y) {
    	    	if (x.length() == y.length()) {
    	            int length = x.length();
    	            for (int i = 0; i < length; i++) {
    	                return x.compareTo(y);
    	            }
    	            return 0;
    	        } else if (x.length() > y.length()) { 
    	        	return 1;
    	        } else { 
    	        	return -1;
    	        }
    	    }
    	});
        
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            System.out.println(unsorted[unsorted_i]);
        }
	}

}
