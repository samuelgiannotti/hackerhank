package hackerhank.algorithms.sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void insertIntoSorted(int[] ar) {
    	if (ar.length == 0)
    		return;
        int v = ar[ar.length-1];
        boolean changed = false;
        for (int i = ar.length-2; i >= 0; i--) {
        	if (v < ar[i]) {
        		ar[i+1] = ar[i];
        	} else {
        		ar[i+1] = v;
        		changed = true;
        	}
        	printArray(ar);
        	if (changed)
        		break;
        }
        if (!changed) {
        	ar[0] = v;
        	printArray(ar);
        }
    }	

    public static void insertionSortPart2(int[] ar) {       
    	if (ar.length <= 1)
    		return;
    	for (int i=1; i < ar.length; i++) {
			for (int l = i-1; l >= 0; l--) {
    			if (ar[l] > ar[l+1]) {
    				int tmp = ar[l+1];
    				ar[l+1] = ar[l];
    				ar[l] = tmp;
    			} else {
    				break;
    			}
			}
    		printArray(ar);
    	}
    }
    
	/* Tail starts here */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
        for(int i=0;i<s;i++){
           ar[i]=in.nextInt(); 
        }
        //insertIntoSorted(ar);
        insertionSortPart2(ar);
   }
   
   
   private static void printArray(int[] ar) {
     for(int n: ar){
        System.out.print(n+" ");
     }
       System.out.println("");
  }

}
