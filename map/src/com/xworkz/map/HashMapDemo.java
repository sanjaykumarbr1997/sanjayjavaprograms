package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<>();
		hm.put("Bangalore", "RCB");
		hm.put("Hyderabad", "SRH");
		hm.put("Chennai","CSK");
		hm.put("Kolkatta", "KKR");
		hm.put("Delhi","DD");
		hm.put("Rajasthan", "RR");
		hm.put("Punjab","KX1P");
		
		
		for(Map.Entry<String, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+ ":"+entry.getValue());
		}
		

	}

}
