public class EquationSolver {

	private double precision;

	public EquationSolver(double precision) {

		this.precision = precision;

	}

	public double solve(Fun func, double a, double b) {

		double m = (a + b) / 2;
				
		if(b - a < precision) return m;
				
		if (func.f(m) < 0) {

			return solve(func, m, b);

		} else {

			return solve(func, a, m);

		}

	}

}