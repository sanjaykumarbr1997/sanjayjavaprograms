package objectclass.equals;

public class LaptopEqualsDemo {

	public static void main(String[] args) {
		
		Laptop laptop1 = new Laptop("Asus",86000);
		Laptop laptop2 = new Laptop("Sony",55000);
		Laptop laptop3 = new Laptop("Asus",86000);
		
		System.out.println(laptop1.equals(laptop3));
		System.out.println(laptop1);
		System.out.println(laptop3);



		
	}

}
