package hackerhank.dataStructures.LinkedList;

/**
 * 
 * @author Samuel Giannotti
 * 
 * https://www.hackerrank.com/challenges/compare-two-linked-lists
 *
 */
public class Compare2Linkedlists {

	  public class Node {
		     int data;
		     Node next;
	  }
	
	  
	  /*
	  Compare two linked lists A and B
	  Return 1 if they are identical and 0 if they are not. 
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/
	int CompareLists(Node headA, Node headB) {
	    if (headA == null && headB == null)
	        return 1;
	    Node tempA = headA.next;
	    Node tempB = headB.next;
	    while (tempA != null) {
	        if (tempB == null) {
	            return 0;
	        }
	        if (tempA.data != tempB.data) {
	            return 0;
	        }
	        tempA = tempA.next;
	        tempB = tempB.next;
	    }
	    if (tempA == null && tempB != null)
	        return 0;
	    return 1;
	}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
