package hackerhank.algorithms.strings;

import java.util.Scanner;

public class SuperReducedString {

	public static void reduceString(String s) {
		StringBuffer sb = new StringBuffer();
		char[] arr = s.toCharArray();
		if (arr == null || arr.length == 0){
			System.out.println("Empty String");
			return;
		}			
		for (int i = 0; i < arr.length; i++) {
			if (arr.length > i+1) {
				if (arr[i] == arr[i+1]) {
					i++;
				} else {
					sb.append(arr[i]);
				}
			} else {
				sb.append(arr[i]);
			}
		}
		String newString = sb.toString();
		if (!newString.equals(s)) {
			reduceString(newString);
		} else {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String s = in.next();
	    reduceString(s);
	}

}
