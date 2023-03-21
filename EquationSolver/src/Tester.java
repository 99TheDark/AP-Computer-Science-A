public class Tester {

	public static void main(String[] args) {

		Fun function = new Fun();
		EquationSolver eqs = new EquationSolver(0.000001);
		double solved = eqs.solve(function, 0.0, 1.0);

		System.out.println(solved + " ≈ 0.7400828044922853");

	}

}