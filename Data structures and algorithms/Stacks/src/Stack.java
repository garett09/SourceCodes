
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
}
