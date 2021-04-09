package polymorphism.compiletimepolymorphism;

public class TemperatureScanner {
	
	void scan(Person1 p1) {
		System.out.println("temperature is 98 F");
	}
	
	void scan(Person2 p2) {
		System.out.println("temperature is 100F");
	}

}
