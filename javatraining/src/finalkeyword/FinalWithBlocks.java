package finalkeyword;

public class FinalWithBlocks {
	
	final int r;
	final static int s;
	
	{
		r = 59;
	}
	{
		//r=68;    --only once you can initialize
	}
	
	static {
		s =89;
	}
	
	static {
		
		
	}


	public static void main(String[] args) {
		
		FinalWithBlocks fwb = new FinalWithBlocks();
		System.out.println("r:"+fwb.r);
		System.out.println("s:"+s         );
		
		

	}

}
