package hackerhank.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	static int diagonaldiff(int[][] arr, int n) {
		int diff = 0;
		int diag1 = 0;
		int diag2 = 0;
		
		
		for (int i = 0; i < n; i++) {
			diag1 += arr[i][i];
		}
		
		int row = 0;
		for (int i = n-1; i >= 0; i--) {
			diag2 += arr[row][i];
			row++;
		}		
		
		diff = diag1 - diag2;
		
		return Math.abs(diff);
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        System.out.println(diagonaldiff(a, n));
	}

}
