package constructor.constructorchaining.baseclass;

public class ConstructorChainingBase {

	public static void main(String[] args) {
		
		Capsicum capsicum = new Capsicum();
		System.out.println("name"+" "+ capsicum.color);
		System.out.println("shape"+" "+ capsicum.shape);
		System.out.println("price"+" "+ capsicum.price); 
		
		
		//notice the result , we didnt call vegetable constructor but it is still executed
		//so jvm does it , when a child class constructor is called it first calls parent 
		//constructor
		
		

	}

}
