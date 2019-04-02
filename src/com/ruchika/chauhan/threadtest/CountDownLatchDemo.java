package com.ruchika.chauhan.threadtest;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	public static void main(String[] args) {
		CountDownLatch countDownLatch=new CountDownLatch(3);
		System.out.println("CountDownLatch started with thread count 3");
		CountDownLatchThread t=new CountDownLatchThread(countDownLatch,"Thread-1");
		t.start();
		try {
			countDownLatch.await();
			System.out.println(Thread.currentThread().getName() + "Thread has ended");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
