package com.ruchika.chauhan.lamda;

public class LamdaDemo {

	public static void main(String[] args) {
		
		
		
		Age age=(i)->{
			return i;
		};
		System.out.println(age.getAge(10));
		AddTwoNos add=(i,j)->{
			int c=i+j;
			return c;
		};
		System.out.println("using addition interface:"+add.addition(10, 20));
	
		Age ag=(i)->  i;
		System.out.println(ag.getAge(96));
		
		FunctionalInterfaceExample fs=()->System.out.println("Hello India");
	     fs.disp();
	  
	}
	
	
}
