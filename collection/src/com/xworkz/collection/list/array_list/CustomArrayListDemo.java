package com.xworkz.collection.list.array_list;

import java.util.ArrayList;

public class CustomArrayListDemo {

	public static void main(String[] args) {
		
		Tablet tablet1 = new Tablet("Dolo",25.0f,2021,"white");
		Tablet tablet2 = new Tablet("Citrizen",12.0f,2022,"white");
		Tablet tablet3 = new Tablet("TenefitM",180.4f,2023,"yellow");
		Tablet tablet4 = new Tablet("TelmaH",100.5f,2021,"pink");
		
		ArrayList<Tablet> arlist = new ArrayList<Tablet>();
		arlist.add(tablet1);
		arlist.add(tablet2);
		arlist.add(tablet3);
		arlist.add(tablet4);
		//arlist.add(5);
		
		System.out.println(arlist);
		/*
		
		for(Object tablet :arlist) {
			Tablet tb =(Tablet)tablet;
			
			if(tb.price>100.00f) {
			System.out.println(tablet);
			}
			
		}
			*/
		
		// internally downcasting happens here 
				for(Tablet tablet :arlist) {
					
					if(tablet.price>100.00f) {
					System.out.println(tablet);
					}
				
				
				}
		
	}

}
