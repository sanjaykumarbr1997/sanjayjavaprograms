package inheritance.singleinheritance;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		Doctor doctor = new Doctor();
		Surgeon surgeon = new Surgeon();
		
		doctor.patient();
		surgeon.patient();
		surgeon.surgery();

	}

}
