package stringnewkeyword;

public class StringNewKeyword {
	
	
	public static void main(String[] args) {
		
		String name12 = new String("Apple");
		String name13= new String("Apple");
		String name14 = "Apple";
		
		
		
		System.out.println(name12);
		System.out.println(name13);
		System.out.println(name12==name13);
		System.out.println(name12.intern().hashCode());
		System.out.println(name14.hashCode());

	}

}
