package com.ruchika.chauhan.threadtest;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
public static void main(String[] args) throws InterruptedException {
	AtomicIntegerTask th=new AtomicIntegerTask();
	Thread t1=new Thread(th);
	t1.start();
	Thread t2=new Thread(th);
	t2.start();
	
	t1.join();
	t2.join();
	System.out.println("count:"+th.getCount());
}
}
class AtomicIntegerTask implements Runnable{

	private AtomicInteger count=new AtomicInteger();
	@Override
	public void run() {
		
    for (int i = 0; i < 5; i++) {
    	processing(i);
		count.incrementAndGet();
		
	}		
	}
	
	public int getCount() {
		return count.get();
	}
	private void processing(int i) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
	}
}