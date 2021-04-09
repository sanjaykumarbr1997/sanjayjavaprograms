package constructore.constructortotal;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Company company = new Company();
		Company company1 = new Company("empty");
		Company company2 = new Company("empty",0000);
		
		System.out.println(company.name);
		System.out.println(company.noOfBranches);
		System.out.println(company1.name);
		System.out.println(company1.noOfBranches);
		System.out.println(company2.name);
		System.out.println(company2.noOfBranches);
		

	}

}
