package hackerhank.algorithms.dynamicProgramming;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class VerticalSticks {

	static int total = 0;
	static int perm = 0;
	
	static void calculate(ArrayList<int[]> al, int nOfTestCases) {
		for (int i = 0; i < nOfTestCases; i++) {
			int[] elements = al.get(i); 

			permute(elements, 0);
			
			double avg = 0.0;
			avg = ((double)total / (double)perm);
		    DecimalFormat f = new DecimalFormat("##.00");
		    System.out.println(f.format(avg));
		    total = 0;
		    perm = 0;
		}
	}
	
	static void calculate(int[] permutations) {
		for (int i = 0; i < permutations.length; i++) {
			if (i == 0) {
				total++;
			} else {
				total++;
				for (int j = i-1; j >= 0; j--) {
					if (permutations[i] > permutations[j]) {
						total++;
					} else {
						break;
					}
				}
			}
		}
	}
	
    static void permute(int[] arr, int k){
        for(int i = k; i < arr.length; i++){
            swap(arr, i, k);
            permute(arr, k+1);
            swap(arr, k, i);
        }
        if (k == arr.length -1){
        	calculate(arr);
        	perm++;
        }
    }
	
    static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
	
	static int[][] getFactorialArr(int nOfElements) {
		int totalElements = 1;
		for (int i = nOfElements; i > 1 ; i--) {
			totalElements *= i; 
		}
		return new int[totalElements][nOfElements];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<int[]> al = new ArrayList<int[]>();
		Scanner in = new Scanner(System.in);
		int nOfTestCases = in.nextInt();
		for (int i = 0; i < nOfTestCases; i++) {
			int nOfElements = in.nextInt();
			int[] elements = new int[nOfElements];
			for (int j = 0; j < elements.length; j++) {
				elements[j] = in.nextInt();
			}
			al.add(elements);
		}
		calculate(al, nOfTestCases);

	}

}
