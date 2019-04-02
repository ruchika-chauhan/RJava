package com.ruchika.chauhan.queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
public static void main(String[] args) {
	PriorityQueue<String> pq=new PriorityQueue<>();
	pq.add("apple");
	pq.add("nokia");
	pq.add("samsung");
	pq.add("moto");
	// poll()-Retrieves and removes the head of this queue, or returns null if this queue is empty
	System.out.println(pq.poll()+"  "+pq.poll());
	//peek()-Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
	System.out.println(pq.peek()+"  "+pq.poll());

}
}
