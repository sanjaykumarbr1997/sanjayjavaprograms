package com.xworkz.collection.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(6);
		pq.add(1);
		pq.add(3);
		pq.add(4);
		pq.add(7);
		pq.add(8);
		pq.offer(9);
		
		
		
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.remove(8));
		System.out.println(pq.peek());
		System.out.println(pq.element());
		
		
		
	}

}
