package com.xworkz.encapsulation;

public class HumanDemoEncapsulation {

	public static void main(String[] args) {
		
		Human human = new Human();
		
		human.setSex("Male");
		human.setskinColor("Brown");
	 	human.setnoOfHeart(1);
		human.setage(3);
		
		System.out.println("Sex:"+human.getSex());
		System.out.println("SkinColor:"+human.getskinColor());
		System.out.println("age:"+human.getage());
		System.out.println("No of Heart:"+human.getnoOfHeart());
		
		

	}

}
