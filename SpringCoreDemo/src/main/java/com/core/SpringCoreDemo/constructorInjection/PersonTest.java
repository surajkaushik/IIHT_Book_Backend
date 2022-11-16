package com.core.SpringCoreDemo.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext("com/core/SpringCoreDemo/constructorInjection/personConfig.xml");
		Person p1 = (Person) c.getBean("person1");
		Person p2 = (Person) c.getBean("person2");
		Person p3 = (Person) c.getBean("person3");
		Person p4 = (Person) c.getBean("person4");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}
