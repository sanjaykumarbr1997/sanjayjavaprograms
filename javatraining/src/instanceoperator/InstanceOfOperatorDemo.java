package instanceoperator;

public class InstanceOfOperatorDemo {

	public static void main(String[] args) {
		//need to create 3 objects
		Cake cake = new Cake();
		Chocolate choco = new Chocolate();
		Mridul mridul = new Mridul();
		mridul.mouth(choco);
		//mridul.mouth(new Cake());  --> gotchha
		
	

	}

}
