public class StackGeneric<T> {
	T[] container;
	int top;

	// new()
	StackGeneric(int size) {
		container = (T[]) new Object[size];
		top = -1;
	}

	// clear
	void clear() {
		top = -1;
	}

	// check if stack is empty
	boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	// check if stack is full
	boolean isFull() {
		if (top == container.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	// pushing

	void push(T item) {
		top++;
		container[top] = item;
	}

	// popping an item from the stack
	T pop() {
		T temp = container[top];
		top--;
		return temp;
	}

	// peek
	T peek() {
		return container[top];
	}
}
