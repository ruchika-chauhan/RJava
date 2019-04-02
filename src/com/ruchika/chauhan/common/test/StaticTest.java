package com.ruchika.chauhan.common.test;
public class StaticTest{
	  static int i=5;
	  public static void main(String[] args) {
	    StaticTest test = null;
	    System.out.println("i value is "+test.i);
	  }
	}
//output is: i value is 5
/*
 * Static variables are related to class and not instance.
Hence the instance value doesnt hold good if a static variable is tried to access.*/

