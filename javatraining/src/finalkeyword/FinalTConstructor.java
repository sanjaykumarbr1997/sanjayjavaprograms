package finalkeyword;

public class FinalTConstructor {
	
	final static int y=100;
	final int x ;
	/*
	void play() {
		x=250;
		
	} */
	
	FinalTConstructor(int value){
		
		x=value;
		
		
	}
	FinalTConstructor(){
		x=300;
	} 

	public static void main(String[] args) {
		
		FinalTConstructor fc = new  FinalTConstructor();
		System.out.println("X:"+fc.x);
		System.out.println("Y:" +y);
		
		FinalTConstructor fc1 = new  FinalTConstructor(250);
		System.out.println("X:"+fc1.x);
		System.out.println("Y:" +y);
		
		
		
	}
}
