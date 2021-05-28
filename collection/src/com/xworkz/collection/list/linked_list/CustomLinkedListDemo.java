package com.xworkz.collection.list.linked_list;

import java.util.LinkedList;

public class CustomLinkedListDemo {
	
	
	
	public static void main(String[] args) {
		SoftDrink softdrink1 = new SoftDrink("Sprit",95,2,"White");
		SoftDrink softdrink2 = new SoftDrink("CocoCola",55,1,"Brown");
		SoftDrink softdrink3 = new SoftDrink("Maaza",45,1,"Orange");
		SoftDrink softdrink4 = new SoftDrink("Pepsi",98,2,"Brown");
		
		
		
		LinkedList<SoftDrink> list = new LinkedList<SoftDrink>();
		
		list.addFirst(softdrink1);
		list.add(softdrink2);
		list.add(softdrink3);
		list.addLast(softdrink4);
	
		
		for(SoftDrink softdrink:list) {
			if(softdrink.price>50) {
		System.out.println(softdrink.brand);
		
			}
		}
			
		
		
		
	}

}
