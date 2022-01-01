package org.everything;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExEighteen {
	
	public static void main(String[] args) {
		
		Set<Integer> li = new LinkedHashSet<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(20);
		li.add(30);
		
		System.out.println(li);
		
		boolean contains = li.contains(30);
		System.out.println(contains);
		
		li.remove(30);
		System.out.println(li);
		
		li.clear();
		System.out.println(li);
		
	}

}
