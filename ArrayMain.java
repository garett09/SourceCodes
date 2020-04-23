import java.util.Arrays;
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
			int original[] = {1,2,3,4,5};
		int temporary [] = {10,9,8,7,6,5,4,3,2,1};
		System.arraycopy(original,0,temporary,0,original.length);
		//original file, start of the index (orig) , file that will be copied INTO, start where it will be replaced,LENGHT of the array that will be copied from the ORIGINAL to the TEMPORARY
		original=temporary;
		temporary=null;
		System.out.println("Printing the new array");
		for(int new1 : original) {
			System.out.print(new1);
		}
		System.out.println();
		System.out.println();
		System.out.println();
	//binary search
		int [] nums  = new int [] {8,4,2,7,15,19,30,1,3,9,392,-50,0};
		int numToFind = -50; //the number to find in the array
		//linear search
		for(int i = 0; i < nums.length;i++) {
			int val = nums[i];
			if(val==numToFind) {
				System.out.println("We found the position at: " + i);
			}
		}
		
		
		System.out.println();
		System.out.println();
		
		//binary searching
		Arrays.sort(nums);//sorting arrays 
		System.out.println(Arrays.toString(nums));// need toString because you can't print an array in a print line
		int position = Arrays.binarySearch(nums, numToFind); //binary searching  comparing the content of array nums and the number to find
		System.out.println("Binary Search found it at:" + position);
		System.out.println();
		System.out.println();
		System.out.println();
		
		//String API Classes
		String a = new String ("now is");
		String b = new String ("the time");
		String c = new String (" the");
		//position starts at 0, length starts at 1
		System.out.println(a.length()); //measures the length of the string including spaces
		System.out.println(a.substring(2, 5)); //extract a portion of the string
		System.out.println(a.charAt(4)); //used to find the character in any string position
		System.out.println(b.startsWith("the"));//check if the it starts with the string mentioned
		System.out.println(a.indexOf("is")); // //searches the index of the string a
		System.out.println(a.concat(c)); //concatenates the string
		System.out.println(b.replace("t", "T")); //replaces the character in the string
		String results [] = a.split(" "); //splits the text
		for(String r: results) {
			System.out.print(r);
		}
		System.out.println(b.equals(c)); //compares if they are exactly alike
		
	
	
	}

}
