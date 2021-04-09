package constructor.constructoroverloading;

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Xworkz xworkz = new Xworkz("Bangalore",100);
		Xworkz xworkz1 = new Xworkz("Bangalore");
		Xworkz xworkz2 = new Xworkz();
		
		System.out.println(xworkz.location);
		System.out.println(xworkz.noOfStudents);
		System.out.println(xworkz1.location);
		System.out.println(xworkz2.noOfStudents);
		System.out.println(xworkz2.location);
		

	}

}
