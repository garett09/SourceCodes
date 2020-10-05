
public class Runner {

	public static void main(String[] args) {
		Queue q = new Queue ();
//		q.enQueue(6);
		q.enQueue(3);
		q.enQueue(7);
		q.enQueue(10);
		q.enQueue(69);	
		q.enQueue(69);
		
		q.deQueue();
		q.deQueue();
//		
//		q.enQueue(11);
//		q.enQueue(15);
//		
//		q.enQueue(69);
//		q.enQueue(81);
		
		System.out.println(q.isFull());
		
		System.out.println("Size " + q.getSize());
		q.show();
		
		
	}

}
