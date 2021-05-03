package stringoperations;
import java.util.Arrays;

public class StringOperations {
	
	
	public static void main(String[] args) {
		
		
		String name ="Godzilla";
		String namedup = "GODzilla";
		String words = "Shut down the system";
		String spaces = "   Hello everyone what's news today     ";
		int no = 55;
		
		// .toUpperCase .toLowerCase
		String uppername = name.toUpperCase();
		
		System.out.println("String converted to uppercase :" +uppername);
		
		String lowername = name.toLowerCase();
		System.out.println("String converted to lowercase :" +lowername);
		
		// .charAt
		char ch1 = name.charAt(4);
		System.out.println("Character at index position 4 is :" +ch1);
		
		// .contains
		boolean con = name.contains("zhfghfhill");
		System.out.println("String contains zill word ? :"+con);
		
		//concat
		String concat = name.concat("Dragon");
		System.out.println("After concatenation :"+concat);
		
		//ends with
		boolean ends = name.endsWith("la");
		System.out.println("String ends with g ?  :"+ends);
		
		//codePointAt
		int uni = name.codePointAt(0);
		System.out.println("unicode value of index 2 is :"+uni);
		
		//equalsIgnoreCase
		boolean csd = name.equalsIgnoreCase(namedup);
		System.out.println("boolean value :"+ csd);
		
		//is empty
		boolean emp = "".isEmpty();
		System.out.println("boolean value :"+ emp);
		
		//indexOf
		int chec = words.indexOf("down");
		System.out.println("string is at location start at index :"+chec);
		
		//replace
		String rep = name.replace('l', 'b');
		System.out.println("string after replacement is :"+rep);
		
		//substring
		
		String sub = name.substring(1,4);
		System.out.println("sub string is :"+ sub);
		
		//toCharArray
		char cha[] = name.toCharArray();
		for (char ca : cha) {
			System.out.print(ca+" ");
			}
		System.out.println();
		
		// trim- deletes unwanted spaces at start and end
		System.out.println(spaces.length());
		
		String exmp = spaces.trim();
		System.out.println("after trimming spaces :"+ exmp);
		System.out.println(exmp.length());
		
		//valueOf
		String val = String.valueOf(no);
		System.out.println(val);
		System.out.println("---");
		//copyOf 
		
		int arr[] = new int[] {21,31,41,51,61};
		
		for(int go : arr) {
			System.out.print(go);
		}
		
		System.out.println(" ");
		
		int ar2[] = Arrays.copyOf(arr, 8);
		ar2[5]= 71;
		ar2[6]= 81;
		ar2[7]=91;
		
		for(int ars : ar2) {
			System.out.print(ars+" ");
		}
		
		System.out.println();
		
		// format 
		
		String sf1=String.format("name is %s",name);  
		String sf2=String.format("value is %f", 56.3857547);  
		String sf3=String.format("value is %65.8f",65.3);//returns 8 char fractional part filling with 0  
		  
		System.out.println(sf1);  
		System.out.println(sf2);  
		System.out.println(sf3);  
		
		
		//split
		String ipl = "RCzB won z the z match";
		String won[] = ipl.split("z");
		System.out.println(Arrays.toString(won));
		

	
	}

}
