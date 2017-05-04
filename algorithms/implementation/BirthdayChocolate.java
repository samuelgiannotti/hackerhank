package hackerhank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayChocolate {

    static int getWays(int[] squares, int d, int m){
        int count = 0;
        if (squares.length == m) {
        	if (Arrays.stream(squares).sum() == d)
        		count++;
        } else if (squares.length < m) {
        	return count;
        } else {
        	int initSum = 0;
        	for (int i = 0; i < m; i++) {
        		initSum += squares[i]; 
        	}
        	if (initSum == d)
        		count++;
        	for (int i = 0; i < squares.length-m; i++) {
        		initSum = initSum - squares[i] + squares[i+m];
            	if (initSum == d)
            		count++;
        	}
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }

}
