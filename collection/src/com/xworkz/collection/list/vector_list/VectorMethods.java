package com.xworkz.collection.list.vector_list;

import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		
		Vector vector1 = new Vector();
		Vector vector2 = new Vector();
		vector1.add(1);
		vector1.add(2);
		vector1.add(3);
		vector1.add(4);
		vector1.addElement(5);
		
		vector1.insertElementAt(7, 5);
		
		vector2.add(1);
		vector2.add(3);
		
		
		vector1.addAll(vector1);
		
		
		System.out.println(vector1);
		

	}

}
