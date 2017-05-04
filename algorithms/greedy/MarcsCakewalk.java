package hackerhank.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MarcsCakewalk {

    public static long getMinimumMiles(int[] calories) {    
        Arrays.sort(calories);
        int n = calories.length;
        
        long minimumMiles = 0;
        
        for (int i = n - 1, j = n - i - 1; 
             i >= 0; 
             i--, j++
            ) {
            minimumMiles += Math.pow(2, j) * calories[i];
            // You could also do: minimumMiles += (1L << j) * calories[i];
        }
        
        return minimumMiles;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] calories = new int[n];
        for (int i = 0; i < n; i++) {
            calories[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(getMinimumMiles(calories));
    }

}
