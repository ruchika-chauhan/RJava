package com.ruchika.chauhan.threadtest;

public class DisplayTask extends Thread{
	public Display d;
	public String str;
	DisplayTask(Display d,String str){
		this.d=d;
		this.str=str;
	}

	@Override
	public void run() {
		
		d.disp(str);
		
	}

	
}
