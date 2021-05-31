package com.xworkz.collection.list.linked_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.*;

public class LinkedListMethod {
	
	

	public static void main(String[] args) {
		
		
		LinkedList list = new LinkedList();
		
		list.add(1);
		list.add(2);
		list.add(2);
		list.addFirst(0);
		//list.removeFirst();
		list.addLast(10);
		//list.removeLast();
		
		
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Audi");
		list2.add("Benz");
		list2.add("BMW");
		list2.add("Ford");
		
		Iterator<String> listIterator = list2.iterator();
		while(listIterator.hasNext()) {
			String obj = listIterator.next();
			if(obj.equals("Audi")){
				System.out.println("Its Audi");;
			}
			if(obj.equals("BMW")){
				System.out.println("Its BMW");
			} 
			if(obj.equals("Ford")){
				list2.remove(obj);
			}
		}
		
		System.out.println(list2);
		

	}

}
