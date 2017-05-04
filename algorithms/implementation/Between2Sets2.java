package hackerhank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class Between2Sets2 {

	public static void between(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		int first = a[a.length-1];
		int last = b[0];
		int count = 0;

		for (int i = first; i <= last; i++) {
			boolean fac1 = true, fac2 = true;
			for (int k=0; k<a.length; k++) {
				if (i%a[k] != 0) { //is not factor
					fac1 = false;
					break;
				}
			}
			if (fac1) {
				for (int k=0; k<b.length; k++) {
					if (b[k]%i != 0) { //is not factor
						fac2 = false;
						break;
					}
				}
			}
			if (fac1 && fac2)
				count++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        between(a, b);
	}
}
