
public class ArrayMain {

	public static void main(String[] args) {
		
		String coffee [] = new String [5]; //array of 5 with an index of 4
			coffee[0] = "Barako";
			coffee[1] = "Alen";
			coffee[2] = "Java tite";
			coffee[3] = "Kopiko";
			coffee[4] = "Starbucks";


		System.out.println(coffee[3]); // accessing arrays knowing the length
		System.out.println(coffee[coffee.length-1]); //accessing arrays without knowing the length
		System.out.println(); //line break 
		System.out.println("The choices of the coffee are: "); //for loop of arrays for the choices of coffee
		for(int i=0; i<coffee.length;i++) {
			System.out.println(coffee[i]);
		}
		System.out.println();//line break
		System.out.println("The choices of the coffee are: ");
		for (String c : coffee) { //enhanced for loop while string c is creating a variable and coffee is the array
		System.out.println(c); //inside the c is the array coffee
		}
		
		//COPYING ARRAYS
		
	
	
	}

}
