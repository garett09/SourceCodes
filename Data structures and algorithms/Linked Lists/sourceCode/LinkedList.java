
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
	
	void addAtStart(T data) {
		Node nodeObj =  new Node (data);
		if(isEmpty()) {
			head = nodeObj;
		}else {
			nodeObj.next = head;
			head = nodeObj;
		}
	}
	
	void addAtEnd(T data) {
		Node nodeObj =  new Node (data);
		if(isEmpty()) {
			head = nodeObj;
		}else {
			Node iNode; //temporary node object
			for(iNode = head; iNode.next != null; iNode=iNode.next) {
			}
			iNode.next = nodeObj;	
		}
		
	}
	void display() {
		for(Node iNode = head; iNode != null; iNode=iNode.next) {
			System.out.println(iNode.data);
		}
	
	}
	
}
