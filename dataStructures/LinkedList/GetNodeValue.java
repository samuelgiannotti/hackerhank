package hackerhank.dataStructures.LinkedList;

/**
 * 
 * @author Samuel Giannotti
 *
 * https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail
 *
 */
public class GetNodeValue {
	/*
	  Get Nth element from the end in a linked list of integers
	  Number of elements in the list will always be greater than N.
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/
	
	class Node {
		Node (int data) {
			this.data = data;
		}
	     int data;
	     Node next;
	}
	
	int GetNode(Node head,int n) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method.
		Node fastNode, iNode;
		int pos = 0;
		iNode = fastNode = head;
		while (true) {
			if (fastNode.next == null)
				break;

			pos++;
			if (pos > n)
				iNode = iNode.next; 
			fastNode = fastNode.next;
			
		}
		return iNode.data;
	}	
	
	public static void main(String[] args) {
		GetNodeValue ndVl = new GetNodeValue();
		
		//1 -> 3 -> 5 -> 6 -> NULL, positionFromTail = 0
		Node nd = ndVl.new Node(1);
		nd.next = ndVl.new Node(3);
		nd.next.next = ndVl.new Node(5);
		nd.next.next.next = ndVl.new Node(6);
		nd.next.next.next.next=null;
		int positionFromTail = 0;
		
		System.out.println(ndVl.GetNode(nd, positionFromTail));
		
		//1 -> 3 -> 5 -> 6 -> NULL, positionFromTail = 2
		positionFromTail = 2;
		
		System.out.println(ndVl.GetNode(nd, positionFromTail));
		
	}

}
