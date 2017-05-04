package hackerhank.dataStructures.LinkedList;

public class InsertNodeTailLinkedList {

  public class Node {
	     int data;
	     Node next;
  }
	
  Node Insert(Node head,int data) {
	    if (head == null) {
	        head = new Node();
	        head.data = data;
	    } else {
	    	Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = new Node();
	        temp.next.data = data;
	    }
	    return head;
	// This is a "method-only" submission. 
	// You only need to complete this method. 
	  
	}  
  
  	public void prepare() {
		Node head = new Node();
		head.data = 1;
		head.next = new Node();
		head.next.data = 2;
		head.next.next = new Node();
		head.next.next.data = 3; 
		//Node ret = this.Insert(head, 3);
		//Node ret = this.InsertNth(head, 4, 2);
		//System.out.println(ret);
		//ret = this.InsertNth(null, 1, 0);
		//ret = this.Reverse(head);
		Node n1 = new Node();
		n1.data = 12;
		Node n2 = new Node();
		n2.data = 13;
		int ret = this.CompareLists(n1, n2);
		System.out.println(ret);
  	}
  	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertNodeTailLinkedList in = new InsertNodeTailLinkedList();
		in.prepare();


	}

	public Node InsertNth(Node head, int data, int position) {
	    if (head == null){
	        head = new Node();
	        head.data = data;
	    } else {
	        if (position == 0) {
	            Node first = new Node();
	            first.data = data;
	            first.next = head;
	            return first;
	        } else {
	            Node temp = head;
	            int i = 1;
	            while (i < position) {
	                temp = temp.next;
	                i++;
	            }
	            if (temp.next != null) {
	                Node major = temp.next;
	                temp.next = new Node();
	                temp.next.data = data;
	                temp.next.next = major;
	            } else {
	                temp.next = new Node();
	                temp.next.data = data;
	            }
	        }
	    }
	    return head;
	   // This is a "method-only" submission. 
	    // You only need to complete this method. 
	}	
	
	Node Delete(Node head, int position) {
	    if (position == 0) {
	        if (head.next != null) {
	            Node first = head.next;
	            return first;
	        } else {
	            return null;
	        }
	    } else {
	        Node temp = head;
	        int i = 1;
	        while (i < position) {
	            temp = temp.next;
	            i++;
	        }
	        if (temp.next.next != null) {
	            temp.next = temp.next.next;
	        } else {
	            temp.next = null;
	        }
	    }
	    return head;
	  // Complete this method

	}
	
	//reverse print
	void print(Node head) {
	    if (head.next != null) {
	        print(head.next);
	    }
	    System.out.println(head.data);
	}

	void ReversePrint(Node head) {
	  // This is a "method-only" submission. 
	  // You only need to complete this method. 
	    if (head != null) {
	        if (head.next != null){
	            print(head.next);
	        } 
	        System.out.println(head.data);
	    }
	}
	
	Node Reverse(Node head) {
	       Node prev = null;
	       Node temp = null;
	       while (head != null) {
	           temp = head.next;
	           head.next = prev;
	           prev = head;
	           head = temp;    
	       }
	       return prev;
	}

	int CompareLists(Node headA, Node headB) {
	    if (headA == null && headB == null)
	        return 1;
	    if (headA == null || headB == null)
	        return 0;
    
        if (headA.data != headB.data) {
            return 0;
        }
	    while (headA.next != null) {
	        if (headA.data != headB.data) {
	            return 0;
	        }
	        
	        if (headA.next != null) {
	            headA = headA.next;
	        }
	        if (headB.next != null) {
	            headB = headB.next;
	        }
	    }
        if ((headA.next != null && headB.next == null) || 
            (headB.next != null && headA.next == null))
            return 0;    
	    return 1;
	}
	
}
