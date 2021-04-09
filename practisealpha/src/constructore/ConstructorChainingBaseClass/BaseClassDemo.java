package constructore.ConstructorChainingBaseClass;

public class BaseClassDemo {

	public static void main(String[] args) {
		
		Apple apple = new Apple("red","shape",70);
		
		System.out.println(apple.color);
		System.out.println(apple.price);
		System.out.println(apple.shape);

	}

}
