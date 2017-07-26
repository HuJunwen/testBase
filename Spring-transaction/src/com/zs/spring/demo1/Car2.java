package com.zs.spring.demo1;

import java.util.Random;

public class Car2  extends Car{

		@Override
		public void move() {
			long begen= System.currentTimeMillis();
			// TODO Auto-generated method stub
			System.out.println("汽车开始行驶");
		    super.move();
			long end = System.currentTimeMillis();
			System.out.println("汽车结束用时"+(end-begen)+"毫秒");
		}

}
