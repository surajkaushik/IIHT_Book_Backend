package com.core.SpringCoreDemo.ReferenceInjectionTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefInjTest {
	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext("com/core/SpringCoreDemo/ReferenceInjectionTest/RefInjTestCofig.xml");
		StudentDetails s= (StudentDetails)c.getBean("studentDetails");
		System.out.println(s.getStudentName());
		System.out.println(s.getStudentClass());
		System.out.println(s.getStudentCity());
		System.out.println(s.getStudentAge());
		System.out.println(s.getStudentSubjects().getSubject1());
		System.out.println(s.getStudentSubjects().getSubject2());
		System.out.println(s.getStudentSubjects().getSubject3());
		System.out.println(s.getStudentSubjects().getSubject4());
		
		//#Day2 Assignment
		
	}

}
