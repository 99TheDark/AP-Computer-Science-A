import java.util.ArrayList;

public class Numerals {

	private ArrayList<Integer> numberList;

	public Numerals(int num) {

		numberList = new ArrayList<Integer>();

		int length = (Integer.toString(num)).length();

		for (int i = length - 1; i >= 0; i--) {

			int digit = (int) (num / Math.pow(10, i)) % 10;

			numberList.add(digit);

		}

	}

	public boolean increasesConsistently() {
		
		int last = -1;
		
		for(int i = 0; i < numberList.size(); i++) {
			
			int digit = numberList.get(i);
			
			if(digit <= last) {
				
				return false;
				
			}
			
			last = digit;
			
		}

		return true;

	}

}