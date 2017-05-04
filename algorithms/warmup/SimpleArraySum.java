package hackerhank.algorithms.warmup;

import java.util.Scanner;

public class SimpleArraySum {

	static int sumArray(int[] arr) {
		int ret = 0;
		for (int i = 0; i < arr.length; i++)
			ret += arr[i];
		return ret;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int sum = sumArray(arr);
        System.out.println(sum);
	}

}