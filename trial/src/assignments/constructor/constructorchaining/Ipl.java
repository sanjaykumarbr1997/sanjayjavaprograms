package assignments.constructor.constructorchaining;

public class Ipl {
	
	String teamname;
	int noOfPlayers;
	
	Ipl(){
		this("RCB",14);
		
	}
	
	
	Ipl(String teamname1){
		
		teamname = teamname1;
		
	}
	
	Ipl(String teamname1, int noOfPlayers1){
		
		this (teamname1);
		//teamname = teamname1;
		//noOfPlayers = noOfPlayers1;
		
		
		
	}
	
	
	
	
	
	

}
