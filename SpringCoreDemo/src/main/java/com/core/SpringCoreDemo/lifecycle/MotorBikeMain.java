package com.core.SpringCoreDemo.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MotorBikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/core/SpringCoreDemo/lifecycle/MotorBike Config.xml");
		MotarBike m1=(MotarBike)context.getBean("bike");
		System.out.println(m1);
		context.registerShutdownHook();
		
		//AbstractApplicationContext---- for destroying 
		//context.registerShutdownHook();
	}

}
