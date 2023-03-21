// Statistical simulation of craps

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RunCrapsStats extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5385525074178472384L;
	private MyCrapsGame game;
	private JTextField numberIn, statsOut;

	// Constructor
	public RunCrapsStats() {

		super("Craps test");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("Number of games to run:"));

		numberIn = new JTextField(5);
		numberIn.addActionListener(this);
		c.add(numberIn);

		statsOut = new JTextField(18);
		statsOut.setEditable(false);
		c.add(statsOut);

		game = new MyCrapsGame();

	}

	// Called when a number is entered in the numberIn text field
	public void actionPerformed(ActionEvent e) {

		String s = numberIn.getText();
		int nGames = Integer.parseInt(s);
		int result, gameCount = 0, winCount = 0;
		MyDie die1 = new MyDie();
		MyDie die2 = new MyDie();

		while (gameCount < nGames) {

			die1.roll();
			die2.roll();
			int total = die1.getNumDots() + die2.getNumDots();
			result = game.processRoll(total);
			if (result != 0) {
				gameCount++;
			}
			if (result > 0) winCount++;

		}

		numberIn.setText("");
		statsOut.setText(" Games: " + gameCount + " Wins: " + winCount);

	}

	public static void main(String args[]) {

		RunCrapsStats window = new RunCrapsStats();
		window.setBounds(100, 100, 300, 100);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setVisible(true);

	}

}
