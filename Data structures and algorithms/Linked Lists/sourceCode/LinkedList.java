
public class LinkedList<T> {

	Node head;

	LinkedList() {
		head = null;
	}

	boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	
	}
	
	void addAtEnd(T data) {
		Node nodeObj =  new Node (data);
		if(isEmpty()) {
			head = nodeObj;
		}else {
			Node iNode; //temporary node object
			for(iNode = head; iNode != null; iNode=iNode.next) {
			}
			iNode.next = nodeObj;	
		}
		
	}
}
