package org.everything;

public class ExFiveteen {
	
	public static void main(String[] args) {
		
		//literals String 
		
		
		System.out.println("Literals String");
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		
		//Non-literals
		System.out.println("Non-Literals");
		String s3 = new String("Selenium");
		String s4 = new String("Selenium");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		System.out.println("Immutable String");
		String s5 = "Java";
		String s6 = "program";
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));
		s5 = s5.concat(s6);
		System.out.println(s5);
		System.out.println(System.identityHashCode(s5));
		
		System.out.println("Mutable String");
		StringBuffer s7 = new StringBuffer("Selenium");
		StringBuffer s8 = new StringBuffer(" program");
		System.out.println(System.identityHashCode(s7));
		System.out.println(System.identityHashCode(s8));
		s7 = s7.append(s8);
		System.out.println(s7);
		System.out.println(System.identityHashCode(s7));
		
		
		
	}

}
