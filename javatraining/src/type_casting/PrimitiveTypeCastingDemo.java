package type_casting;

public class PrimitiveTypeCastingDemo {

	public static void main(String[] args) {
		
		int p = 100;
		long l = p;
		
		System.out.println(l); ///implicit
		
		double d = 1000.09;
		float f = (float)d;
		
		System.out.println(f);  //explicit

	}

}
