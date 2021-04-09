package inheritance.hierarchialinheritance;

public class HierarchialInheritanceDemo {
public static void main (String[] args) {
	
	Elephant elephant = new Elephant();
	Monkey monkey = new Monkey();
	Tiger tiger = new Tiger();
	
	elephant.walk();
	elephant.sound();
	
	monkey.walk();
	monkey.sound();
	
	tiger.walk();
	tiger.sound();
	
}
}
