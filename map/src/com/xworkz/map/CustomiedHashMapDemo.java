package com.xworkz.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class CustomiedHashMapDemo {

	public static void main(String[] args) {
		
		Players playersIndia = new Players("Kohli","Dhoni","Rahul","Hardik","Shikar Dawan");
		Players playersAustralia = new Players("Smith","Warner","Finch","Maxwell"," Cummins");
		Players playersSouthAfrica = new Players("AB Devilliers","Kallis","Pollak","Tahir","Phlander");
		Players playersEngland = new Players("Pietersen","Cook","FlintOff","Steeves","Stokes");
		
				
		
		
		
		
		
		HashMap<String,Object> hmp = new HashMap<>();
		hmp.put("India", playersIndia);
		hmp.put("Australia", playersAustralia);
		hmp.put("SouthAfrice", playersSouthAfrica);
		hmp.put("England", playersEngland);
		
		
		
		for(Entry<String, Object> entry : hmp.entrySet()) {
			System.out.println(entry.getKey()+ ":"+entry.getValue());
		}

	}

}
