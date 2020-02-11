package InfoSheet;

public class InfoSheet {
	String opener = "Hello! You can choose a variety of phone! This will depend on your likes and specifications.";
//pasa mo nalang yung open sa psvm
	String cpu, gpu;
	String displayType, resolution;
	String versionType;
	int memory, rom;
	int screenSize;

	int addTwoProducts(int productOne, int productTwo) {

		int allProducts = productOne + productTwo;
		return allProducts;
	}

	void displayPrice(int x, int y) {
		System.out.println("The price is: " + x);
		System.out.println("Final price: " + y);
	}
	// sa psvm indicate mo nalang yung mga specs ng devices after matapos thanks.
}
