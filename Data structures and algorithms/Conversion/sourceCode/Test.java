
public class Test {

	public static void main(String[] args) {
		InfixPrefix infixToPrefix = new InfixPrefix();
		PostfixInfix postfixToInfix = new PostfixInfix();
		PrefixInfix prefixtToInfix = new PrefixInfix();
		PrefixPostfix prefixToPostfix = new PrefixPostfix();

		// PREFIX TO INFIX CONVERTION
		String convert = "*+AB+CD";
		System.out.println("Prefix Expression: " + convert);
		System.out.println("Infix Expression: " + new PrefixInfix().convert(convert));

		// PREFIX TO POSTFIX
		String prefix = "+10*3/5-164";
		System.out.println("Prefix Expression: " + prefix);
		System.out.println("Postfix Expression: " + new PrefixPostfix().convert(prefix));

		// POSTFIX TO INFIX
		String postfix = "AB+";
		System.out.println("Prefix Expression: " + postfix);
		System.out.println("Postfix Expression: " + postfixToInfix.getInfix(postfix));

		// INFIX TO PREFIX

		String infixPrefix = "53+43";
		System.out.println("Prefix Expression: " + infixPrefix);
		System.out.println("Postfix Expression: " + infixToPrefix.infixToPreFix(infixPrefix));
	}

}
