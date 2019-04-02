package com.ruchika.chauhan.threadtest;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchThread extends Thread {
	CountDownLatch countDownLatch;
	String name;
	
	CountDownLatchThread(CountDownLatch countDownLatch,String name){
		this.countDownLatch=countDownLatch;
		this.name=name;
	}

	public void run(){
		for(int i=2;i>=0;i--)
		{
			countDownLatch.countDown();

			System.out.println("Latch count has been reduced by "+Thread.currentThread().getName()+" by count "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
}
}
