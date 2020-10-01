
public class Test {

	public static void main(String[] args) {
		String str = "Hello 2ISA!";
		char[]tokens = str.toCharArray();
		//Stack stack= new Stack (25);
		StackGeneric<Character> stack = new StackGeneric<>(20);
		for(Character c: tokens) {
			stack.push(c);
		}
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//System.out.println(stack.peek());
		//System.out.println(stack.isEmpty());
		//System.out.println(stack.isFull());
	
	}

}


