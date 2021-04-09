package constructor.constructorchaining.thisandsuper;

public class Child extends Parent {
	
	String name;
	
	void setName(String name) {
		this.name = name;
		super.name = name;
		System.out.println(super.name);
		
	}

}
