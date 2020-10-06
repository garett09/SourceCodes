
public class Runner {

	public static void main(String[] args) {
		QueueGeneric<Virus> viruses = new QueueGeneric <>(10);

		Virus v1 = new Virus("Corona Virus", 3);
		Virus v2 = new Virus("Ed Virus", 2);
		Virus v3 = new Virus("Aaron Virus", 7);
		Virus v4 = new Virus("Carl Virus", 6);

		viruses.enqueue(v1);
		viruses.enqueue(v2);
		viruses.enqueue(v3);
		viruses.enqueue(v4);
		System.out.println(viruses.peek());

	}

}
