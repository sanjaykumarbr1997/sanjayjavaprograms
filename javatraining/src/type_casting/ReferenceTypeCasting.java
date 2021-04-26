package type_casting;

public class ReferenceTypeCasting {

	public static void main(String[] args) {
		Parent p = new Child();//Upcasting
		
		//Child c = new Parent();  --not possible:error
		Child c = (Child)p;   //-->Downcasting
		
		p.method1();
		c.method1();
		c.method2();           //after downcasting child member can access all members
		
		
		
		
		
		
		
		


	}

}
