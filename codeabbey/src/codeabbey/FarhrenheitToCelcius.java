package codeabbey;
import java.util.Scanner;
public class FarhrenheitToCelcius {

	public static void main(String[] args) {
		
		Scanner ssc = new Scanner(System.in);
		
		int total = ssc.nextInt();
		float result=0;
		
		for (int j=0;j<total;j++) {
			
			float fahren = ssc.nextInt();
			
			
			result = ((fahren-32) * (5.0f/9.0f));  //important
			
			int celcius = Math.round(result);      //important
			System.out.print(celcius +" "); 
			
			
		} 
		ssc.close();
	}


}
