package org.everything;

public class ExEleven {
	
	public static void main(String[] args) {
		
		//system.exit(0)--->Normal termination of program
		//system.exit(-1)--->Abnormal termination of program
		
		for (int i = 0; i <= 10; i++) {
			
			if (i==5) {
				System.exit(0);
//				continue;
//				break;
			}
			System.out.println(i);
		}
		System.out.println("OutSide of the loop");
	}

}
