package com.zs.spring.demo1;

public interface AccountDao {
	
	public void outMoney(String out,Double money);
	
	@Deprecated
	public void inMoney(String in,Double money);
}
