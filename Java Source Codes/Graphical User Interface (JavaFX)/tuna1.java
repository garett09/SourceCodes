import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class tuna1 extends JFrame {

	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;

	public tuna1() {
		super("The Title");
		setLayout(new FlowLayout());

		item1 = new JTextField(10);
		add(item1);

		item2 = new JTextField("Enter text here");
		add(item2);

		item3 = new JTextField("Uneditable", 20);
		item3.setEditable(false);
		add(item3);

		passwordField = new JPasswordField("mypass");
		add(passwordField);

		TheHandler handler = new TheHandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);

	}

	private class TheHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			String name = "";

			if (event.getSource() == item1) {
				name = String.format("Field 1: %s", event.getActionCommand());
			} else if (event.getSource() == item2) {
				name = String.format("Field 2: %s", event.getActionCommand());
			} else if (event.getSource() == item3) {
				name = String.format("Field 3: %s", event.getActionCommand());
			} else if (event.getSource() == passwordField) {
				name = String.format("password field is :  %s", event.getActionCommand());
			}

			JOptionPane.showMessageDialog(null, name);
		}
	}

}
