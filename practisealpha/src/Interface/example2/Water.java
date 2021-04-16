package Interface.example2;

public class Water implements Oxygen,Hydrogen {

	@Override
	public void hydrogenMolecules() {
		System.out.println("Water contains 2 molecules of Hydrogen");
		
	}

	@Override
	public void oxygenMolecules() {
		System.out.println("Oxygen contains 1 molecules of oxygen");

	}
	
	

}
