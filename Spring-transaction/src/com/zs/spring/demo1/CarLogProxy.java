package com.zs.spring.demo1;

public class CarLogProxy implements Moveable{
	private Moveable car;

	public CarLogProxy(Moveable car){
		this.car=car;
	}
	@Override
	public void move() {
		System.out.println("日志开始......");
		car.move();
		System.out.println("日志结束......");
		
	}
}
