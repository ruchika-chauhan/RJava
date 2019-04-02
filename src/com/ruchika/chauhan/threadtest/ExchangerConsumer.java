package com.ruchika.chauhan.threadtest;

import java.util.concurrent.Exchanger;

public class ExchangerConsumer extends Thread{
	Exchanger<String> exchnger;
	String str;
	public ExchangerConsumer(Exchanger<String> exchnger) {
		this.exchnger=exchnger;
	}
	
	@Override
	public void run(){
		for (int i = 0; i < 5; i++) {
			try {
				str=exchnger.exchange(new String());
				System.out.println("consumed ::"+str);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
