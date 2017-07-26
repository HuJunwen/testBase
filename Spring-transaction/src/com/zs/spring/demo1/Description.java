package com.zs.spring.demo1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//表示该注解可以修饰的地方 可以包含多个
@Target({ElementType.METHOD,ElementType.TYPE})
//表示该注解 的生命周期
@Retention(RetentionPolicy.RUNTIME)
//表示该注解在生成doc文档的时候保留
@Documented
//表示该注解可以被其他注解继承
@Inherited
public @interface Description {
	String name();
	String age() default "";
	int account() default 100;

}
