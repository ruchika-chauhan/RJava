package com.ruchika.chauhan.threadtest;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9154189540927313550L;
	int start;
	int end;
	long arr[];
	
	public MyRecursiveTask(int start,int end,long arr[]) {
		this.start=start;
		this.end=end;
		this.arr=arr;
	}

	@Override
	protected Long compute() {
		long sum=0;
		int minimumProcessingTask=0;
		if(end-start<minimumProcessingTask) {
			for (int j = start; j <end; j++) {
				sum=sum+arr[j];
			}
		}else {
			int mid=(start+end)/2;
			MyRecursiveTask task1=new MyRecursiveTask(start,mid,arr);
			MyRecursiveTask task2=new MyRecursiveTask(mid,end,arr);
			task1.fork();
			task2.fork();
		    sum=task1.join()+task2.join();
		}
		System.out.println(sum);
		return sum;
	}

}
