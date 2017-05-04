package hackerhank.algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {

    static void solve(int[] grade){
        // Complete this function
    	
    	for (int i = 0; i < grade.length; i++) {
    		if (grade[i] < 38) {
    			System.out.println(grade[i]);
    		} else {
    			int modulo = (grade[i] % 5);
    			if (modulo >= 3) {
    				System.out.println(grade[i]+(5-modulo));
    			} else {
    				System.out.println(grade[i]);
    			}
    		}
    	}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        solve(grades);
    }

}
