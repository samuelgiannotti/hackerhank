package hackerhank.algorithms.warmup;

import java.util.Scanner;

public class CompareTheTriplets {

	static String compare(int a0, int a1, int a2, int b0, int b1, int b2) {
		int resA = 0;
		int resB = 0;
		
		if (a0 > b0) 
			resA++;
		if (a1 > b1)
			resA++;
		if (a2 > b2)
			resA++;
		
		if (b0 > a0) 
			resB++;
		if (b1 > a1)
			resB++;
		if (b2 > a2)
			resB++;		
		
		return new String(resA + " "+ resB);
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        System.out.println(compare(a0, a1, a2, b0, b1, b2));
    }
	
}
