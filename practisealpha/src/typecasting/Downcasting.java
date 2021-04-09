package typecasting;

public class Downcasting {
	
	public static void main(String[] args) {
		
		Parent p = new Child();
		p.name = "Anamika";
		
		Child c = (Child)p;
		c.age = 18;
		System.out.println(c.name);
		System.out.println(c.age);
		c.PrintData();
		p.PrintData();
		
	}

}
