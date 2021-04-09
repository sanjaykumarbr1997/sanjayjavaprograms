package relationship.hasarelationshipaggregate;

public class Library {
	String name = "Sharadha";
	String location = "Bangalore";
	Student student = new Student();
	
	String getStudentDetails() {
		return student.name;
	}
	
}
