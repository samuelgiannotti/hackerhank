package hackerhank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Samuel
 * 
 * https://www.hackerrank.com/challenges/bon-appetit
 */
public class BonAppetit {

	public static void calcBill(int notEat, int[] arr, int charged) {
		int totalBill = Arrays.stream(arr).sum(); //java8 array sum
		int diff = (totalBill - arr[notEat])/2;
		if (diff == charged) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(charged-diff);
		}
	}
	
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int b = in.nextInt();
        calcBill(k, s, b);
	}

}
