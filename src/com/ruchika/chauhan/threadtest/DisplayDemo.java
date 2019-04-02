package com.ruchika.chauhan.threadtest;

public class DisplayDemo {
public static void main(String[] args) {
	Display d1=new Display();
	//Display d2=new Display();
	DisplayTask t1=new DisplayTask(d1,"Ruchika");
	t1.start();
	
	DisplayTask t2=new DisplayTask(d1,"Chauhan");
	t2.start();
}
}
