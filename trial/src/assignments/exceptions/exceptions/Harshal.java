package assignments.exceptions.exceptions;

public class Harshal {

	public static void main(String[] args) {
		
		AtmMachine am = new AtmMachine();
		
		int amount = 70000;
		
		try {
			am.draw(amount);
		}/* catch (AtmException  | NullPointerException e) {
			
			System.out.println("Exception caught");
		} */
		
		finally {
			System.out.println("Finally block is called");
		}

	}

}
