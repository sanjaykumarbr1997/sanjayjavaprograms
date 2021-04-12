package operations;

public class StaticVariableCheck {
	static int a=10;
	int b;

	public static void main(String[] args) {
		StaticVariableCheck svc = new StaticVariableCheck();
		StaticVariableCheck svc1 = new StaticVariableCheck();
		
		svc.b=7;
		svc1.b=19;
		
		System.out.println(svc.b);
		System.out.println(svc1.b);


	}

}
