package com.wsx.demo.exception;

@SuppressWarnings("serial")
public class UserDefinedException extends Exception{
	// �Զ����쳣
	public UserDefinedException(String msg) {
		super(msg);
	}
	
	public UserDefinedException() {
		
	}
}
