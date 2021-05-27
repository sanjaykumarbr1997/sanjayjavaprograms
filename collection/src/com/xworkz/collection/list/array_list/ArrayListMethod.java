package com.xworkz.collection.list.array_list;
import java.util.ArrayList;

public class ArrayListMethod  {
	
	String name;
	String color;
	double price;
	
	public ArrayListMethod(String name,String color,double price) {
		this.name = name;
		this.color= color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Toy [name=" + name + ", color=" + color + ", price=" + price + "]";
	}


	public static void main(String[] args) {

		
		ArrayList arrayList = new ArrayList();
		ArrayList arrayList1 = new ArrayList();

		ArrayListMethod car = new ArrayListMethod("car","red",100.00);
		ArrayListMethod teddy = new ArrayListMethod("teddy","orange",250.00);
		ArrayListMethod ball = new ArrayListMethod("ball","blue",50.00);
		ArrayListMethod dog = new ArrayListMethod("dog","black",500.00);
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(2);
		arrayList.add(5);
		arrayList.add(4);
		arrayList.add(new ArrayListMethod("c","R",45.0));
		arrayList.add("ae");
		
		arrayList.add(car);
		
		arrayList.add(dog.color);
		arrayList.add(9);
		arrayList.remove(9);
		arrayList.set(2, 3);
		arrayList.add(15);
		
		
		
		
		arrayList1.add(1);
		arrayList1.add(2);
		arrayList.addAll(arrayList1);
		System.out.println(arrayList.containsAll(arrayList1));
		//System.out.println(arrayList.retainAll(arrayList1));
		System.out.println(arrayList.contains(5));
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.get(0));
		System.out.println(arrayList);
		
		
		
		
		
		
		
		
		
		
		
	}

}
