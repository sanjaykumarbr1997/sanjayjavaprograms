package objectclass.equals;

public class Laptop {
	
	String brand;
	double price;
	
	public Laptop(String brand,double price) {
		
		this.brand = brand;
		this.price = price;
		
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Laptop) {
			Laptop laptop = (Laptop)obj;
			if(this.brand.equals(laptop.brand)){
				if(this.price == laptop.price) {
				return true; 
					
				}
				else {
					return false;
				}
				
			}
			else{
				return false;
			}
			
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + "]";
	}
	
	
	
	
	
	

}
