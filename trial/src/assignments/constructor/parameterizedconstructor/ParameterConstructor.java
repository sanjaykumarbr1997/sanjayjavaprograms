package assignments.constructor.parameterizedconstructor;

public class ParameterConstructor {

	public static void main(String[] args) {
		
		Ipl ipl = new Ipl("RCB",14);
		System.out.println("Team name is :" + ipl.teamname);
		System.out.println("No of players in team  is " + ipl.noOfPlayers);

	}

}
