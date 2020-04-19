
//without main argument
//java with JFRAME
import java.awt.FlowLayout; //import how thing are placed. default layout managing.

import javax.swing.JFrame; //basic windows features
import javax.swing.JLabel; //label is a line of text. simple images.

public class tuna extends JFrame {

	private JLabel item1;

	public tuna() {
		super("The title bar");
		setLayout(new FlowLayout());

		// actual item
		item1 = new JLabel("This is a sentence");

		item1.setToolTipText("Gonna show up on hover");
		add(item1);
	}

}
