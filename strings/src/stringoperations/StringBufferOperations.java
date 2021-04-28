package stringoperations;

public class StringBufferOperations {

	public static void main(String[] args) {
		StringBuffer dog = new StringBuffer("Bruno ");
		
		//append
		StringBuffer dg = dog.append("good dog");
		System.out.println("After append :"+dg);
		
		//insert()
		StringBuffer dog1 = new StringBuffer("Bruno ");
		System.out.println(dog1.insert(2, "Doggy"));
		
		//replace()
		StringBuffer dog2 = new StringBuffer("Bruno ");
		System.out.println(dog2.replace(1, 3, "bark"));
		
		//delete()
		StringBuffer dog3 = new StringBuffer("Bruno ");
		System.out.println(dog3.delete(1, 3));
		
		//reverse()
		StringBuffer dog4 = new StringBuffer("Bruno ");
		System.out.println(dog4.reverse());
		
		//capacity()
		StringBuffer dog5 = new StringBuffer("Bruno ");
		System.out.println(dog5.capacity());
		
		//indexOf()
		StringBuffer dog6 = new StringBuffer("Bruno ");
		System.out.println(dog6.indexOf("r"));
		
		//setChar()
		StringBuffer dog7 = new StringBuffer("Bruno ");
		dog7.setCharAt(1, 'l');
		System.out.println(dog7);
		
		//subSequence
		StringBuffer dog8 = new StringBuffer("Bruno ");
		System.out.println(dog8.subSequence(2, 4));
		
		//trimToSize
		StringBuffer dog9 = new StringBuffer("Bruno     ");
		System.out.println("Before trim capacity is :"+ dog9.capacity());
		dog9.trimToSize();
		System.out.println(dog9);
		System.out.println("After trim capacity is :"+ dog9.capacity());	
		

	}

}
