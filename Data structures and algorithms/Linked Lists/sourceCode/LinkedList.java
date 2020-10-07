
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
	
	int getSize() {
		int size =0;
		for(Node iNode = head; iNode != null; iNode = iNode.next) {
			size++;
		}
		return size;
	}
	
	void addAt (int index, T data) {
		Node nodeObj = new Node (data);
		if(index==0) {
			addAtStart(data);
			return;
		}else {
		Node iNode = head;
		for(int i=0; i<getSize(); i++) {
			if(i==index) {
				nodeObj.next =  iNode.next;
				iNode.next =  nodeObj;
				break;
			}
			iNode = iNode.next;
		}
		
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
