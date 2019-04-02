package com.ruchika.chauhan.collectionTest;

import java.util.*;

public class ListReverseTest {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add("ruchika");
	list.add("rubika");
	list.add("prashant");
	list.add("arpit");
	list.add("maa");
	list.add("paa");
	System.out.println(list);
	Comparator comp = Collections.reverseOrder();
	Collections.sort(list, comp);
	System.out.println(list);
}
}

