package com.ruchika.chauhan.collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayasArrayListTest {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	Integer[] arr= {2,10,3};
	l=Arrays.asList(arr);
	l.set(0,3);
	System.out.println(l);
	l.add(3);
	System.out.print(l);

}
}
/*Arrays.asList() returns a fixed-size list backed by the specified array. Therefore, the arraylist can't grow.
So, when add() is called, an exception is thrown.*/


//Output Is:

/*[3, 10, 3]
Exception in thread "main" java.lang.UnsupportedOperationException
	at java.util.AbstractList.add(Unknown Source)
	at java.util.AbstractList.add(Unknown Source)
	at com.ruchika.chauhan.collectionTest.ArrayasArrayListTest.main(ArrayasArrayListTest.java:14)*/