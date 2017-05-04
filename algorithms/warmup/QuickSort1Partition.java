package hackerhank.algorithms.warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort1Partition {
	
	static void partition(Integer[] ar) {
    	ArrayList<Integer> left = new ArrayList<Integer>();
    	ArrayList<Integer> right = new ArrayList<Integer>();
    	Integer pivot = ar[0];
    	for (int i = 1; i < ar.length; i++) {
    		if (pivot.intValue() > ar[i].intValue()) {
    			left.add(ar[i]);
    		} else {
    			right.add(ar[i]);
    		}
    	}

		Integer[] arr1 = new Integer[left.size()];
		left.toArray(arr1);
    	if (arr1.length > 1) {
    		partition(arr1);
    	}
    	
    	Integer[] arr2 = new Integer[right.size()];
    	right.toArray(arr2);
    	if (right.size() > 1) {
    		partition(arr2);
    	}

    	int index2 = 0;
    	for (int i=0; i<ar.length; i++) {
    		if (i < arr1.length) {
    			ar[i] = arr1[i];
    		} else {
    			if (i == arr1.length) {
    				ar[i] = pivot;
    			} else {    				
    				ar[i] = arr2[index2];
    				index2++;
    			}
    		} 
    	}    	
    	
    	printArray(ar);

    	
	}
	
    static void partition(int[] ar) {
    	
    	ArrayList<Integer> left = new ArrayList<Integer>();
    	ArrayList<Integer> right = new ArrayList<Integer>();
    	int pivot = ar[0];
    	for (int i = 1; i < ar.length; i++) {
    		if (pivot > ar[i]) {
    			left.add(ar[i]);
    		} else {
    			right.add(ar[i]);
    		}
    	}

		Integer[] arr1 = new Integer[left.size()];
		left.toArray(arr1);
    	if (arr1.length > 1) {
    		partition(arr1);
    	}
    	
    	Integer[] arr2 = new Integer[right.size()];
    	right.toArray(arr2);
    	if (right.size() > 1) {
    		partition(arr2);
    	}
    	
    	Integer[] resultArr = new Integer[arr1.length+arr2.length+1];
    	int index2 = 0;
    	for (int i=0; i<resultArr.length; i++) {
    		if (i < arr1.length) {
    			resultArr[i] = arr1[i];
    		} else {
    			if (i == arr1.length) {
    				resultArr[i] = pivot;
    			} else {    				
    				resultArr[i] = arr2[index2];
    				index2++;
    			}
    		} 
    	}
    	
    	printArray(resultArr);

 }   

    
    
static void printArray(Integer[] ar) {
   for(int n: ar){
      System.out.print(n+" ");
   }
     System.out.println("");
}
 
public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int[] ar = new int[n];
     for(int i=0;i<n;i++){
        ar[i]=in.nextInt(); 
     }
     partition(ar);
 }    
}
