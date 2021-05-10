package assignments.doubt;

public class ReversDemo {

	public static void main(String[] args) {
		
		String msg = "sanjay";

		char ch[] = msg.toCharArray();

		String reversed = "";


			for(int i= ch.length -1;i>=0;i--){
				reversed = reversed + ch[i];

				}

		System.out.println(reversed);

	}

}
