
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*NaturalNumbers.includeNumber(-7);
		for(int num: NaturalNumbers.natNos) {
			System.out.print(num + " ");
		}
		*/
			//System.out.println(factorial(4));
			//System.out.println(fib(7));
			//System.out.println(factorial2(4));
			System.out.println(fib2(7));
			
	}

	//factorial
	static int factorial (int n ) {
		if (n==0) {
			return 1;
		
		}else if (n>0) {
			return n * factorial (n-1);
			
		}else {
			return -1;
		}
	}
	
	
	//fibonacci
	static int fib (int n) {
		if(n==0 || n ==1) {
			return n;
			
		}else if (n>1) {
			return fib(n-1)+fib(n-2);
		}else {
			return -1;
		}
		
	}
	
	//iterative
	
	static int factorial2(int n) {
		int p=1;
		for (int i = n;i>0;i--) {
			p =  p*i;
		}
		return p;
		
		}
	
	//recurssive
	static int fib2 (int n) {
		int x=0, y=1, z=0;
		int i = 2;
		while (i<n || i==n) {
			z = x + y;
			x = y;
			y = z;
			i++;
			
		}
	return z;
	}
	}
		