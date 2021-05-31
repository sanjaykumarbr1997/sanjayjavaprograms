package com.xworkz.collection.set.hashset;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Umbrella umbrella1 = new Umbrella("Wildcraft","Orange",200.00,"Medium");
		Umbrella umbrella2 = new Umbrella("Decathlon","Red",100.00,"Small");
		Umbrella umbrella3 = new Umbrella("Levi","Blue",300.00,"Large");
		Umbrella umbrella4 = new Umbrella("TriColor","Orange",280.00,"Medium");
		Umbrella umbrella5 = new Umbrella("Decathlon","Red",100.00,"Small");
		
		HashSet<Umbrella> set = new HashSet<>();
		
		set.add(umbrella1);
		set.add(umbrella2);
		set.add(umbrella3);
		set.add(umbrella4);
		set.add(umbrella5);
		
		for(Umbrella umb:set) {
			if(umb.size=="Medium" || umb.color=="Orange")
			System.out.println(umb);
		}
		
		

	}

}
