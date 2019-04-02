package com.ruchika.chauhan.streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InternalItreationExample {
public static void main(String[] args) {
	List<String> list=Arrays.asList("ruchika","abdklj","nmjhas","uhjgsh","vshas","abasd","bhjgjgs","xkjsxkjh");

	//list.forEach(l->System.out.println(l.toUpperCase()));
	//System.out.println(list.stream().findFirst());
	list.stream().filter(l->l.startsWith("ab")).forEach(System.out:: println);
	
}
}
