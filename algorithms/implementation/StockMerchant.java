package hackerhank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Samuel
 *
 *	https://www.hackerrank.com/challenges/sock-merchant
 *
 */
public class StockMerchant {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        Arrays.sort(c);
        int count = 0;
        for(int i=0; i < n; i++){
        	if (i+1 < n) {
        		if (c[i] == c[i+1]) {
        			count++;
        			i++;
        		}
        	}
        }
        System.out.println(count);
	}

}
