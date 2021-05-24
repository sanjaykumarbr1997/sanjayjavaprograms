package assignments.exceptions.exceptions;

public class AtmMachine {
	
	void draw(int amount)  {
		
		AtmException ae = new AtmException();
		if(amount>50000) {
			throw ae;
		}
		else {
			System.out.println("please take your cash");
		}
	}

}
