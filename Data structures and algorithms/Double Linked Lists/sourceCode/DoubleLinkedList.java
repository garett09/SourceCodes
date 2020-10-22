
public class DoubleLinkedList<T> {

	Node head;
	Node tail;

	DoubleLinkedList() {
		head = null;
		tail = null;
	}

	boolean isEmpty() {
		if (head == null && tail == null) {
			return true;
		} else {
			return false;
		}

	}

	void addAtStart(T data) {
		Node nodeObj = new Node(data);
		if (isEmpty()) {
			head = nodeObj;
			tail = nodeObj;
			return;
		} else {
			nodeObj.next = head;
			head.prev = nodeObj;
			head = nodeObj;
		}
	}

	private int getSize() {
		int size = 0;
		for (Node iNode = head; iNode != null; iNode = iNode.next) {
			size++;
		}
		return size;
	}

	void addAt(int position, T data) {
		Node nodeObj = new Node(data);
		if (position == 0) {
			addAtStart(data);
		} else {
			Node iNode = head;
			for (int i = 0; i < getSize(); i++) {
				if (i == position - 1) {
					nodeObj.next = iNode.next;
					nodeObj.prev = iNode.prev;

					iNode.next = nodeObj;
					iNode.next.prev = nodeObj;
				}
				iNode = iNode.next;
			}

		}
	}

	void addAtEnd(T data) {
		Node nodeObj = new Node(data);
		if (isEmpty()) {
			head = nodeObj;
			tail = nodeObj;
			return;
		} else {
			tail.next = nodeObj;
			nodeObj.prev = tail;
			tail = nodeObj;
		}
	}

	void deleteAt(int position) {
		Node iNode = head;

		if (position == 0) {
			deleteAtHead();
			return;
		}
		
		if(position==getSize()-1) {
			deleteAtTail();
			return;
		}
		for (int i = 0; i < getSize(); i++) {
			if (i == position - 1) {
				iNode.next = iNode.next.next;
				iNode.next.prev = iNode;
			}
			iNode = iNode.next;
		}
	}

	void deleteAtHead() {
		head = head.next;
		head.prev = null;
	}

	void deleteAtTail() {
		
		tail = tail.prev;
		tail.next = null;
	}

	void display() {
		for (Node iNode = head; iNode != null; iNode = iNode.next) {
			System.out.println(iNode.data);
		}

	}

}
