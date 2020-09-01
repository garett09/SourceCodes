class Test {
	/*
	static int n1=0, n2=1, n3=0;
	static void seq(int count) {
		if (count>3) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
			seq(count-1);
		}
	}
	*/
	/*static int fun (int[] A, int n) {
		int x;
		if (n==1) {
			return A[0];
		}else {
			x=fun(A, n-1);
		}
		if (x>A[n-1]) {
			return x;
		} else {
			return A[n-1];
		}
	}
	*/
	/*static int countMe(int [] nums) {
		int count = 0;
		for (int i=0; i< nums.length-1;i++) {
			if (nums[i] ==9&& nums[i+1] ==2) {
				count++;
			}
		}
		return count;
	}*/
	/*static int foo(int [] nums) {
		int count = 0;
		for (int i=0; i< nums.length-1;i++) {
			if (nums[i] ==6) {
				if (nums[i+1] ==6&& nums[i+1] ==7)
				count++;
			}
		}
		return count;
	}
	*/
	static String expose (String str) {
		String result = " ";
		for (int i=0; i<str.length(); i++) {
			result = result + str.substring(0, i+1);
		}
		return result;
	}
	
	public static void main (String [] args) {
		//int test = 3;
		//printFun(test);
		//int count = 7;
		//System.out.println(n1+ " " +n2);
		//s/eq(count-2);
		//int []arr = {4,7,3,2,1};
		int []nums = {4,7,1,9,2,4,5,2,9,5,8};
		//System.out.println(fun(arr,5));
		//System.out.println(countMe(nums));
		//System.out.println(foo(new int[] {5,3,6,7,6,3,6,6,4}));
		System.out.println(expose("faith"));
		
	}
	
	
	
	/*static void printFun (int test) {
		if (test <1)
			return;
		else {
			System.out.printf("%d ", test);
			printFun(test-1);
		
			System.out.printf("%d ", test);
			return;
		}
	}
	*/
	

}
