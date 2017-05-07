package hackerhank.algorithms.dynamicProgramming;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author Samuel
 *
 *	https://www.hackerrank.com/challenges/fibonacci-modified
 *
 */
public class FibonacciModified {

	public static void calc(int t1, int t2, int n) {
		BigInteger[] arr = new BigInteger[n];
		arr[0] = BigInteger.valueOf(t1);
		arr[1] = BigInteger.valueOf(t2);
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i-2].add((arr[i-1].multiply(arr[i-1])));
		}
		System.out.println(arr[n-1]);
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int n = in.nextInt();
        calc(t1, t2, n);
	}

}
