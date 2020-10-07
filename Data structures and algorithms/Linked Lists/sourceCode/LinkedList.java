
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
}
