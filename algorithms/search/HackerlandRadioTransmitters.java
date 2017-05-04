package hackerhank.algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class HackerlandRadioTransmitters {

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
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        calculateRadios(x, k);
	}

}
