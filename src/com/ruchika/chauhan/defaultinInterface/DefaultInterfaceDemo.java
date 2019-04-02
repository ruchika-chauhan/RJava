package com.ruchika.chauhan.defaultinInterface;

import java.util.ArrayList;
import java.util.List;

public class DefaultInterfaceDemo implements DefaultDemoInterface{
public static void main(String[] args) {
	List<DefaultInterfaceDemo> list=new ArrayList<>();
	list.add(new DefaultInterfaceDemo());
	list.add(new DefaultInterfaceDemo());
	list.add(new DefaultInterfaceDemo());
	list.add(new DefaultInterfaceDemo());
	list.add(new DefaultInterfaceDemo());
	list.forEach((DefaultDemoInterface d)->d.defaultDemo());
	
	List<Integer> l=new ArrayList<>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.forEach(( h )->System.out.println(h));

}
}
