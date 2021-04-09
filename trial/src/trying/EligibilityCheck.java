package trying;

public class EligibilityCheck {
	
	

	public static void main(String[] args) {
		int percentage10 = 80;
		int percentage12 = 79;
		int percentageDegree = 81;
		int marksJava = 78;
		int marksWebDevelopment = 85;
		
		if((percentage10>70)&&(percentage12>70)) {
			System.out.println("Eligible for degree");
			
		
			if(percentageDegree>65) {
				System.out.println("Eligible for test");
			
			
			   if((marksJava>70) && (marksWebDevelopment>70)) {
				   System.out.println("Eligible for interview");
			   }
			   
			   else {
				   System.out.println("Not eligible - poor marks in java and web development");
			   }
			   
			}  
			   
			else {
				System.out.println("Not eligible - poor marks in degree");
			}
		}
		else {
			System.out.println("Not eligible 10th and 12th poor marks");
				
			}
			

	}

}
