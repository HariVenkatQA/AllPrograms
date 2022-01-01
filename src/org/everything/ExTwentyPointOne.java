package org.everything;

public class ExTwentyPointOne {

	public static void main(String[] args) {
		
		int age = 15;
		
		if (age>=18) {
			System.out.println("Eligible to Vote");
		} else {
			try {
				throw new AgeInvalidException();
			} catch (AgeInvalidException e) {
				
				e.printStackTrace();
			}

		}
	}
	
	
}
