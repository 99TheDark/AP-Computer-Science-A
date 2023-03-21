public class ModTimesDynamic {
	
	private int dividend;

	public static void main(String[] args) {
		
		ModTimesDynamic mtd = new ModTimesDynamic(9449);

		System.out.println("\nanswer: " + mtd.remainderDeterminer(24));

	}
	
	public ModTimesDynamic(int dividend) {
		
		this.dividend = dividend;
		
	}

	public int remainderDeterminer(int remainder) {

		int total = 0;
		
		for(int i = 1; i < dividend; i++) {
			
			int r = dividend % i;
			
			if(r == remainder) {
				
				System.out.println(i);
				
				total++;
				
			}
			
		}
		
		return total;

	}

}