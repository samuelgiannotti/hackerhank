package hackerhank.algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class HackerlandRadioTransmitters2 {

	static void calculateRadios(int[] x, int k) {
		int numOfRadios = 0;
		if (x.length == 1) {
			System.out.println(1);
			return;
		}
		Arrays.sort(x);
		int lastRadioPos = -k-1;
		int nextSugRadPos = x[0]+k;
		for (int i = 0; i < x.length; i++) {
			int actual = x[i];
			if (i+1 < x.length) {
				if ((x[i]+k < x[i+1] && lastRadioPos+k < x[i]) || nextSugRadPos <= x[i] || nextSugRadPos < x[i+1]) { //se o prox e o ant mto distante
					numOfRadios++;
					lastRadioPos = x[i];
					nextSugRadPos = x[i] + (k*2);

					if (x[i+1] <= lastRadioPos+k) {
						for (int l = i; l < x.length; l++) {
							if (x[l] > lastRadioPos+k) {
								nextSugRadPos = x[l] + k;
								break;
							} else if (x[l] == nextSugRadPos) {
								break;
							}
						}
					} else {
						nextSugRadPos = x[i+1] + (k);
					}
						
				}	
			} else {
				if (x[i] > lastRadioPos+k)
					numOfRadios++;
			}
		}
			
		System.out.println(numOfRadios);
	}
	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

	        int n = in.nextInt();
	        int k = in.nextInt();
	        
	        int a[] = new int[n];
	        for(int x_i=0; x_i < n; x_i++){
	            a[x_i] = in.nextInt();
	        }
	        Arrays.sort(a);
	      
	        int ans = 0;
	        
	        for (int i = 0; i < n; i++) {
	          int j = i;
	          while (j + 1 < n && a[j + 1] - a[i] <= k)
	            j++;
	          i = j;
	          while (j + 1 < n && a[j + 1] - a[i] <= k)
	            j++;
	          i = j;
	          ans++;
	        }
	        
	        System.out.println(ans);
	}

}
