// Represents the craps table with two rolling dice

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.Timer;

/*
public class CrapsTable {
	private DisplayPanel display;
	private MyCrapsGame game;
	private MyDie die1, die2;

	// Constructor
	public CrapsTable(DisplayPanel displ)
	{
		display = displ;
		game = new MyCrapsGame();
	}

	// Rolls the dice
	public void rollDice()
	{
		die1.roll();
		die2.roll();
		int total = die1.getNumDots() + die2.getNumDots();
		int result = game.processRoll(total);
		int point = game.getPoint();
		display.update(result, point);
	}

	public boolean diceAreRolling()
	{
		return false;
	}
}
*/

public class CrapsTable extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8140918837783356578L;
	private MyRollingDie die1, die2;
	private final int delay = 20;
	private Timer clock;
	private MyCrapsGame game;
	private DisplayPanel display;

	// Constructor
	public CrapsTable(DisplayPanel displ) {

		setBackground(Color.green);
		setBorder(new LineBorder(Color.ORANGE.darker(), 3));
		display = displ;
		game = new MyCrapsGame();
		die1 = new MyRollingDie();
		die2 = new MyRollingDie();
		clock = new Timer(delay, this);

	}

	// Rolls the dice (called when the "Roll" button
	// is clicked)
	public void rollDice() {

		MyRollingDie.setBounds(3, getWidth() - 3, 3, getHeight() - 3);
		die1.roll();
		die2.roll();
		clock.start();

	}

	// Processes timer events
	public void actionPerformed(ActionEvent e) {

		if (diceAreRolling()) {

			if (!clock.isRunning()) clock.restart();
			if (die1.isRolling()) die1.avoidCollision(die2);
			else if (die2.isRolling()) die2.avoidCollision(die1);

		} else {

			clock.stop();
			int total = die1.getNumDots() + die2.getNumDots();
			int result = game.processRoll(total);
			int point = game.getPoint();
			display.update(result, point);

		}

		repaint();

	}

	// returns true if dice are still rolling; otherwise
	// returns false
	public boolean diceAreRolling() {

		return die1.isRolling() || die2.isRolling();

	}

	// Called automatically after a repaint request
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		die1.draw(g);
		die2.draw(g);

	}

}
