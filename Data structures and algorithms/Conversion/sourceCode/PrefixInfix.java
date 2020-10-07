import java.util.Stack;

public class PrefixInfix {
	public String convert(String equation) {

		Stack<String> stack = new Stack<>();
		for (int i = equation.length() - 1; i >= 0; i--) {
			char x = equation.charAt(i);

			if (isOperator(x)) {
				String rand1 = stack.pop();
				String rand2 = stack.pop();
				String temp = "(" + rand1 + x + rand2 + ")";
				stack.push(temp);
			} else {
				stack.push(x + "");
			}
		}
		String result = stack.pop();
		return result;
	}

	boolean isOperator(char y) {
		switch (y) {
		case '+':
		case '-':
		case '/':
		case '*':
			return true;
		}
		return false;
	}
}