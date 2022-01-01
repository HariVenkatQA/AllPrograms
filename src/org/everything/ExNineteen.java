package org.everything;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExNineteen {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mp = new LinkedHashMap<>();
		
		mp.put(01, "Java");
		mp.put(02, "Selenium");
		mp.put(03, "Python");
		mp.put(04, "Rubyonrails");
		mp.put(05, "pega");
		mp.put(06, "Java");
		
		System.out.println(mp);
		
		boolean containsKey = mp.containsKey(04);
		System.out.println(containsKey);
		
		boolean containsValue = mp.containsValue("Selenium");
		System.out.println(containsValue);
		
		String string = mp.get(03);
		System.out.println(string);
		
		Set<Entry<Integer, String>> entrySet = mp.entrySet();
		System.out.println(entrySet);
		
		//using Enhanced loop
		
		for (Entry<Integer, String> gk : entrySet) {
			
		System.out.println(gk);
		}
		
		
	}

}
