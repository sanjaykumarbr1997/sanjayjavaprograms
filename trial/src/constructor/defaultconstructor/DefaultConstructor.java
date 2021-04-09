package constructor.defaultconstructor;

public class DefaultConstructor {

	public static void main(String[] args) {
		
		IplTeam team = new IplTeam();
		IplTeam team1= new IplTeam("CSK");
		IplTeam team2= new IplTeam("RCB",14);
		System.out.println("team name is"+ team.name);
		System.out.println("no of players"+team.noOfPlayers);
		System.out.println("team name is"+ team1.name);
		System.out.println("location"+team1.noOfPlayers);
		System.out.println("team name is"+ team2.name);
		//System.out.println("team location is "+team2.location);
	
		
	
		

	}

}
