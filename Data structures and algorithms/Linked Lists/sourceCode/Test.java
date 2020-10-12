
public class Test {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.addAtStart("one");
		list.addAtStart("two");
		list.addAtStart("three");
		
		list.addAtEnd("four");
		list.addAtEnd("five");
 
		list.addAt(2, "six");
	//	list.deleteAt(3);
		list.deleteAt(0);
		list.display();

	}

}
 