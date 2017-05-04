package hackerhank.algorithms.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoCharacters {

	public static void compute(String s) {
		int count = 0;
		if (s.length() == 1) {
			System.out.println(0);
			return;
		}
		if (checkString(s)) {
			System.out.println(s.length());
			return;
		}
			
		ArrayList<String> al = new ArrayList<String>();
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (!al.contains(chars[i]+"")) {
				al.add(chars[i]+"");
			}
		}
		String[] sarr = null;
		if (al.size() > 2) {
			sarr = new String[al.size()];
			al.toArray(sarr);
			for (int i = 0; i < sarr.length; i++) {
				for (int l = i+1; l < sarr.length; l++) {
					String ret = cleanString(s, i, l, sarr);
					if (checkString(ret)) {
						count = Math.max(ret.length(), count);
					}
				}
			}
		}
		System.out.println(count);
	}
	
	public static String cleanString(String s1, int i, int l, String[] arr) {
		for (int k = 0; k < arr.length; k++) {
			if (k != i && k != l)
				s1 = s1.replaceAll(arr[k], "");
		}
		return s1;
	}
	
	public static boolean checkString(String s) {
		boolean ret = true;
		char[] chars = s.toCharArray();
		if (chars.length > 2) {
			char[] cc = new char[2];
			cc[0] = chars[0];
			cc[1] = chars[1];
			if (cc[0] == cc[1])
				return false;
			for (int i = 0; i < chars.length; i++) {
				if (i%2==0) {
					if (chars[i] != cc[0]) {
						ret = false;
						break;
					}
				} else {
					if (chars[i] != cc[1]) {
						ret = false;
						break;
					}
				}
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        compute(s);
	}


}
