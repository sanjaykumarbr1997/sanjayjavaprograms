package com.xworkz.collection.list.linked_list;

import java.util.LinkedList;

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
		
		

	}

}
