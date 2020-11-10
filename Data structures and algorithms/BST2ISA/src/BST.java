
public class BST {
	Node root;
	
	BST(){
		root = null;
	}
	
	void add(int data) {
		Node nodeObj = new Node(data);
		if (root == null) {
			root = nodeObj;
			return;
		}
			Node pNode = root;
			while(root != null) {
				if (nodeObj.data < pNode.data) {
					if (pNode.left == null) {
						pNode.left = nodeObj;
						return;
					}
					pNode = pNode.left;
				}else {
					if(pNode.right == null) {
						pNode.right = nodeObj;
						return;
					}
					pNode = pNode.right;
				}
			}
		}
	Node search(int searchData) {
		if (root == null)
			return null;
		Node pNode = root;
		while(pNode != null) {
			if(searchData == pNode.data) {
				return pNode;	
			}else if (searchData < pNode.data) {
				pNode = pNode.left;
			}else {
				pNode = pNode.right;
			}
		}
		return null;
	}
	void preOrderTraversal(Node root) {
		if (root==null) return;
		
		System.out.println(root.data+ "");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	void postOrderTraversal(Node root) {
		if (root==null) return;
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.println(root.data + "");
	}
	void inOrderTraversal(Node root) {
		if (root==null) return;
		
		inOrderTraversal(root.left);	
		System.out.println(root.data+ "");
		inOrderTraversal(root.right);

	}
} 

