package project2;

public class TestClass {

	public static void main(String[] args) {
		TestProject t1 = new TestProject();
		t1.hardDiskSize = "1 TB";
		t1.screenResolution = "3840x2160";
		t1.screenSize = 21;
		t1.addTwoNums(2, 7);
		t1.displayTwoNums(6, 7);
		System.out.println("Resolution " + t1.screenResolution);

		TestProject t2 = new TestProject();
		t2.displayTwoNums(1045, 456845);

		/*
		 * encapsulation also known as data hiding
		 * 
		 */

	}

}
