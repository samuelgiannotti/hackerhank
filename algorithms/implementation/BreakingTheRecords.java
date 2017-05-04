package hackerhank.algorithms.implementation;

import java.util.Scanner;

public class BreakingTheRecords {

    static int[] getRecord(int[] s){
    	int[] ret = {0,0};
    	if (s.length == 0)
    		return ret;
    	int minScore = s[0], maxScore = s[0];
    	for (int i = 1; i < s.length; i++) {
    		if (minScore > s[i]) {
    			ret[1]++;
    			minScore = s[i];
    		}
    		if (maxScore < s[i]) {
    			ret[0]++;
    			maxScore = s[i];
    		}
    	}
    	
    	return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }

}
