package finalkeyword;

public class FinalWBlocks {
	
	final static int m;
	final int n;
	{
		n=27;
	}
	{
		
	}
	
	static {
		m=78;
		
	}
	static {
		
	}

	public static void main(String[] args) {
		
		FinalWBlocks fwb = new FinalWBlocks();
		System.out.println("m:"+ m);
		System.out.println("n:"+fwb.n);
	}

}
