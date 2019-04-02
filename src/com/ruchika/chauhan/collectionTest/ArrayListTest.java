package com.ruchika.chauhan.collectionTest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	l.add(10);
	l.add(10);
	System.out.print(l.size());
	l.remove(new Integer(10));
	System.out.print(l.size());
	
}
}
/*Output:
21
ArralyList can contain duplicate elements. 
ArrayList remove() method only removes the first occurrence of a matching element.*/
