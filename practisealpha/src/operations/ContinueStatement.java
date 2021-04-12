package operations;

public class ContinueStatement {
	
	
	int add(int a , int b) {
		int z= a+b;
		return z;
		
	}

	public static void main(String[] args) {
		
		ContinueStatement cs = new ContinueStatement();
		
		System.out.println(cs.add(10, 20));
		
		
		/*int i=0;
		for (i=0;i<7;i++) {
			
			
			if (i==4) {
				//System.out.println("Skipping 4");
				
				return ;
			}
			System.out.println(i); 
			
		} */

	}

}
