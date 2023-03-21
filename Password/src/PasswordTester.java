public class PasswordTester {
	
	public static void main(String[] args) {
		
		// Tester
		System.out.println(Password.hasDigit("abcd") + " - should be false");
		System.out.println(Password.hasDigit("abcd123") + " - should be true");
		System.out.println(Password.hasDigit("54") + " - should be true");
		
		System.out.println(Password.hasUpper("xyz") + " - should be false");
		System.out.println(Password.hasUpper("ART") + " - should be true");
		System.out.println(Password.hasUpper("aBcd123FgN") + " - should be true");
		
		System.out.println(Password.hasLower("aBcd123FgN") + " - should be true");
		System.out.println(Password.hasLower("hand") + " - should be true");
		System.out.println(Password.hasLower("DANCING123") + " - should be false");
		
		System.out.println(Password.makePasswordLetters("Then took the other, as just as fair"));
		System.out.println(Password.makePassword("It's not all it's cracked up to be.", 2008));
		
		System.out.println(Password.isValid("ILikeSoccer") + " - should be false");
		System.out.println(Password.isValid("ILoveBaseball123") + " - should be true");
		
	}

}