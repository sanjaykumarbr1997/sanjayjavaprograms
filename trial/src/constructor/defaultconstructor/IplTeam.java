package constructor.defaultconstructor;

public class IplTeam {
	
	String name;
	int noOfPlayers;
	
	IplTeam(){
		this("MI",13);
		
	}
	
	IplTeam(String name2){
		name = name2;
	}
	IplTeam(String name1,int noOfPlayers1){
		
		this("DC");
		
		//name = name1;
		//noOfPlayers= noOfPlayers1;
		
		
	}
	
	

}
