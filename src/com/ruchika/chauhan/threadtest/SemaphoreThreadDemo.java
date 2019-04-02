package com.ruchika.chauhan.threadtest;

import java.util.concurrent.Semaphore;

public class SemaphoreThreadDemo extends Thread {

	static Semaphore sem = new Semaphore(4);
	String name = "";

	public SemaphoreThreadDemo(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			System.out.println(name + " :: acquiring lock");
			System.out.println("Avialable permits now:::" + sem.availablePermits());
			sem.acquire();
			System.out.println(name + " :: got the permits");

			for (int i = 0; i < 5; i++) {
				System.out.println(
						name + " Performing action ::" + i + " and  available permits .." + sem.availablePermits());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println(name + " :: releasing  lock");
			sem.release();
			System.out.println("Avialable permits  now:::in finally:::" + sem.availablePermits());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Avialable permits in main::::" + sem.availablePermits());
		SemaphoreThreadDemo t1=new SemaphoreThreadDemo("t1");
		t1.start();
		SemaphoreThreadDemo t2=new SemaphoreThreadDemo("t2");
		t2.start();
		SemaphoreThreadDemo t3=new SemaphoreThreadDemo("t3");
		t3.start();
		SemaphoreThreadDemo t4=new SemaphoreThreadDemo("t4");
		t4.start();
		SemaphoreThreadDemo t5=new SemaphoreThreadDemo("t5");
		t5.start();
		SemaphoreThreadDemo t6=new SemaphoreThreadDemo("t6");
		t6.start();
	}
}
