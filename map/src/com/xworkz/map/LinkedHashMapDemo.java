package com.xworkz.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String,String> map = new LinkedHashMap<>();		
		
		map.put("Karnataka", "Bangalore");
		map.put("Andhra", "Amaravathi");
		map.put("Telangana", "Hyderabad");
		map.put("WestBengal", "Kolkatta");
		map.put("Kerala", "Tiruvantapuram");
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ ":"+ entry.getValue());
		}

	}

}
