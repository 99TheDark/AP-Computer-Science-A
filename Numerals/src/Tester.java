public class Tester {
	
	public static final void main(String[] args) {
		
		Numerals num1 = new Numerals(9);
		Numerals num2 = new Numerals(1478);
		Numerals num3 = new Numerals(1556);
		Numerals num4 = new Numerals(1724);
		Numerals num5 = new Numerals(86521);
		
		System.out.println(num1.increasesConsistently());
		System.out.println(num2.increasesConsistently());
		System.out.println(num3.increasesConsistently());
		System.out.println(num4.increasesConsistently());
		System.out.println(num5.increasesConsistently());
		
		// It works, yay!
		
	}

}