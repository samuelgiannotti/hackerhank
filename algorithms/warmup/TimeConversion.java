package hackerhank.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

	static void convertTime(String s) {
		if (s.contains("PM")) {
			if (s.startsWith("12")) {
				s = s.substring(0, s.length()-2);
			} else {
				int hour = Integer.parseInt(s.substring(0, 2));
				hour += 12;
				s = s.substring(0, s.length()-2);
				s = s.substring(2, s.length());
				s = hour+s;
			}
		} else if (s.contains("AM")) {
			s = s.substring(0, s.length()-2);
			if (s.startsWith("12")) {
				s = "00"+s.substring(2, s.length());
			}
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        convertTime(time);
	}

}
