
public class Test {

	public static void main(String[] args) {
		String [] students = {"Juan", "Abby", "Adrian", "Ed", "Carl", "Aaron", "Stef"};
		double [] avrgs = {78,99,98,79,89,87,97};
		
		System.out.println("The topnotcher is " + Topnotcher.getTop(students, avrgs));
	}

}
