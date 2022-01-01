package org.everything;

public class ExFive {
	
	private void employeeInfo() {
		System.out.println("Employee Information");
	}
	
	private void employeeInfo(int age) {
		System.out.println("Employee Age : "+age);
	}
	
	private void employeeInfo(long phonenum) {
		System.out.println("Employee PhoneNum : "+phonenum);
	}
	
	private void employeeInfo(String mail, double weight, long accntnum) {
		System.out.println("Employee mail : "+mail);
		System.out.println("Employee Weight : "+weight);
		System.out.println("Employee AccountNumber : "+accntnum);
	}
	
	public static void main(String[] args) {
		
		ExFive e5 = new ExFive();
		e5.employeeInfo();
		e5.employeeInfo(30);
		e5.employeeInfo(99624521299l);
		e5.employeeInfo("ruinprince.17@gmail.com", 86.35, 112456445451l);
		
	}

}
