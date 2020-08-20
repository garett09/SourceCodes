import java.util.*;
public class Integers {
	ArrayList <Integer> nums = new ArrayList();
	
	static int computeSum(ArrayList<Integer> ints) {
		int sum = 0;
		for (int num: ints) {
			sum +=num;
			
		}
		return sum;
	}

}
