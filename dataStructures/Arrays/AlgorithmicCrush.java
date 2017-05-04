package hackerhank.dataStructures.Arrays;

import java.util.Scanner;

public class AlgorithmicCrush {

	static long[] values = null;
	
	static void performOperation(int a, int b, int k) {
		values[a-1] += k;
		values[b] -= k;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        values = new long[n+1];
        int m = in.nextInt();
        for(int a0 = 0; a0 < m; a0++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            performOperation(a, b, k);
        }
        
        long maxValue = 0l;
        long tmp = 0l;
        for (int i = 0; i<values.length; i++) {
        	tmp += values[i];
        	maxValue = maxValue > tmp ? maxValue : tmp;
        }
        System.out.println(maxValue);
	}
}