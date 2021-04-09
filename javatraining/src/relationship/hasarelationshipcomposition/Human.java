package relationship.hasarelationshipcomposition;

public class Human {
	String name = "Robert";
	String location = "Bangalore";
	Heart heart = new Heart();
	
	String getHeartDetails() {
		return heart.rate;
	}
}
