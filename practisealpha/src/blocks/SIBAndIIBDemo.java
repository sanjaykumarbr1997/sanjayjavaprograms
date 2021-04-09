package blocks;

public class SIBAndIIBDemo {
	
	static int x;
	int y;
	
	
	static {
		x = 100;
		System.out.println("I am first static block");
	}
	
	static {
		System.out.println("i am second static block");
	}
	
	{
		y=250;
		System.out.println("I am first static block");
	}
	
	{
		System.out.println("I am second static block");
	}
	
	public SIBAndIIBDemo() {
		System.out.println("i am a constructor");
	}
	
	public static void main(String[] args) {
		
		SIBAndIIBDemo sibAndIIBDemo = new SIBAndIIBDemo();
		
		System.out.println("Y:"+sibAndIIBDemo.y);
		System.out.println("X:"+SIBAndIIBDemo.x);
	}

}
