package com.zs.spring.demo1;
@Description(name = "李四")
public abstract class AccountService {
	@Description( name = "张三")
	public abstract void transfer(String out,String in,Double money);
}
