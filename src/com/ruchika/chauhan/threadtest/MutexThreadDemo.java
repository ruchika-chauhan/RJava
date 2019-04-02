package com.ruchika.chauhan.threadtest;

import java.util.concurrent.Semaphore;

public class MutexThreadDemo extends Thread{
	// in the example of mutex we will allow only one thread to access resource.
	static Semaphore sem = new Semaphore(1);
	String name;

	MutexThreadDemo(String name) {
		this.name = name;
	}
  public void run() {
	  try {
		  System.out.println(name+" Acquiring Lock");
		  System.out.println("Avialable permits now::"+sem.availablePermits());
		  sem.acquire();
		  System.out.println(name+" got the lock");
            for (int i = 0; i < 5; i++) {
				System.out.println(name+" perfoming action on "+i +" Avialble permits now ::"+sem.availablePermits());
			   Thread.sleep(1000);
            }
		  
	  }catch(InterruptedException e){
		  e.printStackTrace();
		  
		  
	  }finally {
		System.out.println(name+"  Relaesing lock");
		sem.release();
		System.out.println("Available permits in finally "+sem.availablePermits());
		
	}
  }
  public static void main(String[] args) {
	System.out.println("Available permits in main :: "+sem.availablePermits());
	MutexThreadDemo t1=new MutexThreadDemo("t1");
	t1.start();
	MutexThreadDemo t2=new MutexThreadDemo("t2");
	t2.start();
	MutexThreadDemo t3=new MutexThreadDemo("t3");
	t3.start();
	MutexThreadDemo t4=new MutexThreadDemo("t4");
	t4.start();
	MutexThreadDemo t5=new MutexThreadDemo("t5");
	t5.start();
	MutexThreadDemo t6=new MutexThreadDemo("t6");
	t6.start();
}
  
}
