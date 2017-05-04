package hackerhank.dataStructures.trees;

public class PostOrderTraversal {

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
		PostOrderTraversal pt = new PostOrderTraversal();
		pt.postOrder(pt.prepare());
	}

	void postOrder(Node root) {
		if (root != null) {
			if (root.left != null) 
				this.printNode(root.left);
			if (root.right != null)
				this.printNode(root.right);
			System.out.print(root.data+" ");
		}		
	}
	
	void printNode(Node node) {
		if (node.left != null) 
			this.printNode(node.left);
		if (node.right != null)
			this.printNode(node.right);
		System.out.print(node.data+" ");
	}
	
}
