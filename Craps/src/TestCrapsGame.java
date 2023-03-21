// Interactive test for Craps

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class TestCrapsGame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private MyCrapsGame game;
	private JTextField input;
	private JTextArea display;

	// Constructor
	public TestCrapsGame() {

		super("Test Craps Game");
		
		// Generates list of numbers 1 to 10
		List<Integer> ints = IntStream.range(1, 11).boxed().collect(Collectors.toList());

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("Next roll:"));
		input = new JTextField(5);
		input.setBackground(Color.YELLOW);
		input.addActionListener(this);
		c.add(input);

		display = new JTextArea(10, 20);
		display.setEditable(false);
		display.setBackground(Color.WHITE);
		c.add(new JScrollPane(display, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER));

		game = new MyCrapsGame();

	}

	// Called when a number is entered into the JTextField input
	//
	public void actionPerformed(ActionEvent e) {

		String s = input.getText().trim();
		int total = Integer.parseInt(s);
		int result = game.processRoll(total);
		int point = game.getPoint();
		input.setText("");
		display.append(total + ":  Result = " + result + " Point = " + point + "\n");

	}

	public static void main(String[] args) {

		TestCrapsGame window = new TestCrapsGame();
		window.setBounds(100, 100, 300, 240);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setVisible(true);

	}

}