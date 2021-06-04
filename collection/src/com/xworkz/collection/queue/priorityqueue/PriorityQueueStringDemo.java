package com.xworkz.collection.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueStringDemo {
	

	public static void main(String[] args) {
		
		PriorityQueue<String> pqueue = new PriorityQueue<>(new CustomComparatorString());
		
		pqueue.add("eco");
		pqueue.add("om");
		pqueue.add("maravante");
		pqueue.add("kandla");
		pqueue.add("apsara");
		
		
		System.out.println(pqueue);

	}


}
