package hackerhank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class Between2Sets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		int count=0;
		Arrays.sort(a);
		int one = a[n-1];
		int[] b = new int[m];
		for(int b_i=0; b_i < m; b_i++){
			b[b_i] = in.nextInt();
		}
		Arrays.sort(b);
		int two= b[0];
		for (int i=one;i<=two;i++){
			int c=0;
			int l=0;
			if (two%one==0) {
				for (int k=0;k<m;k++) {
					if (b[k]%one==0) {
						l++;
					}
				}
			}
			if (l==m) {
				for(int j =0;j<n;j++){
					if (one%a[j]==0) {
						c++;
					}
					if (c==n) {
						count++;
					}
				}
			}
			one=one+1;
		}
		System.out.println(count);        
	}

}
