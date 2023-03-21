public class PongBallTest {

	public static void main(String[] args) {

		PongBall ball = new PongBall(10, 20, 2, 4);

		System.out.println("x should be 10, x is: " + ball.getX());
		System.out.println("y should be 20, y is: " + ball.getY());
		System.out.println();

		ball.move();
		System.out.println("x should be 12, x is: " + ball.getX());
		System.out.println("y should be 24, y is: " + ball.getY());
		System.out.println();

	}

}