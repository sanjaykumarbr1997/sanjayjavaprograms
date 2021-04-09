package instanceoperator;

public class Mobile {
	
	void play(Games g) {
		
		if(g instanceof PubG)
			System.out.println("playing pubg");
		
		else 
			System.out.println("playing candycrush");
	}

}
