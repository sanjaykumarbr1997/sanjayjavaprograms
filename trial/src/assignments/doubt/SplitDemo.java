package assignments.doubt;
import java.util.*;
public class SplitDemo {
	
	

	public static void main(String[] args) {
		
		String msg = "Hello Hello Hello Wakeup Developers";
		System.out.println(msg);
		String temp ="";
		char arr[] = msg.toCharArray();		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=' ') {
				
				temp=temp+arr[i];
				
				
			}
			else {
				System.out.println(temp);
				temp="";
				
			}
		}
		System.out.println(temp);
				

	}

}
