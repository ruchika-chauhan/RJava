package com.ruchika.chauhan.defaultinInterface;

public class MyClass implements Interface1,Interface2 {

	@Override
	public void method2() {
		System.out.println("Method Interface 2");
		
	}

	@Override
	public void method1() {
        System.out.println("Method Interface 1");		
		
	}

	@Override
	public void log() {
		System.out.println("override default method");
		Interface1.super.log();
	}
    
	public static void main(String[] args) {
		MyClass m=new MyClass();
		m.log();
	}
	
}
