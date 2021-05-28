package type_casting;

public class ReferenceTypeCasting {

	public static void main(String[] args) {
		//Parent p = new Child();//Upcasting
		
		Parent p = new Parent();
		
		Child c = new Child();
		
		
		//Child c = (Child)p;   //-->Downcasting
		
		p.method1();
		c.method1();
		c.method2();           //after downcasting child member can access all members
		System.out.println("------");
		p.method1();
		p.parentp();
		
		c.method1();
		c.method2();
		c.parentp();
		c.child();
		
		
		/*Method 1 of super class 
Method1  from child class
Method from child class
------
Method 1 of super class 
Parent bro
Method1  from child class
Method from child class
*/
		
		
		
		
		
		
		
		
		


	}

}
