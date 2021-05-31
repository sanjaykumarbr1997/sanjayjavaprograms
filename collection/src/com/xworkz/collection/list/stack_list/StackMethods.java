package com.xworkz.collection.list.stack_list;
import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push('A');
		stack.push('N');
		stack.push('T');
		stack.push('S');
		System.out.println(stack);
		
		stack.pop();
		stack.peek();
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.search('T'));
		
	}

}
