public class AVLTree {
	Node root;

	AVLTree() {
		root = null;
	}

	int getHeight(Node n) {
		if (n == null) {
			return 0;
		}
		return n.height;
	}

	int max(int a, int b) {
		return (a > b) ? a : b;
	}

	Node leftRotate(Node x) {
		// before rotation
		Node y = x.right;
		Node T2 = y.left;

		// after rotation
		y.left = x;
		x.right = T2;

		x.height = max(getHeight(x.left), getHeight(x.right)) + 1;
		y.height = max(getHeight(y.left), getHeight(y.right)) + 1;
		return y;

	}

	int getBalance(Node n) {
		if (n == null)
			return 0;

		return getHeight(n.left) - getHeight(n.right);
	}

	Node rightRotate(Node x) {
		// before rotation
		Node y = x.left;
		Node T3 = y.right;

		// after rotation
		y.right = x;
		x.left = T3;

		x.height = max(getHeight(x.left), getHeight(x.right)) + 1;
		y.height = max(getHeight(y.left), getHeight(y.right)) + 1;
		return y;
	}

	Node insert(Node root, int data) {
		Node nodeObj = new Node(data);
		if (root == null)
			return nodeObj;

		if (data < root.data) {
			root.left = insert(root.left, data);
		} else if (data > root.data) {
			root.right = insert(root.right, data);
		} else {
			return root;
		}

		// update height of root
		root.height = max(getHeight(root.left), getHeight(root.right)) + 1;

		// get balance factor of root
		int balance = getBalance(root);

		// left left insertion
		if (balance > 1 && data < root.left.data) {
			return leftRotate(root);
		}

		// right right insertion
		if (balance < -1 && data > root.right.data) {
			return leftRotate(root);
		}

		// left right insertion
		if (balance > 1 && data > root.left.data) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		// right left rotation
		if (balance < -1 && data < root.right.data) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}
		return root;
	}

	void preOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

}