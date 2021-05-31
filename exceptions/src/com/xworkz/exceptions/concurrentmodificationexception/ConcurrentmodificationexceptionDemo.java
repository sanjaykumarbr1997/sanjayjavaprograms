package com.xworkz.exceptions.concurrentmodificationexception;

import java.util.*;
public class ConcurrentmodificationexceptionDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("H");
		list.add("El");
		list.add("L");
		list.add("S");
		list.add("O");
		list.add("P");
		
		Iterator<String> it = list.iterator();
		 while (it.hasNext()) { 
			 System.out.println(it.hasNext());
			 String value = it.next(); 
			 System.out.println("List Value:" + value);  
			  if (value.equals("O")) {  
			  list.remove(value);  
			  }
	     }  
		 System.out.println(list);
			   
	}

}
