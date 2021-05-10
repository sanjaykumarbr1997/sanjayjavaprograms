package assignments.doubt;

public class CalenderDemo {
	
public static void main(String[] args) {
		
		// for loop
		
		for(int i=1;i<=31;i++) {
			
			if(i>=1 && i<=7) {
				System.out.print(" "+i+" ");
				if(i==7) {
					System.out.println();
				}
				
			}
			else if(i>=8 && i<=14){
				
				if(i>=8 && i<=9) {
				System.out.print(" "+i+" ");
				}
				else {
					System.out.print(i+" ");
				}
				
				
				
				if(i==14) {
					System.out.println();
				}
			}
			
			else if(i>=15 && i<=21 ) {
				System.out.print(i+" ");
				if(i==21) {
					System.out.println();
				}
			}
			
			else if(i>=22 && i<=28 ) {
				System.out.print(i+" ");
				if(i==28) {
					System.out.println();
				}

			}
			
			else {
				System.out.print(i+" ");
			}
			
			
			
		}
		}	

}
