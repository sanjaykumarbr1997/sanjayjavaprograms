package polymorphism;

public class Evans {
	
	void speak(Friend f) {
		System.out.println("hello how are you ......");
	}
	
	void speak(Stranger s) {
		System.out.println("hello");
	}
}
