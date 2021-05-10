package assignments.doubt;
import java.util.Arrays;

public class DoubtDemo {

	public static void main(String []args){

		 
		char lst[] = {'A','2','b','5','C','3','d','9','E','2'};
		
		
		for(char l1:lst) {
			if(l1=='2') {
				System.out.print(l1);
			}
		}
		for(char l1:lst) {
			if(l1=='3') {
				System.out.print(l1);
			}
		}
		for(char l1:lst) {
			if(l1=='5'||l1=='9') {
				System.out.print(l1);
			}
		}
		for(char l1:lst) {
			if(l1=='A'||l1=='C'||l1=='E') {
				System.out.print(l1);
			}
		}
		
		for(char l1:lst) {
			if(l1=='b'||l1=='d') {
				System.out.print(l1);
			}
		}
		
	

		  }

}
