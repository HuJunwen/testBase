package com.zs.spring.demo2;

import com.sun.xml.internal.messaging.saaj.util.Base64;

import sun.misc.BASE64Decoder;

public class Test {

 public static void main(String[] args) throws Exception {
//		Car car = new Car();
//		InvocationHandler h = new TimeHandler(car);
//		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class,h);
//		m.move();
	 
	 sun.misc.BASE64Encoder base64Encoder = new sun.misc.BASE64Encoder();
	 String str = base64Encoder.encode("胡君问".getBytes());
	 
	 BASE64Decoder  BASE64Decoders =new BASE64Decoder();
	 
	 byte[] classBytes = BASE64Decoders.decodeBuffer(str);
      String stu = new String(classBytes);
		System.out.println(stu);
	
}

}
