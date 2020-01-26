package hackerhank.interviewprepkit.dictionariesandhashmaps;

import java.util.Scanner;

public class HashTableHansomNotes {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
    	java.util.HashMap<String, Integer> hmMag = new java.util.HashMap<String, Integer>();
    	for (int i = 0; i < magazine.length; i++) {
    		if (hmMag.containsKey(magazine[i])) {
    			Integer qtd = hmMag.get(magazine[i]);
    			hmMag.put(magazine[i], ++qtd);
    		} else {
    			hmMag.put(magazine[i], 1);
    		}
    	}
    	
    	for (int i = 0; i < note.length; i++) {
    		if (hmMag.containsKey(note[i])) {
    			Integer qtd = hmMag.get(note[i]);
    			qtd--;
    			if (qtd.intValue() == 0) {
    				hmMag.remove(note[i]);
    			} else {
    				hmMag.put(note[i], qtd);
    			}
    		} else {
    			System.out.println("No");
    			return;
    		}
    	}
    	System.out.println("Yes");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }

}
