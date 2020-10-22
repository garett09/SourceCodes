
public class BTArray<T> {
	int root;
	int size;
	T[] container;
	int levels; //levels is depth = how many edges from root to x
	//height of x = no. of edges in longest path from x to a leaf.
	//height of leaf nodes are 0
	//height of tree = height of root node 
	//vertex = node
	BTArray(int levels) {
		size = 	(int) (Math.pow(2, levels) - 1);
		container = (T[]) new Object [size];
	}
	
	void addRoot (T data) {
		container [0] = data;
	}
	
	void addLeft (T data, int pIndex) {
		container[2*pIndex+1] = data;
	}
	
	void addRight (T data, int pIndex) {
		container[2*pIndex+2] = data;
	}
	
	void bfsTraverse() {
		for(T element: container) {
			System.out.print(element + " ");
		}
	}
	
}
