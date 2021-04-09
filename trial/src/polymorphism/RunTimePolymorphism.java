package polymorphism;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		HDFC hdfc = new HDFC();
		Axis axis = new Axis();
		
		
		System.out.println(hdfc.InterestRate());
		System.out.println(axis.InterestRate());
		
		
		

	}

}
