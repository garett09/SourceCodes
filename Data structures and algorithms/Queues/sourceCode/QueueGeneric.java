public class QueueGeneric<V> {

	V[] queue;
	int size;
	int front;
	int rear;

	QueueGeneric(int capacity) {
		queue = (V[]) new Object[capacity];
		front = -1;
		rear = -1;

	}

	void clear() {
		front = -1;
		rear = -1;

	}

	boolean isEmpty() {
		if (front == -1 && rear == -1) {
			return true;
		}
		return false;
	}

	boolean isFull() {
		if (front == (rear + 1) % queue.length) {
			return true;
		}
		return false;
	}

	void enqueue(V item) {
		if (isEmpty()) {
			front = 0;
			rear = 0;
			queue[0] = item;

		} else if (isFull()) {
			return;
		} else {
			rear = (rear + 1) % queue.length;
			queue[rear] = item;
		}

	}

	V dequeue() {

		if (isEmpty()) {
			return null;
		} else if (rear == front) {
			clear();
			return null;
		} else {
			V temp = queue[front];
			front = (front + 1) % queue.length;
			return temp;
		}
	}

	V peek() {

		if (isEmpty()) {
			return null;
		} else {
			return queue[front];
		}
	}
}