package com.qspiders;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver 
{ 
	public static void main(String[] args) 
	{
		BeanFactory b=new ClassPathXmlApplicationContext("myconfig.xml");
//		Person p=b.getBean("myperson",Person.class);
		Student s=b.getBean("myStudent",Student.class);
		System.out.println(s.name);
		System.out.println(s.subjects);
		
//		p.message();
//		System.out.println(p.getName());
//		System.out.println(p.getAge());
//		System.out.println(p.getPhone());
//		System.out.println(p.items.get(0));
//		System.out.println(p.items.get(1));
//		System.out.println(p.getMobile().getNumber());
	
}

}
