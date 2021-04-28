package stringoperations;

public class StringBuilderOperations {

	public static void main(String[] args) {


		StringBuilder dog = new StringBuilder("Bruno ");
		
		//append
		StringBuilder dg = dog.append("good dog");
		System.out.println("After append :"+dg);
		
		//insert()
		StringBuilder dog1 = new StringBuilder("Bruno ");
		System.out.println(dog1.insert(2, "Doggy"));
		
		//replace()
		StringBuilder dog2 = new StringBuilder("Bruno ");
		System.out.println(dog2.replace(1, 3, "bark"));
		
		//delete()
		StringBuilder dog3 = new StringBuilder("Bruno ");
		System.out.println(dog3.delete(1, 3));
		
		//reverse()
		StringBuilder dog4 = new StringBuilder("Bruno ");
		System.out.println(dog4.reverse());
		
		//capacity()
		StringBuilder dog5 = new StringBuilder("Bruno ");
		System.out.println(dog5.capacity());
		
		//indexOf()
		StringBuilder dog6 = new StringBuilder("Bruno ");
		System.out.println(dog6.indexOf("r"));
		
		//setChar()
		StringBuilder dog7 = new StringBuilder("Bruno ");
		dog7.setCharAt(1, 'l');
		System.out.println(dog7);
		
		//subSequence
		StringBuilder dog8 = new StringBuilder("Bruno ");
		System.out.println(dog8.subSequence(2, 4));
		
		//trimToSize
		StringBuilder dog9 = new StringBuilder("Bruno     ");
		System.out.println("Before trim capacity is :"+ dog9.capacity());
		dog9.trimToSize();
		System.out.println(dog9);
		System.out.println("After trim capacity is :"+ dog9.capacity());	
		
	}

}
