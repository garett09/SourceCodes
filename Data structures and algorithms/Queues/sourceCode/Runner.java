
public class Runner {

	public static void main(String[] args) {
		QueueGeneric<Virus> viruses = new QueueGeneric <>(10);

//		Virus v1 = new Virus("Corona Virus", 3);
//		Virus v2 = new Virus("Ed Virus", 2);
//		Virus v3 = new Virus("Aaron Virus", 7);
//		Virus v4 = new Virus("Carl Virus", 6);

		viruses.enqueue(new Virus("white", 7));
		viruses.peek();
		
//		viruses.enqueue(new Virus("grey", 3));
//		viruses.dequeue();
//		
//		viruses.enqueue(new Virus("black", 7456));
//		viruses.peek();
//		viruses.enqueue(new Virus("blue", 234));
//		System.out.println(viruses.peek().size + " " + viruses.dequeue().name);
//		viruses.dequeue();
		//viruses("white", 7);

		

		//System.out.println(viruses.peek().name + " " + viruses.dequeue().size);

	}

}
