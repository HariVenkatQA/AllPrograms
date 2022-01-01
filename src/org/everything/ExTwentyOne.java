package org.everything;

public class ExTwentyOne {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		try {
			System.out.println(6/0);
		}
		
		catch (Throwable e) {
			System.out.println("Highest");
		}
//		catch (Exception e) {
//			System.out.println("Exception");
//		}
//		catch (ArithmeticException e) {
//			System.out.println("Dont try to divide by Zero");
//		}


		finally {
			System.out.println("Final Block");
			
		}
		System.out.println(7);
		System.out.println(8);
	}

}
