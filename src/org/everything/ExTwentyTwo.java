package org.everything;

public class ExTwentyTwo extends ExTwentyTwoPointOne {
	
		public ExTwentyTwo() {
			//Within the same class use this()
			super();
			System.out.println("Non Parameterized Constructor");
		}
		
		public ExTwentyTwo(int a) {
			super("hariharan");
			System.out.println("Parameterized Constructor");
			System.out.println("The Age is : "+a);
		}		
		
		public static void main(String[] args) {
			
			ExTwentyTwo er1 = new ExTwentyTwo();
			ExTwentyTwo er2 = new ExTwentyTwo(20);
			
		}
}
