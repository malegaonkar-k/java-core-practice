package org.kc.threds;

public class InvalidUser extends Exception {
	private int errorCode;
	public InvalidUser(String message) {
		super(message);
	}

	public InvalidUser(String message, Throwable cause) {
		super(message,cause);
	}
	
	public InvalidUser(String message,Throwable cause,int errorCode){
		this(message,cause);
		this.errorCode=errorCode;
	}
	public int getErrorCode(){
		return this.errorCode;
	}

}
