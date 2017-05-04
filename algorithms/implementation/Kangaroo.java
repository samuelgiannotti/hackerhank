package hackerhank.algorithms.implementation;

import java.util.Scanner;

public class Kangaroo {

	static void checkColide(int x1, int v1, int x2, int v2) {
		if (v2 > v1) { //front node runs fast
			System.out.println("NO");
			return;
		}
		
		while (x2 >= x1) {
			if (x2 == x1) {
				System.out.println("YES");
				return;
			}
			x2 += v2;
			x1 += v1;
		}
		System.out.println("NO");
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        checkColide(x1, v1, x2, v2);
	}

}
