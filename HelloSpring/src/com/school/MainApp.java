package com.school;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("StudentBeans.xml");

		Student student = (Student) context.getBean("student");
		student.getName();
		student.getAge();
		
		Problematic prob = (Problematic) context.getBean("problem");
		prob.createProblem();

		context.close();
		context.stop();
	}
}
