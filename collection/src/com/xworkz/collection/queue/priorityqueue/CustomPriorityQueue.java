package com.xworkz.collection.queue.priorityqueue;

import java.util.PriorityQueue;

public class CustomPriorityQueue {

	public static void main(String[] args) {
	
		Employee tejas = new Employee("e001","Tejas",40000d);
		Employee sanjay = new Employee("e002","Sanjay",30000d);
		Employee namratha = new Employee("e003","Namratha",50000d);
		
		PriorityQueue<Employee> que = new PriorityQueue<>(new EmployeeComparator());
		que.add(tejas);
		que.add(sanjay);
		que.add(namratha);
		
		
		for(Employee e : que) {
			System.out.println(e);
		}
		
		
	}

}
