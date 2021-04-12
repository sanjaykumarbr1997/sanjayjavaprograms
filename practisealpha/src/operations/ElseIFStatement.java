package operations;

public class ElseIFStatement {
	
	static int a =76;

	public static void main(String[] args) {
		
		if((a>0) && (a<50)){
			System.out.println("its lesser than 50");
		}
		
		else if((a>0)&&(a<60)) {
			System.out.println("its lesser than 60");
		}
		else if ((a>0)&&(a<55)) {
			System.out.println("lesser than 55");
		}
		else {
			System.out.println("dude what are you entering");
		}

	}

}
