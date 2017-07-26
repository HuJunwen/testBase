package com.zs.spring.demo1;

import java.util.Random;

public class Car implements Moveable {

	public Car() {
		// TODO Auto-generated constructor stub
	}
	//行驶方法
	@Override
	public void move() {
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车行驶中");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
