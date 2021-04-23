package com.xworkz.arrays.arraymethods;
import java.util.Arrays;

public class MethodArray {
	
	

	public static void main(String[] args) {
		
		//asList()
		String ar[] = {"Ben10","TomJerry","Pokemon","Bheem"};
		System.out.println("Integer array as list:"+Arrays.asList(ar));
		
		
		//binarySearch()
		int ar1[] = {10,20,15,22,35};
		Arrays.sort(ar1);
		int key = 22;
		System.out.println(key+" "+"Found at index:"+Arrays.binarySearch(ar1,key));
		
		
		//compare(array1,arra2)
		int ar2[] = {10,15,20,22};
		System.out.println("Integer arrays on comparision:"+ Arrays.compare(ar1,ar2));
		
		//compareUnsigned(array1,array2)
		int ar3[] = {-1,-15,20,-25};
		System.out.println("Unsigned Integer arrays on comparision:"+ Arrays.compare(ar1,ar3));
		
		//copyOf(originalArray,newLength)
		System.out.println("copied array and new length"+Arrays.toString(Arrays.copyOf(ar1, 10)));
		
		//copyOfRange(original index,start index,end index)
		System.out.println("displaying arrays in range"+Arrays.toString(Arrays.copyOfRange(ar1, 1, 3)));
		
		//Equals
		System.out.println("checking whether two arrays are equal :"+Arrays.equals(ar1, ar2));

		//deepEquals
		int ar4[][]= {{10,20,15,22,35}};
		int ar5[][]= {{10,20,15}};	    
	    System.out.println("checking whether two arrays are equal :"+Arrays.deepEquals(ar4, ar5));
	    
	   //HashCode
	    System.out.println("displaying hashcode :"+Arrays.hashCode(ar1));
	   
	    //deepHashCode
	    System.out.println("displaying deephashcode :"+Arrays.deepHashCode(ar5));
	    
	  //toString
	    System.out.println("string format "+Arrays.toString(ar1));

	    
	    //deepToString
	    System.out.println("string format "+Arrays.deepToString(ar5));
	    
	    //fill
		int ar6[] = {10,20,15,22,35,77};
	    int k2 = 22;
	    Arrays.fill(ar6, k2);
	    System.out.println("assigning fill value to each index of arrays"+Arrays.toString(ar6));
	    
	    //mismatch
		int ar7[] = {10,20,15,22,35,77};
		int ar8[] = {10,35,15};
		System.out.println("returning the index of first unmatched element between arrays :"+Arrays.mismatch(ar7, ar8));
		
		


	    
	    




	}

}
