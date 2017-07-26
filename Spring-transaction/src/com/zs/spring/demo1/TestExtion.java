package com.zs.spring.demo1;

public class TestExtion  extends Exception{
	String value;
	String code="1";
	public TestExtion(String value ,String code,String message) {
		super(message);
		this.value=value;
		this.code=code;
	}

}
