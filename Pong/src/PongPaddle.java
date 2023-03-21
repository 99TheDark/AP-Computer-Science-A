public class PongPaddle {

	private int x, y, width, height;

	public PongPaddle(int y, int x, int width, int height) {

		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}

	public int getLeftX() {

		return x;

	}

	public int getRightX() {

		return x + width;

	}

	public int getTopY() {

		return y;

	}

	public int getBottomY() {

		return y + height;

	}

	public void moveDown(int dist) {

		y += dist;

	}

	public void moveUp(int dist) {

		y -= dist;

	}

}