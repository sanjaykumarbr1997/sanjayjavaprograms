package com.xworkz.collection.list.vector_list;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
	
		Vector<String> vector = new Vector<String>();
		
		vector.add("rock");
		vector.add("jazz");
		vector.add("pop");
		vector.add("classical");
		
		System.out.println(vector);
		
		for(Object music:vector) {
			String musicString = (String) music;
			if(musicString.length()>3) {
			System.out.println(music);
			}
			
		}
		
	}

}
