import java.text.DecimalFormat;

public class TestDie {
	
	public static void main(String[] args) {
		
		int rollCount = 10000;
		int numCheck = 5;
		
		MyDie die = new MyDie();
		
		System.out.println("TEST 1: Roll the dice three times");
		die.roll();
		System.out.println("  First roll: " + die.getNumDots());
		die.roll();
		System.out.println("  Second roll: " + die.getNumDots());
		die.roll();
		System.out.println("  Third roll: " + die.getNumDots() + "\n");
		
		System.out.println("TEST 2: Roll the dice many times and check how often");
		System.out.println("        particular number comes up (should be close to 16.67%)");
		System.out.println("  Number of test rolls: " + rollCount);
		System.out.println("  Die number to check: " + numCheck + "\n");
		
		int successCount = 0;
		for(int i = 0; i < rollCount; i++) {
			
			die.roll();
			
			if(die.getNumDots() == numCheck) {
				
				successCount++;
				
			}
			
		}
		
		DecimalFormat df = new DecimalFormat("#0.00");
		
		double percent = (double) successCount / rollCount * 100;
				
		System.out.println("  Die " + numCheck + " came up " + successCount + " times (" + df.format(percent) + " %)");
		
	}
	
}