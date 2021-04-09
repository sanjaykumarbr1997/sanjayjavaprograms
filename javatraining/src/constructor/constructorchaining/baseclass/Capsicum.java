package constructor.constructorchaining.baseclass;

public class Capsicum extends Vegetable{
	String color;
	String shape;
	double price;
	
	public Capsicum() {
		this("green","round",30.00); 
	
	}
	
	Capsicum(String color ,String shape ,double price){
		
		super("Capsicum");
		//color = color1;  --> you should assign different variable names to do this 
		this.color = color;  //--> this. refers to the class variables ,,starting
		this.shape = shape;
		this.price = price;
		
		
		
	}
		
	

}
