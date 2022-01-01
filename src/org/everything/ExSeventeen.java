package org.everything;

import java.util.LinkedList;
import java.util.List;

public class ExSeventeen {
	
	public static void main(String[] args) {
		
		List <Integer> li = new LinkedList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(null);
		
		System.out.println(li);
		
		Integer x = li.get(4);
		System.out.println("The Element 4 is : "+x);
		
		for (int i = 0; i < li.size(); i++) {
			Integer v = li.get(i);
			System.out.println(v);
		}
		
		for (Integer f : li) {
			System.out.println(f);
		}
		
//		List li = new LinkedList();
//		
//		li.add(30);
//		li.add("hari");
//		li.add(30.20);
//		li.add(null);
//		
//		System.out.println(li);
//		
//		int size = li.size();
//		System.out.println("The Size is : "+size);
//		
//		System.out.println(li.size()-1);

		
	}

}
