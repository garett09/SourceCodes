
public class Runner {

	public static void main(String[] args) {
		Queue q = new Queue ();
		q.enQueue(6);
		q.enQueue(3);
		q.enQueue(7);
		q.enQueue(10);
		
		q.deQueue();
		q.deQueue();
		
		q.enQueue(11);
		q.enQueue(15);
		q.show();
	}

}
