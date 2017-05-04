package hackerhank.algorithms.implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void findPairs(int[] arr, int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int l = i+1; l < arr.length; l++) {
				if ((arr[i]+arr[l])%k == 0) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        findPairs(a, k);
	}

}
