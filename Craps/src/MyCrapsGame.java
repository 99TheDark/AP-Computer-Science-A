
// Implements the game of Craps logic

public class MyCrapsGame {

	private int point = 0;

	/**
	 * Calculates the result of the next dice roll in the Craps game.
	 * 
	 * The input parameter total is the sum of the dots on two dice. The member variable point is set to: the saved total, if the game continues, 0, if the game has
	 * ended.
	 * 
	 * Function returns 1 if player won, -1 if player lost, 0 if player continues rolling.
	 */
	public int processRoll(int total) {

		int result = 0;

		if (point == 0) { // process first roll

			if (total == 2 || total == 3 || total == 12) {

				result = - 1;

			} else if (total == 11 || total == 7) {

				result = 1;

			} else {

				point = total;

			}

		} else { // if (point > 0) -- process subsequent roll

			if (total == point) {

				result = 1;

			} else if (total == 7) {

				result = - 1;

			} else {

				result = 0;

			}

		}
		
		if(Math.abs(result) == 1) {
			
			point = 0;
			
		}

		return result;

	}

	/**
	 * Returns the saved point
	 */
	public int getPoint() {

		return point;

	}

}