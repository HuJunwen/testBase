package com.zs.spring.demo1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TransactionTest {
	public static void main(String[] args) throws TestExtion{
		try {
			//通过反射获取class类对象
			Class c =Class.forName("com.zs.spring.demo1.AccountServiceImpl");
			if(c.isAnnotationPresent(Description.class)){
			Description d = (Description) c.getAnnotation(Description.class);
			System.out.println(d.name());
			//获取方法上的注解
			Method[] ms = c.getMethods();
			for(Method m : ms ){
				Annotation[] a = m.getAnnotations();
				for(Annotation as: a){
					if(as instanceof Description){
						Description dm =(Description)as;
						System.out.println(d.name());
					}
				}
			}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
