package typecasting;

public class Downcasting {

	public static void main(String[] args) {
		
		Parent p = new Child();
		Child c = (Child)p;
		
		c.name= "euro";
		c.age = 19;
		p.PrintData();
		c.PrintData();
		
		System.out.println(c.name);
		System.out.println(c.age);
	}

}
