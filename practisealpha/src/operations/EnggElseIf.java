package operations;

public class EnggElseIf {
	
	static boolean engCompleted = false;
	static boolean knownJava = true;
	static boolean knownPython = false;

	public static void main(String[] args) {
		
		if (engCompleted) {
			
			if (knownJava) {
				System.out.println("apply for java developer");
			}
			else if(knownPython){
				System.out.println("apply for python developer");
				
			}
			else {
				System.out.println("not eligibile");
			}
			
		}
		else {
			System.out.println("first complete engineering");
		}

	}

}
