package com.ruchika.chauhan.threadtest;

public class Display {
	
	public  synchronized void disp(String str) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Good Morning ..."+str);
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}

}
