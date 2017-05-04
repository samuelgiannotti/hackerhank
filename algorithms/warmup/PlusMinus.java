package hackerhank.algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

	static void plusMinus(int[] arr, int n) {
		int zeroCount = 0;
		int plusCount = 0;
		int minusCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				plusCount++;
			if (arr[i] < 0)
				minusCount++;
				
			if (arr[i] == 0)
				zeroCount++;
		}
		
		double plus = (double)plusCount/n;
		double minus = (double)minusCount/n;
		double zero = (double)zeroCount/n;
		
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(zero);
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr, n);
	}

}
