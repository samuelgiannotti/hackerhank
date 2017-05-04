package hackerhank.dataStructures.Arrays;

import java.util.Scanner;

public class SparseArrays {

	static void countQueries(String[] str, String[] query) {
		int count = 0;
		for (int i=0; i < query.length; i++) {
			for (int j=0; j < str.length; j++) {
				if (str[j].equals(query[i])){
					count++;
				}
			}
			System.out.println(count);
			count = 0;
		}
	}
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int numStrings = in.nextInt();
	    String arrString[] = new String[numStrings];
	    for(int i=0; i < arrString.length ; i++){
	    	arrString[i] = in.next();
	    }
	    
	    int numQueries = in.nextInt();
	    String arrQuery[] = new String[numQueries];
	    for(int i=0; i < arrQuery.length ; i++){
	    	arrQuery[i] = in.next();
	    }

	    countQueries(arrString, arrQuery);
	}

}
