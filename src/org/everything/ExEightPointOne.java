package org.everything;

public class ExEightPointOne implements ExEight,ExEightPointTwo {
	
	//multiple Inheritance

	@Override
	public void ruby() {
		System.out.println("Ruby on rails");
	}

	@Override
	public void Kohinoor() {
		System.out.println("England");
	}

	@Override
	public void gold() {
		System.out.println("Chains");
	}

	@Override
	public void diamond() {
		System.out.println("Pendants");
	}

	@Override
	public void platinum() {
		System.out.println("Rings");
	}
	
	public static void main(String[] args) {
		
		ExEightPointOne e9 = new ExEightPointOne();
		
		e9.gold();
		e9.diamond();
		e9.platinum();
		e9.ruby();
		e9.Kohinoor();

	}

}
