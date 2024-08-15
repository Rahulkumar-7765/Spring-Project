package com.jspiders;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver 
{
	public static void main(String[] args) 
	{
		
		BeanFactory b= new ClassPathXmlApplicationContext("myconfig.xml");
		Student s=(Student) b.getBean("myStudent");
		System.out.println(s.name);
		System.out.println(s.subjects);
//		Employee emp = (Employee) b.getBean("myemployee");
//		System.out.println(emp.getName());
//		System.out.println(emp.getAge());
//		System.out.println(emp.getPancard());
//		System.out.println(emp.getExp());
		
		

		
		
	}

}
