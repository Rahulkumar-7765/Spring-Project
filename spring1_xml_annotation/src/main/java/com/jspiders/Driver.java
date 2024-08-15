package com.jspiders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Student s=ac.getBean("student",Student.class);
		Student s1=ac.getBean("student",Student.class);
		System.out.println(s.getAge());
		System.out.println(s.getClasss());
		System.out.println(s.getSchool());
		System.out.println("-----------------------------");
//		System.out.println(s.hashCode());
//		System.out.println(s1.hashCode());
	}
	

}
