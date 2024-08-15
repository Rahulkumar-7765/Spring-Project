package com.jspiders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver 
{
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(CofigurationClass.class);
//		Employee e1=ac.getBean("employee",Employee.class);
//		System.out.println(e1.getAge());
//		System.out.println(e1.getSalary());
		
		Student s1=ac.getBean("student",Student.class);
		System.out.println(s1.write());
	}
	

}
