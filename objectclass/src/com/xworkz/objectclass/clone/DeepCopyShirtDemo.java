package com.xworkz.objectclass.clone;

public class DeepCopyShirtDemo {

	public static void main(String[] args) {
		
		Button button = new Button();
		Shirt shrt1 = new Shirt("Levis","green", button);
		Shirt shrt2 = new Shirt("Gucci","white", button);
		Shirt shrt3 = null;
		
		System.out.println("shirt2"+shrt2);

		
		try {
			shrt3 = (Shirt)shrt2.clone();
			shrt3.button.shape = "rhombus";
			shrt3.brand ="xyz";
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("shirt2"+shrt2 );
		System.out.println("shirt3"+shrt3 );
	
		
	}

}
