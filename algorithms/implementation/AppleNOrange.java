package hackerhank.algorithms.implementation;

import java.util.Scanner;

public class AppleNOrange {

	static int applesInside = 0;
	static int orangesInside = 0;
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int houseBegin = in.nextInt();
        int houseEnd = in.nextInt();
        int appleTree = in.nextInt();
        int orangeTree = in.nextInt();
        int nOfApples = in.nextInt();
        int nOfOranges = in.nextInt();
        
        for(int apple_i=0; apple_i < nOfApples; apple_i++){
            int appleDistanceFromTree = in.nextInt();
            int applePosition = appleTree + appleDistanceFromTree;
            if ((houseBegin <= applePosition) &&
            		(applePosition <= houseEnd))
            	applesInside++;
        }
        for(int orange_i=0; orange_i < nOfOranges; orange_i++){
        	int orangeDistanceFromtree = in.nextInt();
            int orangePosition = orangeTree +  orangeDistanceFromtree;
        	if ((houseBegin <= orangePosition) &&
        		(orangePosition <= houseEnd))
        		orangesInside++;
        }
        System.out.println(applesInside);
        System.out.println(orangesInside);
	}

}
