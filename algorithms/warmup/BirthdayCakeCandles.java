package hackerhank.algorithms.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

	static void blowCandles(int[] arr) {
		int highCandle = 0;
		int countCandles = 0;
		for (int i = 0; i < arr.length; i++) {
			if (highCandle < arr[i]) {
				highCandle = arr[i];
				countCandles = 1;
			} else if (highCandle == arr[i]) {
				countCandles++;
			}
		}
		System.out.println(countCandles);
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        blowCandles(height);
	}

}
