package com.xworkz.collection.list.vector_list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
	
		Vector<String> vector = new Vector<String>();
		
		vector.add("rock");
		vector.add("jazz");
		vector.add("pop");
		vector.add("classical");
		
		System.out.println(vector);
		
		Enumeration<String> enm = vector.elements();
		while(enm.hasMoreElements()) {
			String musicString = enm.nextElement();
			System.out.println(musicString);
		}
		
		System.out.println("------");
		for(String music:vector) {
		
			if(music.length()>3) {
			System.out.println(music);
			}
			
		}
		
	}

}
