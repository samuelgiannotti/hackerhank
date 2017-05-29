package hackerhank.algorithms.implementation;

import java.util.Scanner;

/**
 * 
 * @author Samuel Giannotti
 *
 * https://www.hackerrank.com/challenges/drawing-book
 *
 */
public class DrawingBook {

    static int solve(int n, int p){
    	int middle = n/2;
    	int turns = 0;
    	int actualMin = 0;
    	int actualMax = 0;
    	if (p > middle) {
    		if (n%2 == 0) {
    			actualMin = n;
    		} else {
    			actualMin = n-1;
    		}
    		
    		while (true) {
	    		if (actualMin <= p)
	    			return turns;
	    		turns++;
	    		actualMin = actualMin-2;
    		}
    	} else {
   			actualMax = 1;
    		
    		while (true) {
	    		if (actualMax >= p)
	    			return turns;
	    		turns++;
	    		actualMax = actualMax+2;
    		}    		
    	}

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }

}