package hackerhank.dataStructures.Arrays;

import java.util.Scanner;

public class Array2DDS {

	static void hourGlass(int[][] arr) {
		int actualSum = 0;
		int maxSum = -2^32+1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				actualSum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
							arr[i+1][j+1]+
							arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				if (actualSum > maxSum) {
					maxSum = actualSum;
				}
			}
		}
		System.out.println(maxSum);
		
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        hourGlass(arr);
	}

}
