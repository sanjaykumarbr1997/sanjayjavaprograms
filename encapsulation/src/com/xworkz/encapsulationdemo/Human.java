package com.xworkz.encapsulationdemo;

public class Human {
	
	private String sex;
	private String skinColor;
	private int noOfHeart;
	private int age;
	
	public Human() {
		System.out.println("Printing from default constructor");
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getskinColor() {
		return skinColor;
	}
	public void setskinColor(String skinColor) {
		this.skinColor = skinColor;
	}
	public int getnoOfHeart() {
		return noOfHeart;
	}
	public void setnoOfHeart(int noOfHeart) {
		
		if ((noOfHeart <0) || (noOfHeart>1)) {
			System.out.println("Invalid input for noOfHeart");
			this.noOfHeart =0;
			return;
		}
		this.noOfHeart = noOfHeart;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		if ((age <0) || (age>125)) {
			System.out.println("Invalid input for age");
			this.age =0;
			return;
		}
		this.age = age;
	}
	
	

}
