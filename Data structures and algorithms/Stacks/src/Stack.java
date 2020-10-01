
public class Stack {
	int[] container;
	int top;

	// new()
	Stack(int size) {
		container = new int[size];
	}

	// clear
	void clear() {
		top = -1;
	}

	//check if stack is empty
	boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	//check if stack is full
	boolean isFull() {
		if (top==container.length-1) {
			return true;
		}else {
			return false;
		}
	}
}
