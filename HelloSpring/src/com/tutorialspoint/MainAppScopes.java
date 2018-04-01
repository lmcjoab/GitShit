package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppScopes
{
	public static void main(String[] args) 
	{
	      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

	      objA.setMessage("I'm object A");
	      objA.printMessage();

	      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
	      objB.printMessage();
	      
	      context.close();
	}
}
