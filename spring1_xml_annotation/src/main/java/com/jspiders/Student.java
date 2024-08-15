package com.jspiders;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value(value = "22")
	private int age;
	
	@Value(value = "12")
	private int Classs;
	
	@Value(value = "dsa")
	private String school;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getClasss() {
		return Classs;
	}
	public void setClass(int classs) {
		Classs = classs;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", Class=" + Classs + ", school=" + school + "]";
	}
	
	
	
	

}
