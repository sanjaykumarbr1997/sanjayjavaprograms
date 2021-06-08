package com.xworkz.map;

public class Players {
	
	String name1;
	String name2;
	String name3;
	String name4;
	String name5;
	
	
	public Players(String name1, String name2,String name3,String name4,String name5) {
		
		this.name1=name1;
		this.name2=name2;
		this.name3=name3;
		this.name4=name4;
		this.name5=name5;
		
	}


	@Override
	public String toString() {
		return "Players [name1=" + name1 + ", name2=" + name2 + ", name3=" + name3 + ", name4=" + name4 + ", name5="
				+ name5 + "]";
	}

}
