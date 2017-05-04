package hackerhank.algorithms.implementation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DayOfTheProgrammer {

    static String solve(int year) {
    	String ret = null; 
    	try {
    		if (year > 1918) {
		    	SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		    	String dateInString = "01.01."+year;
		    	Date date = sdf.parse(dateInString);
		    	Calendar calendar = Calendar.getInstance();
		    	calendar.setTime(date);
		    	calendar.add(Calendar.DAY_OF_YEAR, 255);
		    	ret = sdf.format(calendar.getTime());
    		} else if (year == 1918) {
    			ret = "26.09.1918";
    		} else if (year < 1918) {
    			int days = 0;
    			if (year % 4 == 0) {
    				days = 12;
    			} else {
    				days = 13;
    			}
    			ret = days+".09."+year;
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }

}
