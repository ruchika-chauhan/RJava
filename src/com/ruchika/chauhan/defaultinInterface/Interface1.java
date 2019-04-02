package com.ruchika.chauhan.defaultinInterface;

public interface Interface1 {

	void method1();
	default void log() {
		System.out.println("I am the log method of Interface 1");
	}
}
