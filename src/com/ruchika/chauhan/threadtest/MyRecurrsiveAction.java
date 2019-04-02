package com.ruchika.chauhan.threadtest;

import java.util.concurrent.RecursiveAction;

public class MyRecurrsiveAction extends RecursiveAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4643870548443565784L;
	int start;
	int end;
	long arr[];

	public MyRecurrsiveAction(int start,int end,long arr[]) {
		this.start=start;
		this.end=end;
		this.arr=arr;
	}

	@Override
	protected void compute() {
		int minimumProcessingSize=100;
		if(end-start<minimumProcessingSize) {
			for (int i = start; i <end; i++) {
				arr[i]=arr[i]*arr[i];
			}
		}else {
			int mid=(start+end)/2;
			invokeAll(new MyRecurrsiveAction(start,mid,arr),new MyRecurrsiveAction(mid,end,arr) );
		}
		
	}

	
}
