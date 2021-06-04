package com.xworkz.collection.queue.priorityqueue;

import java.util.PriorityQueue;

public class CustomisedPriorityQue {
	
public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComparator());
		pq.add(6);
		pq.add(1);
		pq.add(3);
		pq.add(4);
		pq.add(5); 
		pq.add(7);
		pq.add(8);
		
		System.out.println(pq);
	}

}
