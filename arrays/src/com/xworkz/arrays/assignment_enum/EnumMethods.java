package com.xworkz.arrays.assignment_enum;

public class EnumMethods {
	
	enum Color{
		RED,GREEN,BLUE;
		
		private Color() {
			System.out.println("Constructor called for:" +this.toString());
		}
		
		public void colorInfo() {
			System.out.println("Universal color");
		}
		
	}
	public static void main(String[] args) {
		Color arr[]	= Color.values();
		for(Color col:arr) {
			System.out.println(col +" at index"+col.ordinal());
		}
		
		System.out.println(Color.valueOf("RED"));
		
		Color c1 = Color.RED;
		System.out.println(c1);
		c1.colorInfo();
		
	}

}
