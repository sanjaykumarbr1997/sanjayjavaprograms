package com.xworkz.collection.list.stack_list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("red");
		stack.push("green");
		stack.push("blue");
		stack.push("white");
		
		System.out.println(stack);
		
		for(String color:stack) {
			System.out.println(color);
		}
		
		
		
	}

}
