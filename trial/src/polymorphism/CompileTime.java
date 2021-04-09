package polymorphism;

public class CompileTime {

	public static void main(String[] args) {
		Evans evans = new Evans();
		
//optional		Friend friend = new Friend();
		
		evans.speak(new Friend());
		evans.speak(new Stranger());
		
//optional		evans.speak(friend);
		

	}

}
