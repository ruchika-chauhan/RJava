package com.ruchika.chauhan.exceptiontest;

public class TryCatchTestDemo {
	
public static int test() {
	int i=100;
	try {
		
		i=i+20;
		i=i/0;
		return i;
	}
	catch(Exception e) {
		i=i-20;
		return i;
		
	}finally {
		i=i+10;
		return i;
	}
}
public static void main(String[] args) {
	
	System.out.println(test());
}
}
