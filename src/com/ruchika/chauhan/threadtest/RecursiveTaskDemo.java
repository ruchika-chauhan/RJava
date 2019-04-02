package com.ruchika.chauhan.threadtest;

import java.util.concurrent.ForkJoinPool;

public class RecursiveTaskDemo {
public static void main(String[] args) {
	ForkJoinPool fork=new ForkJoinPool();
	long arr[]=new long[1000];
	for (int i = 0; i < 1000; i++) {
		arr[i]=i;
	}
	MyRecursiveTask task=new MyRecursiveTask(0, arr.length, arr);
	long sum=fork.invoke(task);
	System.out.println("sum is::"+sum);
}
}
