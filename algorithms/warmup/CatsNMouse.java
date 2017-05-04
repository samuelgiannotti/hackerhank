package hackerhank.algorithms.warmup;

import java.util.Scanner;

public class CatsNMouse {

	static void catCatch(int x, int y, int z) {
		int catADistance = Math.abs(x-z);
		int catBDistance = Math.abs(y-z);
		if (catADistance > catBDistance)
			System.out.println("Cat B");
		else if (catBDistance > catADistance)
			System.out.println("Cat A");
		else
			System.out.println("Mouse C");
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            catCatch(x, y, z);
        }
	}

}
