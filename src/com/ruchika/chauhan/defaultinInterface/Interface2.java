package com.ruchika.chauhan.defaultinInterface;

public interface Interface2 {

	void method2();
	default void log() {
		System.out.println("I am the log method of Interface 2 ");
	}
}
