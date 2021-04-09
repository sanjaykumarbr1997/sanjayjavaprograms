package type_casting;

public class ReferenceTypeCasting {

	public static void main(String[] args) {
		Parent p = new Child();//Upcasting
		
		// Child c = new Parent();  --not possible:error
		Child c = (Child)p;   //-->Downcasting
		//do this Parent p = new Parent(); , Child c = (Child)p not possible
		
		
		
		
		
		


	}

}
