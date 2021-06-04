package com.xworkz.collection.queue.priorityqueue;

import java.util.PriorityQueue;


public class PriorityQueueWithStringBuffer {

	public static void main(String[] args) {
		
		PriorityQueue<StringBuffer> qu= new PriorityQueue<>(new CustomComparatorStringBuffer());
		
		qu.add(new StringBuffer("eco"));
		qu.add(new StringBuffer("om"));
		qu.add(new StringBuffer("maravante"));
		qu.add(new StringBuffer("kandla"));
		qu.add(new StringBuffer("apsara"));
		
		
		System.out.println(qu);

	}

}
