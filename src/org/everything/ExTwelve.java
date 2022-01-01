package org.everything;

public class ExTwelve {
	
	private void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	private int sub(int a, int b) {
		int c = a-b;
		return c;
	}

	public static void main(String[] args) {
		
		ExTwelve e12 = new ExTwelve();
		e12.add(10, 20);
		int sub = e12.sub(50, 10);
		System.out.println(sub*4);
	}
}
