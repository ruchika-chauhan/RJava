package com.ruchika.chauhan.collectionTest;

import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<String> l = new PriorityQueue<>();
		l.add("Apple");
		l.add("Nokia");
		l.add("Samsung");
		l.add("Apple");
		System.out.println("PriorityQueue::"+l);
		System.out.print(l.poll()+" "+l.poll());
		System.out.println(" "+l.peek()+" "+l.poll());
	}

}
/*Output:
Apple Apple Nokia Nokia



PriorityQueue keeps elements sorted and it can have duplicates.

add() and offer() methods both offer same functionality.

poll() method removes the first element in queue and returns it, 
while peek() method returns the first element without removing it.*/