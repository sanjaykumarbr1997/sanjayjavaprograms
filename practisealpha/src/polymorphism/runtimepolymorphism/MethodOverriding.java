package polymorphism.runtimepolymorphism;

public class MethodOverriding {

	public static void main(String[] args) {
		
		Project1 p1 = new Project1();
		Project2 p2 = new Project2();
		
		int p1Year = p1.completionYear();
		System.out.println("Project1 completion year is:"+p1Year);
		
		int p2Year= p2.completionYear();
		System.out.println("Project2 completion year is:"+p2Year);
	}

}
