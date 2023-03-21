

public class PongScore {
	
	private int points;
	
	public PongScore() {
		
		points = 0;
		
	}
	
	public int getScore() {
		
		return points;
		
	}
	
	public void scorePoints(int points) {
		
		this.points += points;
		
	}

}