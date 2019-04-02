package com.ruchika.chauhan.threadtest;

import java.util.concurrent.Exchanger;

public class ExchangerProducer extends Thread{

	Exchanger<String> exchanger;
	String str;
	public ExchangerProducer(Exchanger<String> exchanger) {
		this.exchanger=exchanger;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			str=i+"";
			System.out.println("Produced ::"+str);
			try {
				str=exchanger.exchange(str);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
