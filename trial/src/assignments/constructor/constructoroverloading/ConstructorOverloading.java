package assignments.constructor.constructoroverloading;

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Ipl ipl = new Ipl();
		Ipl ipl1 = new Ipl("CSK",12);
		Ipl ipl2 = new Ipl("RCB");
		System.out.println("Team name is :" + ipl.teamname);
		System.out.println("No of players in team  is " + ipl.noOfPlayers);
		System.out.println("Team name :" +ipl1.teamname);
		System.out.println("No of players in team  is " + ipl1.noOfPlayers);
		System.out.println("team name is :"+ ipl2.teamname);
		

	}

}
