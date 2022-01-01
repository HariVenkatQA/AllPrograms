package org.everything;

public class ExFourPointTwo extends ExFour {
	
	private void dell() {
		System.out.println("Dell Inspiron z");
	}
	
	private void hp() {
		System.out.println("Hp Laptops");
	}
	
	public static void main(String[] args) {
		
		ExFourPointTwo et = new ExFourPointTwo();
		et.onePlus();
		et.nokia();
		et.hp();
		et.dell();
		
	}

}
