package com.ruchika.chauhan.threadtest;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {
public static void main(String[] args) {
	Exchanger<String> exchanger=new Exchanger<String>();
	ExchangerProducer producer=new ExchangerProducer(exchanger);
	ExchangerConsumer consumer= new ExchangerConsumer(exchanger);
	producer.start();
	consumer.start();

}
}
