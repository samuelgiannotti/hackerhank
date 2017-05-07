package hackerhank.algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class HackerlandRadioTransmitters2 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

	        int n = in.nextInt();
	        int k = in.nextInt();
	        
	        int a[] = new int[n];
	        for(int x_i=0; x_i < n; x_i++){
	            a[x_i] = in.nextInt();
	        }
	        Arrays.sort(a);
	      
	        int ret = 0;
	        
	        for (int i = 0; i < n; i++) {
	          int j = i;
	          while (j + 1 < n && a[j + 1] - a[i] <= k)
	            j++;
	          i = j;
	          while (j + 1 < n && a[j + 1] - a[i] <= k)
	            j++;
	          i = j;
	          ret++;
	        }
	        
	        System.out.println(ret);
	}

}
