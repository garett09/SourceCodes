
public class Test {

	public static void main(String[] args) {
		InfoSheet sheet1 = new InfoSheet("Adrian", "Male", 19);
		Computation sheet2 = new Computation("Abby", "Female", 21, 1.64, 64);
		// method overloading
		System.out.print(sheet1.getName());
		System.out.print(" " + sheet1.getAge());
		System.out.print(" " + sheet1.getGender() + "\n");
		System.out.println(sheet2.getHeight());
		System.out.println(sheet2.getWeight());
		sheet2.computation();
		System.out.println();

		System.out.println("With method overloading ");
		System.out.println();

		sheet1.setName("Eduardo");
		sheet1.setAge(25);
		sheet1.setGender("Male");
		System.out.print(sheet1.getName());
		System.out.print(" " + sheet1.getAge());
		System.out.print(" " + sheet1.getGender() + "");

		InfoSheet sheet3[] = new InfoSheet[1];
		sheet3[0] = new Computation("Joy", "Female", 25, 1.89, 154);

		for (int x = 0; x < 1; ++x) {
			sheet3[x].display();
		}
	}
}
