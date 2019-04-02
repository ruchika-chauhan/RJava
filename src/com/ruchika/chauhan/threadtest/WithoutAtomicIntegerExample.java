package com.ruchika.chauhan.threadtest;

public class WithoutAtomicIntegerExample {

	public static void main(String[] args) throws InterruptedException {
		WithoutAtomicInteger wai=new WithoutAtomicInteger();
		Thread t1=new Thread(wai,"P1");
		t1.start();
		Thread t2=new Thread(wai,"P2");
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count::"+wai.getCount());
	}
	
}

class WithoutAtomicInteger implements Runnable{
	private int count;

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			processingResult(i);
			count++;
		}
		
		
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return this.count;
	}
	private void processingResult(int i) {
		try {
			Thread.sleep(1000);
		}
	catch(InterruptedException e) {
		
	}
	}

}
