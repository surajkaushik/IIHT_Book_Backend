package com.core.SpringCoreDemo.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext co= new ClassPathXmlApplicationContext("com/core/SpringCoreDemo/constructorInjection/personConfig.xml");
		Person p1 = (Person) co.getBean("person1");
		Person p2 = (Person) co.getBean("person2");
		Person p3 = (Person) co.getBean("person3");
		Person p4 = (Person) co.getBean("person4");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		Addition add= (Addition) co.getBean("addition");
		add.sum();
		
	}

}
