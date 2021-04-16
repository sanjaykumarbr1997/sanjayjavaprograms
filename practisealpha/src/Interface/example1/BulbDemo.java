package Interface.example1;

public class BulbDemo {

	public static void main(String[] args) {
		
		Philips phi = new Philips();
		Osaram osa = new Osaram();
		Odor odr = new Odor();
		
		odr.slot(osa);
		odr.slot(phi);

	}

}
