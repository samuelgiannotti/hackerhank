package hackerhank.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MarcsCakewalk2 {

	public static long getPow(int x, int y) {
		long ret = 1;
		for (int i = 1; i <= y; i++) {
			ret *= x;
		}
		return ret;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        Arrays.sort(calories);
        long miles = 0;
        
        for(int i=n-1; i >= 0; i--){
        	miles = miles + (calories[i]*(getPow(2,(n-(i+1)))));
        }        
        
        System.out.println(miles);
	}

}
