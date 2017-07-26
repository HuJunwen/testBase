package com.zs.spring.demo1;
public class TestCgibl {
	public static void main(String[] args) {
		//创建我们的代理类
		ShipProxy Proxy = new ShipProxy();
		Ship ship = (Ship)Proxy.getProxy(Ship.class);
		ship.travel();
		
	}

}
