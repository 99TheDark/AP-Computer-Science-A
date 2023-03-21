public class PongBall {
	
	private int x, y, xVel, yVel;

	public PongBall(int x, int y, int xVel, int yVel) {
		
		this.x = x;
		this.y = y;
		this.xVel = xVel;
		this.yVel = yVel;
		
	}
	
	public int getX() {
		
		return x;
		
	}
	
	public int getY() {
		return y;
	}
	
	public void bounceX() {
		
		xVel *= -1;
		
	}
	
	public void bounceY() {
		
		yVel *= -1;
		
	}
	
	public void move() {
		
		x += xVel;
		y += yVel;
		
	}
	
}