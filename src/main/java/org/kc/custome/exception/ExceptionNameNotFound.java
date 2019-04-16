package org.kc.custome.exception;
class ExceptionNameNotFound extends Exception{
	int errorCode;
	
	ExceptionNameNotFound(String message){
		super(message);
	}
	
	ExceptionNameNotFound(String message,Throwable cause){
		super(message,cause);
	}
	
	ExceptionNameNotFound(String message,Throwable cause,int errorCode){
		super(message,cause);
		this.errorCode=errorCode;
	}
	

}
