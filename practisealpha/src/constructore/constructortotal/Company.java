package constructore.constructortotal;

public class Company {

	String name;
	int noOfBranches;
	
	Company(){
		
		this("sony",270);
		 
	
	} 
	
	Company(String name1){
		name = name1;
	}
	
	
	
	Company(String name1, int noOfBranches1){
		this("toshiba");
		
		/*name = name1;
		noOfBranches = noOfBranches1; */
	}
}
