package hackerhank.dataStructures.trees;

public class PreorderTraversal {

	public class Node {
		public Node(int data) {
			this.data = data;
		}
	    int data;
	    Node left;
	    Node right;
	}

	public Node prepare() {
		Node root = new Node(3);
		root.left = new Node(5);
		root.right = new Node(2);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		root.right.left = new Node(6);
		return root;
	}
	
	public static void main(String[] args) {
		PreorderTraversal pt = new PreorderTraversal();
		pt.preOrder(pt.prepare());
	}

	void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data+" ");
			if (root.left != null) 
				this.printNode(root.left);
			if (root.right != null)
				this.printNode(root.right);
		}		
	}
	
	void printNode(Node node) {
		System.out.print(node.data+" ");
		if (node.left != null) 
			this.printNode(node.left);
		if (node.right != null)
			this.printNode(node.right);		
	}
	
}
