package hackerhank.algorithms.implementation;

import java.util.Scanner;

/**
 * 
 * @author Samuel Giannotti
 * 
 * https://www.hackerrank.com/challenges/magic-square-forming
 *
 */
public class MagicSquare {

	public static void calcCost(int[][] s) {
	    int[][][] allSquares = {
	    	        {{8,1,6},{3,5,7},{4,9,2}},
	    	        {{6,1,8},{7,5,3},{2,9,4}},
	    	        {{4,9,2},{3,5,7},{8,1,6}},
	    	        {{2,9,4},{7,5,3},{6,1,8}},
	    	        {{8,3,4},{1,5,9},{6,7,2}},
	    	        {{4,3,8},{9,5,1},{2,7,6}},
	    	        {{6,7,2},{1,5,9},{8,3,4}},
	    	        {{2,7,6},{9,5,1},{4,3,8}},
	    	    };
		
		
		int cost = Integer.MAX_VALUE;
		int tmpCost = 0;
		
		for (int i = 0; i < allSquares.length; i++) {
			for (int l = 0; l < allSquares[i].length; l++) {
				for (int k = 0; k < allSquares[i][l].length; k++) {
					int orig = allSquares[i][l][k];
					int val = s[l][k];
					if (orig != val) {
						tmpCost += java.lang.Math.abs(orig - val);
					}
				}
			}
			cost = java.lang.Math.min(cost, tmpCost);
			tmpCost = 0;
		}
		
		System.out.println(cost);
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        calcCost(s);
        //  Print the minimum cost of converting 's' into a magic square
    }

}