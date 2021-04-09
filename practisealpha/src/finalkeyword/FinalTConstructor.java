package finalkeyword;

public class FinalTConstructor {
	
	final static int d = 100;
	final int e ;
	
	/*
	void show() {
		e=159;
	} 
	*/
	FinalTConstructor(){
		e =500;
	}
	
	FinalTConstructor(int value){
		
		e = value;
	}

	public static void main(String[] args) {
		
		FinalTConstructor ftc = new FinalTConstructor();
		FinalTConstructor ftc1 = new FinalTConstructor(350);
		
		System.out.println("d:"+d);
		System.out.println("e:"+ ftc.e);
		System.out.println("e:"+ ftc1.e);
		
		
		

	}

}
