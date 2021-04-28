package stringoperations;

public class StringOperations {
	
	
	public static void main(String[] args) {
		
		String name ="Godzilla";
		String words = "Shut down the system";
		
		// .toUpperCase .toLowerCase
		String uppername = name.toUpperCase();
		System.out.println("String converted to uppercase :" +uppername);
		
		String lowername = name.toLowerCase();
		System.out.println("String converted to lowercase :" +lowername);
		
		// .charAt
		char ch1 = name.charAt(4);
		System.out.println("Character at index position 4 is :" +ch1);
		
		// .contains
		boolean con = name.contains("zill");
		System.out.println("String contains zill word ? :"+con);
		
		String concat = name.concat("Dragon");
		System.out.println("After concatenation :"+concat);
		
		boolean ends = name.endsWith("g");
		System.out.println("String ends with g ?  :"+ends);
		
		name.cod
		
		
		

	}

}
