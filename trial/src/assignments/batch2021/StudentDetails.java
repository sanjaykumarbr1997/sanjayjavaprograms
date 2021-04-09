package assignments.batch2021;

public class StudentDetails {
	String name ;
	int age;
	String location;
	
	void names() {
		System.out.println("Name :" +name);
		
	}
	void age() {
		System.out.println(name + " age:" +age);
	}
	void location() {
		System.out.println(name + " location :" +location);
	}

	public static void main(String[] args) {
		StudentDetails student1 = new StudentDetails();
		student1.name= "Sanjay";
		student1.age= 23;
		student1.location = "Bangalore";
		student1.names();
		student1.age();
		student1.location();
		
		StudentDetails student2 = new StudentDetails();
		student2.name= "Tejas";
		student2.age= 22;
		student2.location = "Bangalore";
		student2.names();
		student2.age();
		student2.location();
		
		StudentDetails student3 = new StudentDetails();
		student3.name= "Namratha";
		student3.age= 22;
		student3.location = "Karwar";
		student3.names();
		student3.age();
		student3.location();
		
		
		StudentDetails student4 = new StudentDetails();
		student4.name= "Swetha";
		student4.age= 22;
		student4.location = "Gulbarga";
		student4.names();
		student4.age();
		student4.location();
		
		StudentDetails student5 = new StudentDetails();
		student5.name= "Mridul";
		student5.age= 22;
		student5.location = "Mangalore";
		student5.names();
		student5.age();
		student5.location();
		
		StudentDetails student6 = new StudentDetails();
		student6.name= "Akshata";
		student6.age= 22;
		student6.location = "Koppal";
		student6.names();
		student6.age();
		student6.location();
			
		
		
		
	}
}
