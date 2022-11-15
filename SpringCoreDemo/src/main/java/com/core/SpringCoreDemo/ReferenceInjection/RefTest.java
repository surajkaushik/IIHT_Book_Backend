package com.core.SpringCoreDemo.ReferenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {
	
	public static void main(String[] args) {
		ApplicationContext contect= new ClassPathXmlApplicationContext("com/core/SpringCoreDemo/ReferenceInjection/RefConfig.xml");
		Object1 t=(Object1) contect.getBean("object1");
		System.out.println(t.getX());
		System.out.println(t.getOb().getNo());
		}

}
