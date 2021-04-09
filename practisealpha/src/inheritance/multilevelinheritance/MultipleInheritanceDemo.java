package inheritance.multilevelinheritance;

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		Employee employee = new Employee();
		JuniorProgrammer junior = new JuniorProgrammer();
		SeniorProgrammer senior = new SeniorProgrammer();
		
		employee.workingHours();
		senior.workingHours();
		senior.work();
		junior.workingHours();
		junior.work();
		junior.experience();
		
		

	}

}
