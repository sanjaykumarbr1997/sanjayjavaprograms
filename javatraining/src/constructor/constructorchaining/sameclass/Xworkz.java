package constructor.constructorchaining.sameclass;

public class Xworkz {
	
	String location;
	int noOfStudents;
	
	Xworkz(){
		
		this("Bangalore",500);
		
	}
	
	Xworkz(String location1 ){
		location = location1;
	}
	
	Xworkz(String location1, int noOfStudents1){
		this(location1);
	
		//location = location1;
		//noOfStudents= noOfStudents1;
		
		
	}
	

}
