package hackerhank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        int[] bTypes = new int[5];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
            bTypes[types[types_i]-1]++;
        }
        
        int maxType = Arrays.stream(bTypes).max().getAsInt();
        for (int i = 0; i < bTypes.length; i++) {
        	if (maxType == bTypes[i]) {
        		System.out.println(i+1);
        		break;
        	}
        }
        
        
	}

}
