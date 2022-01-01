package org.everything;

public class AgeInvalidException extends Exception {
	
	@Override
	public String getMessage() {
		String msg = "Age is not Suitable";
		return msg;
		
	}

}
