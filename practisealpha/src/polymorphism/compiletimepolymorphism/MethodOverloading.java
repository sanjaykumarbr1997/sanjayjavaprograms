package polymorphism.compiletimepolymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		
		TemperatureScanner temperatureScanner = new TemperatureScanner();
		Person1 person1 = new Person1();
		
		temperatureScanner.scan(person1);
		temperatureScanner.scan(new Person1());
		temperatureScanner.scan(new Person2());
		
		
		

	}

}
