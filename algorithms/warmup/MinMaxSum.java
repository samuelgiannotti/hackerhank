package hackerhank.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

	static void minMaxSum(long[] arr) {
		Arrays.sort(arr);
		long res1 = 0;
		long res2 = 0;
		for (int i = 0; i < arr.length -1 ; i++)
			res1 += arr[i];

		for (int i = 1; i < arr.length ; i++)
			res2 += arr[i];
		
		System.out.println(res1+" "+ res2);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long[] arr = new long[5];
        arr[0] = a;arr[1] = b;arr[2] = c;arr[3] = d;arr[4] = e;
        minMaxSum(arr);
	}

}
