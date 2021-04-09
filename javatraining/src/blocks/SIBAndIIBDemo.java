package blocks;

public class SIBAndIIBDemo {
	static int x ;
	int y;
	
	
	{
		System.out.println("i am an instance block");
		y=150;
		
	}
	
	{
		System.out.println("i am 2nd instance block");
		
	}
	static{
		System.out.println("i am a static block");   // always static starts 1st then instance then constructor
		                                             // then constructor in order of precedence
		x=100;
		
	}
	static{
		System.out.println("I am 2nd static block");
	}
	
	public SIBAndIIBDemo() {
		System.out.println("i am a constructor");
	}

	public static void main(String[] args) {
		
		SIBAndIIBDemo sibAndIIBDemo = new SIBAndIIBDemo();
		
		System.out.println("Y:"+sibAndIIBDemo.y);
		System.out.println( "X:"+SIBAndIIBDemo.x);
		
		

	}

}
