package encapsulation;

public class StudyLamp {
	
	private String brand ;
	private String color ;
	private int standbyhours;
	
	
	public StudyLamp() {
		System.out.println("Printing default constructor");
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getStandbyhours() {
		return standbyhours;
	}
	public void setStandbyhours(int standbyhours) {
		if(standbyhours<0|| standbyhours >9) {
			this.standbyhours= 0;
			return;
		}
		this.standbyhours = standbyhours;
	}
	

}
