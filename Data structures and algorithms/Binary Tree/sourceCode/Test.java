
public class Test {

	public static void main(String[] args) {
		BTArray<Virus> bTree = new BTArray(3);
		BTLinkedList<Character> t = new BTLinkedList();

		Node root = t.addRoot('A');

		// level 1
		t.addLeft('B', root);
		t.addRight('C', root);

		// level2
		t.addLeft('D', root.left);
		t.addRight('E', root.left);
		t.addLeft('F', root.right);
		t.addRight('G', root.right);
		// level 3
		t.addLeft('H', root.left.right);
		t.addRight('I', root.left.right);

		t.preOrderTraversal(root);
		System.out.println();
		t.inOrderTraversal(root);
		System.out.println();
		t.postOrderTraversal(root);

//		bTree.addRoot('A');
//		bTree.addLeft('B', 0);
//		bTree.addRight('C', 0);
//		bTree.addLeft('D', 1);
//		bTree.addRight('E', 1);
//		bTree.addLeft('F', 2);
//		bTree.addRight('G', 2);
//		bTree.addLeft('H', 3);
//		bTree.addRight('I', 3);
//		bTree.addLeft('J', 4);

//		//level 0
//		bTree.addRoot(100);
//		
//		//level 1
//		bTree.addLeft(50, 0);
//		bTree.addRight(150, 0);
//		
//		//level2
//		bTree.addRight(75, 1);
//		bTree.addLeft(125, 2);
//		
//		//level 3
//		bTree.addLeft(74, 4); //parent index 
//		bTree.addRight(76, 4);
//		bTree.addLeft(124, 5);
//		bTree.addRight(130, 5);
		Virus v1 = new Virus("Covid-19", 1130000);
		Virus v2 = new Virus("MERS-CoV", 80881);
		Virus v3 = new Virus("Influenza", 61000);
		Virus v4 = new Virus("Ebola", 11310);
		Virus v5 = new Virus("SARS-CoV", 774);
		Virus v6 = new Virus("Dengue", 223240);
		// 0 level
		bTree.addRoot(v1);
		// 1 level
		bTree.addLeft(v2, 0);
		bTree.addRight(v3, 0);
		// 2 level
		bTree.addLeft(v4, 1);
		bTree.addLeft(v6, 2);
		bTree.addRight(v5, 2);

		bTree.bfsTraverse();
	}

}
