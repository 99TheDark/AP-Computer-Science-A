// Represents a die with six faces

public class MyDie {

	private int numDots;

	// Sets numDots to a random integer from 1 to 6
	public void roll() {

		// TODO: implement this method
		
		numDots = (int) (Math.random() * 6) + 1;
		
	}

	// Returns numDots
	public int getNumDots() {

		return numDots;

	}

}
