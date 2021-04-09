package relationship.hasarelationshipaggregate; //AGGREGATION TYPE

public class AggregationDemo {
public static void main(String[] args){
	Library library = new Library();
	String name = library.getStudentDetails();//we can skip this method if u use library object
	System.out.println("name of the student is :" + name);
	System.out.println("name of the student is :" + library.student.name);
	// you can also use library.student.name instead of name try this 
	
}
}
