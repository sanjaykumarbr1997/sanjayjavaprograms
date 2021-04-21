package objectclass.clone;

public class Mobile implements Cloneable {
	String brand;
	String color;
	Simcard simcard;
	
	public Mobile(String brand,String color,Simcard simcard) {
		this.brand = brand;
		this.color = color;
		this.simcard = simcard;
	}

	
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Mobile mob = (Mobile)super.clone();
		mob.simcard = (Simcard) mob.simcard.clone();
		return mob;
		
		
	}




	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", color=" + color + ", simcard=" + simcard + "]";
	}

}
