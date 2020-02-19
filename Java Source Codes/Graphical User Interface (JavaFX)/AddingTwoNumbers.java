import javax.swing.JOptionPane;

public class AddingTwoNumbers {

	public static void main(String[] args) {
		// GUI

		String firstNumber = JOptionPane.showInputDialog("Enter first number");
		String secondNumber = JOptionPane.showInputDialog("Enter second number");

		int num1 = Integer.parseInt(firstNumber);
		int num2 = Integer.parseInt(secondNumber);

		int sum = num1 + num2;

		JOptionPane.showMessageDialog(null, "The answer is " + sum, "ANSWER", JOptionPane.PLAIN_MESSAGE);
		// first is the position of the message, the message itself, the title bar,
		// Message that's gonna pop up

	}

}
