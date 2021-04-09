package scanner;
import java.util.Arrays;
import java.util.Scanner;


public class ScannerCheck{

public static void main(String[] args){
	
	System.out.println("Enter the data");
	Scanner sc = new Scanner(System.in);
	int loop = sc.nextInt();
	

	int aray1[] = new int[loop];
	int aray2[] = new int[loop];
	//int aray3[] = new int[loop];	
	
	for(int i=0; i<loop; i++) {
		
				aray1[i]= sc.nextInt();
				aray2[i]=sc.nextInt();	
	}
	
	sc.close(); 
	
	for(int j=0; j<loop; j++) {
		
		if(aray1[j]<aray2[j]) {
			System.out.print(aray1[j]+" ");
			//aray3[j] = aray1[j];
		}
		
		else {
			System.out.print(aray2[j]+" ");
			//aray3[j] = aray2[j];
		}
		
	}
	
	//System.out.println(Arrays.toString(aray1));
	
	//System.out.println(Arrays.toString(aray3));




}

}