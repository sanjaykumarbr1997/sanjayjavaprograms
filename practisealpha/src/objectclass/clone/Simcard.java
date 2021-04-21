package objectclass.clone;

public class Simcard implements Cloneable {
	
	String type = "GSM";

	@Override
	public String toString() {
		return "Simcard [type=" + type + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
