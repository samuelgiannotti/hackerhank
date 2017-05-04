package hackerhank.algorithms.sorting;

import java.util.Scanner;

public class QuickSortInPlace {

	public static void quickSort(int[] ar, int lo, int hi) {
		if (lo < hi) {
			int p = partition(ar, lo, hi);
			quickSort(ar, lo, p-1);
			quickSort(ar, p+1, hi);
		}
	}
	
	public static int partition(int[] ar, int lo, int hi) {
		int pivot = ar[hi];
		int i = lo -1;
		for (int j = lo; j < hi; j++) {
			if (ar[j] <= pivot) {
				i++;
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
		}
		int temp = ar[i+1];
		ar[i+1] = ar[hi];
		ar[hi] = temp;
		printArr(ar);
		return i+1;
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();		
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         quickSort(ar, 0, s-1);
    }	
}
