import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UnitTests {

	private static Fun fun1, fun2, fun3;
	private static EquationSolver equationSolver1;

	@BeforeAll
	static void setUp() {

		initializeEquationSolver();

	}

	static void initializeEquationSolver() {

		fun1 = new Fun();
		fun2 = new Fun();
		fun3 = new Fun();
		
		equationSolver1 = new EquationSolver(0.000001);

	}

	@Test
	void test1a() {

		Fun.r = 0.3;
		assertEquals(0.7400829315185548, equationSolver1.solve(fun1, 0.7, 0.8));

	}

	@Test
	void test1b() {

		Fun.r = 0.8;
		assertEquals(0.9457411766052246, equationSolver1.solve(fun2, 0.0, 1.0));

	}

	@Test
	void test1c() {

		Fun.r = 20.0;
		assertEquals(2.1147424876689915, equationSolver1.solve(fun3, 0.2, 5.3));

	}

}
