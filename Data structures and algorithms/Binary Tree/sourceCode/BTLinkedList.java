
public class BTLinkedList<T> {
	Node root;

	BTLinkedList() {
		root = null; // empty binary tree
	}

	boolean isEmpty() {
		if (root == null)
			return true;
		return false;
	}

	Node addRoot(T data) {
		return new Node(data);
	}

	void addLeft(T data, Node pNode) {
		Node nodeObj = new Node(data);
		pNode.left = nodeObj;

	}

	void addRight(T data, Node pNode) {
		Node nodeObj = new Node(data);
		pNode.right = nodeObj;
	}

	void preOrderTraversal(Node root) {
		if (root == null)
			return;

		System.out.print(root.data.toString() + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}

	void postOrderTraversal(Node root) {
		if (root == null)
			return;

		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data.toString() + " ");
	}

	void inOrderTraversal(Node root) {
		if (root == null)
			return;

		inOrderTraversal(root.left);
		System.out.print(root.data.toString() + " ");
		inOrderTraversal(root.right);

	}

}
