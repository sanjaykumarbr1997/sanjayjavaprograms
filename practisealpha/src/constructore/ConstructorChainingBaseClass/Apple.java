package constructore.ConstructorChainingBaseClass;

public class Apple extends Fruit {
	
	String color;
	String shape;
	int price;
	
	/*Apple(){
		
		this("Red","Round",150);
		
	} */
	
	Apple(String color, String shape, int price){
		
		super("Apple");
		
		this.color = color;
		this.shape = shape;
		this.price = price;
		
	}

}
