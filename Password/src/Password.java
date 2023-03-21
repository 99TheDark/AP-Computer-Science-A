import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static boolean isValid(String password) {

		if (password.length() > 16 || password.length() < 8) return false;

		if (!(hasUpper(password) && hasLower(password) && hasDigit(password))) return false;

		return true;

	}

	public static String makePassword(String phrase, int n) {
		
		StringBuilder sb = new StringBuilder(n + "");
		String val = sb.reverse().toString();
		
		return makePasswordLetters(phrase) + val;

	}

	public static String makePasswordLetters(String phrase) {
		
		String s = "";
		
		String[] words = phrase.split(" ");
		
		for(String word : words) {
			s += word.charAt(0);
		}
		
		return s;

	}

	public static boolean hasUpper(String password) {

		Pattern lower = Pattern.compile("[A-Z]");
		Matcher matcher = lower.matcher(password);
		return matcher.find();

	}

	public static boolean hasLower(String password) {

		Pattern lower = Pattern.compile("[a-z]");
		Matcher matcher = lower.matcher(password);
		return matcher.find();

	}

	public static boolean hasDigit(String password) {
		
		Pattern lower = Pattern.compile("[0-9]");
		Matcher matcher = lower.matcher(password);
		return matcher.find();

	}

}