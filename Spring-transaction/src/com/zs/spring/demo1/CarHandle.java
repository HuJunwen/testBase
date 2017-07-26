package com.zs.spring.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class CarHandle implements InvocationHandler{
	private Object target;
	public CarHandle(Object target) {
		this.target=target;
	}
	/**
	 * 参数:
	 * proxy：被代理的对象
	 * method：被代理对象的方法
	 * args[] 方法的参数
	 * 返回值:object
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		long begen= System.currentTimeMillis();
		System.out.println("汽车开始行驶");
		method.invoke(target);
	    long end = System.currentTimeMillis();
	    System.out.println("汽车结束用时"+(end-begen)+"毫秒");
		return null;
	}
	
	
	public static void main(String[] args) {
		//创建被代理对象
		Car c =new Car();
		//要代理的对象给事件代理类CarHandle
		InvocationHandler invo = new CarHandle(c);
		//获取class对象
		Class<?> invoCalss =c.getClass();
		/**
		 * loader被代理类
		 * interface 被代理类实现接口
		 * h 代理类 CarHandle
		 */
	Moveable m =(Moveable) Proxy.newProxyInstance(invoCalss.getClassLoader(),invoCalss.getInterfaces(),invo);
	m.move();
	}

}
