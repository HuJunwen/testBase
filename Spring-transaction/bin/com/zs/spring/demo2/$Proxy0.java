package com.zs.spring.demo2;
import java.lang.reflect.Method;
import com.zs.spring.demo2.InvocationHandler;
public class $Proxy0 implements com.zs.spring.demo2.Moveable {
	public $Proxy0(InvocationHandler h) {
		this.h = h;
	}
  private InvocationHandler h;
	@Override
	public void move() {
  try{
  Method md = com.zs.spring.demo2.Moveable.class.getMethod("move");
  h.invoke(this,md);
  }catch(Exception e){ e.printStackTrace();}
	}
}