package com.xworkz.arrays.custom_array;

public class ToyDemo {

	public static void main(String[] args) {
		
		Toy car = new Toy("car","red",100.00);
		Toy teddy = new Toy("teddy","orange",250.00);
		Toy ball = new Toy("ball","blue",50.00);
		Toy dog = new Toy("dog","black",500.00);
		
		Toy toy[] = {car,teddy,ball,dog};
		System.out.println("Collection of toys");
		
		for(Toy tys:toy) {
			System.out.println(tys);
		}
		System.out.println();
		System.out.println("toys name");
		for(Toy tys1:toy){
			System.out.println(tys1.name);
		}
		System.out.println();
		System.out.println("toys name whose price is greater than 100");
		for(Toy tys2:toy){
			if(tys2.price>100) {
			System.out.println(tys2.name);
			}
		}

	}

}
