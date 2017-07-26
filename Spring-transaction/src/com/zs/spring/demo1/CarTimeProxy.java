package com.zs.spring.demo1;

public class CarTimeProxy implements Moveable{
	private Moveable car;

	public CarTimeProxy(Moveable car){
		this.car=car;
	}
	@Override
	public void move() {
		long begen= System.currentTimeMillis();
		System.out.println("汽车开始行驶");
		car.move();
	    long end = System.currentTimeMillis();
		System.out.println("汽车结束用时"+(end-begen)+"毫秒");
		
	}

  public static void main(String[] args) {
	  Car c =new Car();
	  CarLogProxy  clp = new CarLogProxy(c);
	  CarTimeProxy car3 =new CarTimeProxy(clp);
	  car3.move();
}


}
