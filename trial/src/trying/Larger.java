package trying;

public class Larger {
	
	public static void main(String[] args) {
		
		int a = 30;
		int b = 45;
		int c = 45;
		
		if ((a>b) && (a>c)) {
			System.out.println("a is greater");
		}
		
		else if ((b>c) && (b>a)){
			System.out.println("b is greater");
			
		}
		else if ((c>a) && (c>b)) {
			System.out.println("c is greater");
		}
		else {
			System.out.println("two integers have the same value");
		}

	}

}
