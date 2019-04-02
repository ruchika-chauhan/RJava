package com.ruchika.chauhan.threadtest;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class ForkJoinDemo {
public static void main(String[] args) {
	ForkJoinPool fork=new ForkJoinPool();
	long startTime=0;
	long endTime=0;
	long[] arr=new long[10000];
	for (int i = 0; i < 10000; i++) {
		arr[i]=i;
	}
	MyRecurrsiveAction task=new MyRecurrsiveAction(0, arr.length, arr);
	startTime=System.nanoTime();
	System.out.println("Start Time::"+startTime);
	fork.invoke(task);
	endTime=System.nanoTime();
	System.out.println("End Time::"+endTime);
	for (int i = 0; i < 10000; i++) {
		System.out.print(arr[i]+" ");
		System.out.println();
	}
	System.out.println("level of parallelism "+fork.getParallelism());
	
	System.out.println("Time taken by task in sec:: "+TimeUnit.SECONDS.convert(endTime-startTime, TimeUnit.NANOSECONDS));

}
}
