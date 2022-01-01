package org.everything;

public class ExSixPointOne extends ExSix {
	
	private void fixedDepsit() {
		System.out.println("The Fixed Deposit pay 7% on your Amount");
	}
	
	@Override
	public void credit() {
		System.out.println("The credit of the HDFC bank is 9%");
	}

	public static void main(String[] args) {
		
		ExSixPointOne e6 = new ExSixPointOne();
		
		e6.savings();
		e6.fixedDepsit();
		e6.credit();
		e6.cibil();
	}
}
