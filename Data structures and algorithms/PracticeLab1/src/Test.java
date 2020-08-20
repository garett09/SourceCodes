import java.util.ArrayList;
 public class Test {

	public static void main(String[] args) {
		Arrange d1 = new Arrange (8,20,2020);
		Arrange d2 = new Arrange (7,19,2020);
		
		if(d1.compareTo(d2)== 1) {
			System.out.println(d1 + "is later than "+ d2);
		}else if(d1.compareTo(d2)== -1) {
			System.out.println(d1+ "is earlier than "+ d2);
		}else {
			System.out.println(d1 +"and "+ d2 + " are the same dates.");
		}
	}
}
