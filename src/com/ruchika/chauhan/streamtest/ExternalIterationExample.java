package com.ruchika.chauhan.streamtest;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExternalIterationExample {
	public static void main(String[] args) {
		List<String> list =Arrays.asList("ruchika","abdklj","nmjhas","uhjgsh","vshas","adasd","bhjgjgs","xkjsxkjh");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toUpperCase());
		}
	}

}
