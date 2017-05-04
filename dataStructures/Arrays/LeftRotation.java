package hackerhank.dataStructures.Arrays;

import java.util.Scanner;

public class LeftRotation {
	
	static void rotateLeft(int[] arr, int nOfLeftRotations) {
		for (int i = 1; i <= nOfLeftRotations; i++) {
			int first = arr[0];
			for (int j = 0; j < arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = first;
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	}
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int arrSize = in.nextInt();
	    int nOfLeftRotations = in.nextInt();
	    int arr[] = new int[arrSize];
	    for(int arr_i=0; arr_i < arrSize; arr_i++){
	        arr[arr_i] = in.nextInt();
	    }
	    rotateLeft(arr, nOfLeftRotations);
	}
}
