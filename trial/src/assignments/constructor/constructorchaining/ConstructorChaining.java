package assignments.constructor.constructorchaining;

public class ConstructorChaining {

	public static void main(String[] args) {
		
		Ipl ipl = new Ipl();
		Ipl ipl1 = new Ipl("CSK",12);
		System.out.println("Team name is :" + ipl.teamname);
		System.out.println("No of players in team  is " + ipl.noOfPlayers);
		System.out.println("Team name :" +ipl1.teamname);
		System.out.println("No of players in team  is " + ipl1.noOfPlayers);
		

	}

}
