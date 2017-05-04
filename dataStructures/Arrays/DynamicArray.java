package hackerhank.dataStructures.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {

	static void dynArr(int[][] arr, int nOfEmptySeq) {
		ArrayList<Integer>[] alArr = new ArrayList[nOfEmptySeq];
		for (int i = 0; i < nOfEmptySeq; i++)
			alArr[i] = new ArrayList<Integer>();
		int lastAns = 0;
		
		for (int i = 0; i <arr.length; i++) {
			if (arr[i][0] == 1) {
				int index = ((arr[i][1] ^ lastAns) % nOfEmptySeq);
				Integer it = new Integer(arr[i][2]);
				alArr[index].add(it);
			} else if (arr[i][0] == 2) {
				int index = ((arr[i][1] ^ lastAns) % nOfEmptySeq);
				int seqSize = (arr[i][2] % alArr[index].size());
				lastAns = alArr[index].get(seqSize);
				System.out.println(lastAns);
			}
		}
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nOfEmptySeq = in.nextInt();
        int nOfQueries = in.nextInt();
        int arr[][] = new int[nOfQueries][3];
        for(int arr_i=0; arr_i < nOfQueries; arr_i++){
            arr[arr_i][0] = in.nextInt();
            arr[arr_i][1] = in.nextInt();
            arr[arr_i][2] = in.nextInt();
        }
        dynArr(arr, nOfEmptySeq);
	}

}
