package hackerhank.algorithms.sorting;

import java.util.Scanner;

/**
 * 
 * @author Samuel
 *
 *	https://www.hackerrank.com/challenges/quicksort4
 *
 */
public class RunningTimeOfQuickSort {

	private static int quickSortSwaps = 0;
	private static int insertionSortSwaps = 0;
	
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
				quickSortSwaps++;
			}
		}
		int temp = ar[i+1];
		ar[i+1] = ar[hi];
		ar[hi] = temp;
		quickSortSwaps++;
		return i+1;
	}	
	
    public static void insertionSort(int[] ar) {       
    	if (ar.length <= 1)
    		return;
    	for (int i=1; i < ar.length; i++) {
			for (int l = i-1; l >= 0; l--) {
    			if (ar[l] > ar[l+1]) {
    				int tmp = ar[l+1];
    				ar[l+1] = ar[l];
    				ar[l] = tmp;
    				insertionSortSwaps++;
    			} else {
    				break;
    			}
			}
    	}
    }	
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        int[] ar2 = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
            ar2[i]=ar[i];
         }
         quickSort(ar, 0, s-1);
         insertionSort(ar2);
         System.out.println("quickSortSwaps:"+quickSortSwaps);
         System.out.println("insertionSortSwaps:"+insertionSortSwaps);
         System.out.println(insertionSortSwaps-quickSortSwaps);
	}

}
