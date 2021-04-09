package hasarelationship.aggregate;

public class AggregateDemo {

	public static void main(String[] args) {
		
		Student student = new Student();
		//String companyName = student.mobile.getCompanyDetails();
		
		System.out.println(" Student has  :"+ " "+ student.mobile.company);
		//System.out.println("Student has :"+ " "+ companyName);
		
	}

}
