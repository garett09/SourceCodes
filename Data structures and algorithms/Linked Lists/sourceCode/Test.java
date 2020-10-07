
public class Test {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.addAtEnd("one");
		list.addAtEnd("eight");
		list.addAtEnd("three");
		list.addAtStart("four");
		list.addAtStart("seven");
		list.addAtStart("eleven");
		
		list.addAt(5, "sixty-nine");
		list.deleteAt(1);
		list.display();

	}

}
