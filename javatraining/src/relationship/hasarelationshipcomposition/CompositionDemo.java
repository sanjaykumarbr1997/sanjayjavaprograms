package relationship.hasarelationshipcomposition; //Composition TYPE

public class CompositionDemo {
public static void main(String[] args){
	Human human = new Human ();
	String name = human.getHeartDetails();//we can skip this method if u use library object
	System.out.println("human cant live without Heart" +" "+ name);
	// you can also use human.heart.rate instead ... try this 
	
}
}
