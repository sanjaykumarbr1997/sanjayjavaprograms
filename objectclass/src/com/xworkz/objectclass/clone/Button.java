package com.xworkz.objectclass.clone;

public class Button implements Cloneable {
	
	String shape = "round";

	@Override
	public String toString() {
		return "Button [shape=" + shape + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}
